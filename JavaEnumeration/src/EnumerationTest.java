


/*
 * boolean hasMoreElements( ) ���Դ�ö���Ƿ���������Ԫ�ء�
 * Object nextElement( ) �����ö�ٶ������ٻ���һ�����ṩ��Ԫ�أ��򷵻ش�ö�ٵ���һ��Ԫ�ء�
 */

import java.util.Vector;
import java.util.Enumeration;


public class EnumerationTest 
{

	public static void main(String[] args) 
	{
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wedneday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		
		days = dayNames.elements();
		
		while(days.hasMoreElements()) 
		{
			System.out.println(days.nextElement());
		}
		
	}

}
