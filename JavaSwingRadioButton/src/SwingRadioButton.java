
/*
 * swing RadioButton 创建
 * 
 */
import javax.swing.*;

public class SwingRadioButton 
{

	static final int WIDTH = 300;
	static final int HEIGHT = 200;
	
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Swing RadioButton 测试程序");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);

		// 第一个按键组
		JRadioButton jr1 = new JRadioButton("忽略");
		JRadioButton jr2 = new JRadioButton("继续");
		JRadioButton jr3 = new JRadioButton("跳过");
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		bg1.add(jr3);
		
		contentPane.add(jr1);
		contentPane.add(jr2);
		contentPane.add(jr3);
		
		// 第二个按键组
		JRadioButton jr4 = new JRadioButton("汇编语言");
		JRadioButton jr5 = new JRadioButton("C/C++语言");
		JRadioButton jr6 = new JRadioButton("JAVA语言");
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(jr4);
		bg2.add(jr5);
		bg2.add(jr6);
		
		contentPane.add(jr4);
		contentPane.add(jr5);
		contentPane.add(jr6);
		
	}

}
