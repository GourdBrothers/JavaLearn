

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingLabelTest
{
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public  SwingLabelTest()
	{
		prepareGUI();
	}
	
	public static void main(String[] args) 
	{
	    SwingLabelTest swingLabel = new SwingLabelTest();
		swingLabel.showLabel();
	}
	
	private void prepareGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		mainFrame = new JFrame("Java Swing Label Test");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowEvent) 
			{
				System.out.println("DickDickCong");
				System.exit(0);
			}
		});
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		headerLabel = new JLabel("",JLabel.CENTER);
		statusLabel = new JLabel("ÏÂ°à´ò¿¨",JLabel.CENTER);
		
		statusLabel.setSize(50,50);
		
		controlPanel = new JPanel();
		
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		
		mainFrame.setVisible(true);
		
	}
	
	private void showLabel()
	{
		headerLabel.setText("Control in action: JLabel");
		Icon icon=new ImageIcon("123.png");
		
		statusLabel.setIcon(icon);
		statusLabel.setHorizontalTextPosition(JLabel.RIGHT);
		statusLabel.setVerticalTextPosition(JLabel.EAST);
		
		statusLabel.setPreferredSize(new Dimension(400,400));
		
		//statusLabel.setOpaque(true);
		
		JLabel jlabel = new JLabel("",JLabel.CENTER);
		jlabel.setText("Welcome to Swing Label Test");
		jlabel.setOpaque(true);
		jlabel.setBackground(Color.gray);
		jlabel.setForeground(Color.WHITE);
		controlPanel.add(jlabel);
		
		
		//mainFrame.pack();
		mainFrame.setVisible(true);
	}

}
