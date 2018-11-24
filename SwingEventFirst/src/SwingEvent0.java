

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class SwingEvent0 
{
	static final int WIDTH = 300;
	static final int HEIGHT = 200;
	static JTextField textField = new JTextField(20);

	public static void main(String[] args) 
	{
		JFrame jf = new JFrame("Swing事件测试");
		jf.setSize(WIDTH, HEIGHT);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setVisible(true);
		
		JPanel  contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		jf.setContentPane(contentPane);
		
		JButton button1 =new JButton("清空文字区内容");
		
		contentPane.add(textField,"North");
		contentPane.add(button1,"South");
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
			}
		});

//		ActionListener acListener = new myActionHandler();
//		button1.addActionListener(acListener);
	
		jf.setVisible(true);
		
	}

}


//class myActionHandler implements ActionListener
//{
//	public void actionPerformed(ActionEvent e)
//	{
//		 new SwingEvent0().textField.setText("");
//	}
//
//}

