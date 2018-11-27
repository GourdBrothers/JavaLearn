
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;





public class SwingListSelectTest implements ListSelectionListener
{
    JList list = null;
    JLabel label = null;
    String[] str = {"美国","日本","中国","英国","法国","意大利","澳洲","韩国"};
    
    
	SwingListSelectTest()
	{
		JFrame f = new JFrame("JList");
		Container contentPane = f.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		label = new JLabel();
		list = new JList(str);
		list.setVisibleRowCount(5);
		list.setBorder(BorderFactory.createTitledBorder("请选择国家："));
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
		String stmp = "已选择：";
        int index[] = list.getSelectedIndices();
        
        for(int i=0;i<index.length;i++)
        {
        	tmp = index[i];
        	stmp = stmp +str[tmp]+"  ";
        }
        label.setText(stmp);
		
	}

}
