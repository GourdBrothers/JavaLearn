/*
 * swing CheckBox ����
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
		JFrame jf = new JFrame("Swing Checkbox ���Գ���");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
		JCheckBox Jcb1 = new JCheckBox("��ë��");
		JCheckBox Jcb2 = new JCheckBox("����");
		JCheckBox Jcb3 = new JCheckBox("������");
		JCheckBox Jcb4 = new JCheckBox("��ѧ��");
		JCheckBox Jcb5 = new JCheckBox("��Ӱ");
		JCheckBox Jcb6 = new JCheckBox("¼��");
		
		contentPane.add(Jcb1);
		contentPane.add(Jcb2);
		contentPane.add(Jcb3);
		contentPane.add(Jcb4);
		contentPane.add(Jcb5);
		contentPane.add(Jcb6);
		
	}

}
