/*
 * Button,RadioButton,CheckBox,Label ���ۺ�Ӧ��ʵ��
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
		frame.setTitle("���ఴ������Ĳ�������");
		frame.setSize(WIDTH,HEIGHT);
		frame.setContentPane(this);
		
		
		JLabel labelName = new JLabel("�ε�");
		this.add(labelName);
		
		
		JRadioButton jr1 = new JRadioButton("��");
		JRadioButton jr2 = new JRadioButton("Ů");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup .add(jr1);
		buttonGroup .add(jr2);
		
		this.add(jr1);
		this.add(jr2);

		
		JLabel interesting = new JLabel("��Ȥ����");
		JCheckBox jcb1 = new JCheckBox("��ë��");
		JCheckBox jcb2 = new JCheckBox("����");
		JCheckBox jcb3 = new JCheckBox("������");
		JCheckBox jcb4 = new JCheckBox("��ѧ��");
		JCheckBox jcb5 = new JCheckBox("��Ӱ");
		JCheckBox jcb6 = new JCheckBox("¼��");
		
		this.add(interesting);
		this.add(jcb1);
		this.add(jcb2);
		this.add(jcb3);
		this.add(jcb4);
		this.add(jcb5);
		this.add(jcb6);
		
		
		JButton jbutton1 = new JButton("����һ����ť");
		this.add(jbutton1);
		jbutton1.setBackground(Color.YELLOW);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new SwingButtonsApp();
	}

}
