
import java.util.Date;

public class DateTest 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		
		String str = String.format("%tc", date);
		System.out.println("����ʱ����: "+str);
		
		String day = String.format("%tj", date);
		System.out.println("������һ���еĵ�"+day+"��");
		
		day = String.format("%td", date);
		System.out.println("������һ���еĵ�"+day+"��");
		
	}
}
