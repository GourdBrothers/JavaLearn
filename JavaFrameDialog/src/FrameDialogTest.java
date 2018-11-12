


/*
 创建图形化界面思路：
1.创建frame窗体；
2.对窗体进行基本设置；
       比如大小、位置、布局
3.定义组件；
4.将组件通过add方法添加到窗体中；
5.让窗体显示，通过setVisible(ture)
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
		// Frame实例化与相关设定 
		theFrame = new JFrame("Frame: 滴！滴滴!");           // 设定标题
		ImageIcon  sicon = new ImageIcon("123.png");      // 设定标题图标
		theFrame.setIconImage(sicon.getImage());
		theFrame.getContentPane().setVisible(false);      // 设定背景颜色
		theFrame.setBackground(Color.LIGHT_GRAY);
		theFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //窗口关闭时释放资源
		theFrame.setSize(500, 300);                       // 设定大小
		theFrame.setLocation(1366/2-500/2, 768/2-300/2);  // 设定居中
		theFrame.setVisible(true);                        // 打开显示
		
		
		// Dialog实例化与相关设定
		theDialog = new JDialog(theFrame,"Dialog: 上车！！"); // 设定标题
		theDialog.getContentPane().setVisible(false);      // 设定背景颜色
		theDialog.setBackground(Color.BLUE);
		theDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //窗口关闭时释放资源
		theDialog.setSize(200, 100);                       // 设定大小
		theDialog.setLocation(1366/2-200/2, 768/2-100/2);  // 设定居中
		theDialog.setVisible(true);                        // 打开显示
		
	}

}
