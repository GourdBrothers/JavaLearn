

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import java.awt.*;

public class EventFocus0 extends JFrame implements FocusListener
{
	private static final long serialVersionUID = 1L;
	
	List info = new List(10);
	JTextField textField = new JTextField("");
	JButton button1 = new JButton("ȷ��");
	
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
			info.add("��ʱ�Ի��");
		}else {
			info.add("�����Ի��");
		}
	}
	
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.isTemporary()) {
			info.add("��ʱ��ʧȥ");
		}else {
			info.add("������ʧȥ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		EventFocus0  test =new EventFocus0("���Դ���");
		test.pack();
		test.setVisible(true);
	}

}
