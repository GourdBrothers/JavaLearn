
import java.util.Date;

public class DateTest 
{
	public static void main(String[] args) 
	{
		Date date = new Date();
		
		String str = String.format("%tc", date);
		System.out.println("现在时间是: "+str);
		
		String day = String.format("%tj", date);
		System.out.println("今天是一年中的第"+day+"天");
		
		day = String.format("%td", date);
		System.out.println("今天是一月中的第"+day+"天");
		
	}
}
