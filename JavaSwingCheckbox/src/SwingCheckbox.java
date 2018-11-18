/*
 * swing CheckBox 创建
 * 
 * 
 */

import javax.swing.*;

public class SwingCheckbox 
{

	static final int WIDTH = 300;
	static final int HEIGHT = 200;
	
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Swing Checkbox 测试程序");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
		JCheckBox Jcb1 = new JCheckBox("羽毛球");
		JCheckBox Jcb2 = new JCheckBox("足球");
		JCheckBox Jcb3 = new JCheckBox("电脑书");
		JCheckBox Jcb4 = new JCheckBox("数学书");
		JCheckBox Jcb5 = new JCheckBox("电影");
		JCheckBox Jcb6 = new JCheckBox("录象");
		
		contentPane.add(Jcb1);
		contentPane.add(Jcb2);
		contentPane.add(Jcb3);
		contentPane.add(Jcb4);
		contentPane.add(Jcb5);
		contentPane.add(Jcb6);
		
	}

}
