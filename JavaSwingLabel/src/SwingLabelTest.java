
// ��ǩ�Ĵ�������
// 

import javax.swing.*;

public class SwingLabelTest
{
	static final int WIDTH = 300;
	static final int HEIGHT = 200;

	public static void main(String[] args)
	{
		JFrame jf = new JFrame("Swing Label���Գ���");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setVisible(true);
		
		JPanel contenrPane = new JPanel();
		jf.setContentPane(contenrPane);
		
		//JLabel label1 = new JLabel("����һ����ǩ���Գ���");
		//JLabel label2 = new JLabel("����һ�����ɱ༭�ı�ǩ�ؼ�");
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		label1.setText("��ǩ��������ʶĳ���ؼ��Ŀؼ�");
		label2.setText("��ǩ��������ʶ˵�����ļ��Ŀؼ�");
		
		contenrPane.add(label1);
		contenrPane.add(label2);
		
		jf.setVisible(true);
		
	}

}
