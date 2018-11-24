

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventAdapter0 extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	static final int WIDTH = 300;
	static final int HEIGHT = 200;

	
	EventAdapter0()
	{
		super.setTitle("SwingEventAdapter测试");
		WindowListener wh = new windowhandler();
		addWindowListener(wh);
	}

//    class windowhandler implements WindowListener
//	{
//		@Override
//		public void windowActivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		@Override
//		public void windowClosed(WindowEvent e)  {}
//		
//		@Override
//		public void windowClosing(WindowEvent e)
//		{
//			JPanel panel_1 = new JPanel();
//			panel_1.setLayout(new GridLayout(1, 2));
//			
//			JButton button1=new JButton("确定");
//			JButton button2=new JButton("取消");
//			
//			panel_1.add(button1);
//			panel_1.add(button2);
//			
//			JLabel  label_1 = new JLabel("你能确定关闭了系统了吗？");
//			
//			JDialog dialog_1 = new JDialog((JFrame)e.getSource(),"系统出错了!",true);
//			dialog_1.setSize(200, 100);
//			dialog_1.setLocation(0,0);
//			dialog_1.add(panel_1,"South");
//			dialog_1.add(label_1, "Center");
//			
//			dialog_1.setVisible(true);
//			label_1.setVisible(true);
//			button1.setVisible(true);
//			button2.setVisible(true);
//		}
//		
//		@Override
//		public void windowDeactivated(WindowEvent e) {}
//		@Override
//		public void windowIconified(WindowEvent e) {}
//		@Override
//		public void windowDeiconified(WindowEvent e) {}
//		@Override
//		public void windowOpened(WindowEvent e) {}
//
//	}
	
	
	class windowhandler extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent e)
		{
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(1, 2));
			
			JButton button1=new JButton("确定");
			JButton button2=new JButton("取消");
			
			panel_1.add(button1);
			panel_1.add(button2);
			
			JLabel  label_1 = new JLabel("你能确定关闭了系统了吗？");
			
			JDialog dialog_1 = new JDialog((JFrame)e.getSource(),"系统出错了!",true);
			dialog_1.setSize(200, 100);
			dialog_1.setLocation(0,0);
			dialog_1.add(panel_1,"South");
			dialog_1.add(label_1, "Center");
			
			dialog_1.setVisible(true);
			label_1.setVisible(true);
			button1.setVisible(true);
			button2.setVisible(true);
		}
	}
	
    
	public static void main(String[] args) 
	{
		EventAdapter0 eventAdapterTest = new EventAdapter0();
		eventAdapterTest.setSize(WIDTH, HEIGHT);
		eventAdapterTest.setVisible(true);
	}

	
}



