


/*
 ����ͼ�λ�����˼·��
1.����frame���壻
2.�Դ�����л������ã�
       �����С��λ�á�����
3.���������
4.�����ͨ��add������ӵ������У�
5.�ô�����ʾ��ͨ��setVisible(ture)
 */

import java.awt.Color;
//import java.awt.Graphics;

import javax.swing.*;

public class FrameDialogTest
{
	public static JFrame theFrame;
    public static JDialog theDialog;
    
//    public void FunFramePaint(Graphics grap) 
//    {
//    	
//    }
//	
	public static void main(String[] args)
	{
		// Frameʵ����������趨 
		theFrame = new JFrame("Frame: �Σ��ε�!");           // �趨����
		ImageIcon  sicon = new ImageIcon("123.png");      // �趨����ͼ��
		theFrame.setIconImage(sicon.getImage());
		theFrame.getContentPane().setVisible(false);      // �趨������ɫ
		theFrame.setBackground(Color.LIGHT_GRAY);
		theFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //���ڹر�ʱ�ͷ���Դ
		theFrame.setSize(500, 300);                       // �趨��С
		theFrame.setLocation(1366/2-500/2, 768/2-300/2);  // �趨����
		theFrame.setVisible(true);                        // ����ʾ
		
		
		// Dialogʵ����������趨
		theDialog = new JDialog(theFrame,"Dialog: �ϳ�����"); // �趨����
		theDialog.getContentPane().setVisible(false);      // �趨������ɫ
		theDialog.setBackground(Color.BLUE);
		theDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //���ڹر�ʱ�ͷ���Դ
		theDialog.setSize(200, 100);                       // �趨��С
		theDialog.setLocation(1366/2-200/2, 768/2-100/2);  // �趨����
		theDialog.setVisible(true);                        // ����ʾ
		
	}

}
