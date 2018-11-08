
/**
 * createtime : 2018年6月1日 上午9:47:36
 */
 
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TooManyListenersException;
 
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
 
/**
 * @author XWF
 */
public final class UartMain {
	
	private static SerialPort serialPort;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//获得系统端口列表
		ArrayList<String> portNum = getSystemPort();

		if(portNum.isEmpty()==true) {
			System.out.println("没有找到一个串口");
			
		}else {
			//开启端口，波特率115200
			serialPort = openSerialPort(portNum.get(1),115200);
	        // 启动发送线程
	        UartSendTask task_send = new UartSendTask();
	        new Thread(task_send).start();
		}

	}
	
	
	private static class UartSendTask extends Thread
	{
		// 接收事件回调函数
		private static SerialPortEventListener CB_serialPortEventListener = new SerialPortEventListener()
		{
		     public void serialEvent(SerialPortEvent arg0) 
			 {
		    	System.out.println("串口回调事件："+arg0.getEventType());
		    	
				if(arg0.getEventType() == SerialPortEvent.DATA_AVAILABLE) 
				{
					byte[] bytes = UartMain.readData(serialPort);
					System.out.println("收到的数据长度："+bytes.length);
					System.out.println("收到的数据："+new String(bytes));
				}
				
				if(arg0.getEventType() == SerialPortEvent.OUTPUT_BUFFER_EMPTY) 
				{
					System.out.println("发送缓冲区空");
				}
				
			}
	    };
		
		UartSendTask()
		{
			// 注册回调函数事件
			setListenerToSerialPort( serialPort,CB_serialPortEventListener);
			String s = "papapa\n";
			byte[] bytes = s.getBytes();
			sendData(serialPort, bytes);//发送数据
		}
		
		// 
		public void run() 
		{
			int i = 1;
			while(i<50) 
			{
				String s = "papapa\n";
				byte[] bytes = s.getBytes();
				sendData(serialPort, bytes);//发送数据
				i++;
				try 
				{
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			closeSerialPort(serialPort);
		}
		
	}
	
	
//======================================================================================================
//==== 下面的函数提供了查找，打开，关闭，读，写，和回调事件注册设定的相关函数
	
	/**
	 * 获得系统可用的端口名称列表
	 * @return 可用端口名称列表
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<String> getSystemPort()
	{
		ArrayList<String> systemPorts = new ArrayList<>();
		//获得系统可用的端口
		Enumeration<CommPortIdentifier> portList = CommPortIdentifier.getPortIdentifiers();
		String portName;
		while(portList.hasMoreElements()) 
		{
			portName = portList.nextElement().getName(); //获得端口的名字
			systemPorts.add(portName);
		}
		
		System.out.println("系统可用端口列表："+systemPorts);
		return systemPorts;
	}
	
	/**
	 * 开启串口
	 * @param serialPortName 串口名称
	 * @param baudRate 波特率
	 * @return 串口对象
	 */
	public static SerialPort openSerialPort(String serialPortName,int baudRate)
	{
		try {
			//通过端口名称得到端口
			CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(serialPortName);
			//打开端口，（自定义名字，打开超时时间）
			CommPort commPort = portIdentifier.open(serialPortName, 2222);
			//判断是不是串口
            if (commPort instanceof SerialPort) {
                SerialPort serialPort = (SerialPort) commPort;
                //设置串口参数（波特率，数据位8，停止位1，校验位无）
                serialPort.setSerialPortParams(baudRate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);                              
                System.out.println("开启串口成功，串口名称："+serialPortName);
                return serialPort;
            }        
            else {
                //是其他类型的端口
                throw new NoSuchPortException();
            }
		} catch (NoSuchPortException e) {
			System.out.println("没有这个串口");
			e.printStackTrace();
		} catch (PortInUseException e) {
			System.out.println("串口被占用");
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			System.out.println("未知异常");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 关闭串口
	 * @param serialPort 要关闭的串口对象
	 */
	public static void closeSerialPort(SerialPort serialPort) 
	{
	    if( serialPort != null ) {
		    serialPort.close();
			System.out.println("关闭了串口："+serialPort.getName());
			serialPort = null;
		}
	}
 
	/**
	 * 向串口发送数据
	 * @param serialPort 串口对象 
	 * @param data 发送的数据
	 */
	public static void sendData(SerialPort serialPort, byte[] data)
	{
		OutputStream os = null;
        try {
        	os = serialPort.getOutputStream();//获得串口的输出流
        	os.write(data);
        	os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                	os.close();
                	os = null;
                }                
            } catch (IOException e) {
            	e.printStackTrace();
            }
        }
	}
	
	/**
	 * 从串口读取数据
	 * @param serialPort 要读取的串口
	 * @return 读取的数据
	 */
	public static byte[] readData(SerialPort serialPort) 
	{
		InputStream is = null;
        byte[] bytes = null;
        try {
        	is = serialPort.getInputStream();//获得串口的输入流
            int bufflenth = is.available();//获得数据长度
            while (bufflenth != 0) {                             
                bytes = new byte[bufflenth];//初始化byte数组
                is.read(bytes);
                bufflenth = is.available();
            } 
        } catch (IOException e) {
        	e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                	is.close();
                	is = null;
                }
            } catch(IOException e) {
            	e.printStackTrace();
            }
        }
        return bytes;
	}
	
	/**
	 * 给串口设置监听
	 * @param serialPort
	 * @param listener
	 */
	public static void setListenerToSerialPort(SerialPort serialPort, SerialPortEventListener listener) 
	{
		try {
			//给串口添加事件监听
			serialPort.addEventListener(listener);
			serialPort.notifyOnDataAvailable(true);  // 串口有数据监听
			serialPort.notifyOnBreakInterrupt(true); // 中断事件监听
			//serialPort.notifyOnOutputEmpty(true);  // 发送缓冲区空监听
		} catch (TooManyListenersException e) {
			e.printStackTrace();
		}

	}
	
}
