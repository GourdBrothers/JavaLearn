
/*
 * swing RadioButton ����
 * 
 */
import javax.swing.*;

public class SwingRadioButton 
{

	static final int WIDTH = 300;
	static final int HEIGHT = 200;
	
	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Swing RadioButton ���Գ���");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);

		// ��һ��������
		JRadioButton jr1 = new JRadioButton("����");
		JRadioButton jr2 = new JRadioButton("����");
		JRadioButton jr3 = new JRadioButton("����");
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		bg1.add(jr3);
		
		contentPane.add(jr1);
		contentPane.add(jr2);
		contentPane.add(jr3);
		
		// �ڶ���������
		JRadioButton jr4 = new JRadioButton("�������");
		JRadioButton jr5 = new JRadioButton("C/C++����");
		JRadioButton jr6 = new JRadioButton("JAVA����");
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(jr4);
		bg2.add(jr5);
		bg2.add(jr6);
		
		contentPane.add(jr4);
		contentPane.add(jr5);
		contentPane.add(jr6);
		
	}

}
