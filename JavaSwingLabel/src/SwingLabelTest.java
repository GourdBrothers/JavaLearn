
// 标签的创建方法
// 

import javax.swing.*;

public class SwingLabelTest
{
	static final int WIDTH = 300;
	static final int HEIGHT = 200;

	public static void main(String[] args)
	{
		JFrame jf = new JFrame("Swing Label测试程序");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setVisible(true);
		
		JPanel contenrPane = new JPanel();
		jf.setContentPane(contenrPane);
		
		//JLabel label1 = new JLabel("这是一个标签测试程序");
		//JLabel label2 = new JLabel("这是一个不可编辑的标签控件");
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		label1.setText("标签是用来标识某个控件的控件");
		label2.setText("标签是用来标识说明性文件的控件");
		
		contenrPane.add(label1);
		contenrPane.add(label2);
		
		jf.setVisible(true);
		
	}

}
