

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import java.awt.*;

public class EventFocus0 extends JFrame implements FocusListener
{
	private static final long serialVersionUID = 1L;
	
	List info = new List(10);
	JTextField textField = new JTextField("");
	JButton button1 = new JButton("确认");
	
	public EventFocus0(String title) 
	{
		super(title);
		add(info,"North");
		add(textField,"Center");
		add(button1,"South");
		textField.addFocusListener(this);
	}
	
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.isTemporary()) {
			info.add("暂时性获得");
		}else {
			info.add("永久性获得");
		}
	}
	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.isTemporary()) {
			info.add("暂时性失去");
		}else {
			info.add("永久性失去");
		}
	}
	
	
	public static void main(String[] args) 
	{
		EventFocus0  test =new EventFocus0("测试窗口");
		test.pack();
		test.setVisible(true);
	}

}
