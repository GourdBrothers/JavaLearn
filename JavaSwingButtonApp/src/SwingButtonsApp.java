/*
 * Button,RadioButton,CheckBox,Label 的综合应用实例
 * 
 * 
 * 
 * 
 */

import java.awt.Color;

import javax.swing.*;


public class SwingButtonsApp extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static final int WIDTH = 300;
	static final int HEIGHT = 200;
	
	public SwingButtonsApp() 
	{
		JFrame frame = new JFrame();
		frame.setTitle("各类按键组件的测试用例");
		frame.setSize(WIDTH,HEIGHT);
		frame.setContentPane(this);
		
		
		JLabel labelName = new JLabel("滴滴");
		this.add(labelName);
		
		
		JRadioButton jr1 = new JRadioButton("男");
		JRadioButton jr2 = new JRadioButton("女");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup .add(jr1);
		buttonGroup .add(jr2);
		
		this.add(jr1);
		this.add(jr2);

		
		JLabel interesting = new JLabel("兴趣爱好");
		JCheckBox jcb1 = new JCheckBox("羽毛球");
		JCheckBox jcb2 = new JCheckBox("足球");
		JCheckBox jcb3 = new JCheckBox("电脑书");
		JCheckBox jcb4 = new JCheckBox("数学书");
		JCheckBox jcb5 = new JCheckBox("电影");
		JCheckBox jcb6 = new JCheckBox("录象");
		
		this.add(interesting);
		this.add(jcb1);
		this.add(jcb2);
		this.add(jcb3);
		this.add(jcb4);
		this.add(jcb5);
		this.add(jcb6);
		
		
		JButton jbutton1 = new JButton("这是一个按钮");
		this.add(jbutton1);
		jbutton1.setBackground(Color.YELLOW);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new SwingButtonsApp();
	}

}
