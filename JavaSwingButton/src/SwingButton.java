
/*
 * swing button ��������
 * 
 * 
 */

import javax.swing.*;

public class SwingButton 
{
    static final int WIDTH  = 300;
    static final int HEIGHT = 300;
	
	public static void main(String[] args)
	{
		JFrame jf = new JFrame("Swing Button���Գ���");
		jf.setSize(WIDTH,HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
		JButton b1 = new JButton("ȷ��");
		JButton b2 = new JButton("ȡ��");
		
		contentPane.add(b1);
		contentPane.add(b2);
		
	}

}
