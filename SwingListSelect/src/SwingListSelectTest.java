
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;





public class SwingListSelectTest implements ListSelectionListener
{
    JList list = null;
    JLabel label = null;
    String[] str = {"����","�ձ�","�й�","Ӣ��","����","�����","����","����"};
    
    
	SwingListSelectTest()
	{
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		label = new JLabel();
		list = new JList(str);
		list.setVisibleRowCount(5);
		list.setBorder(BorderFactory.createTitledBorder("��ѡ����ң�"));
		list.addListSelectionListener(this);
		
		contentPane.add(label,BorderLayout.NORTH);
		contentPane.add(new JScrollPane(list),BorderLayout.SOUTH);
		
		f.pack();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		}
		);
		
		
	}
	
	public static void main(String[] args) 
	{
		new SwingListSelectTest();

	}

	@Override
	public void valueChanged(ListSelectionEvent e)
	{
		int tmp = 0;
		String stmp = "��ѡ��";
        int index[] = list.getSelectedIndices();
        
        for(int i=0;i<index.length;i++)
        {
        	tmp = index[i];
        	stmp = stmp +str[tmp]+"  ";
        }
        label.setText(stmp);
		
	}

}
