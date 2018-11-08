
public class ArrayTest
{

	public static void main(String[] args) 
	{
		int size = 10;
		char myList[] = new char[size];
		
		System.out.println("myList length is:"+myList.length);
		
		for(int i=0;i<size;i++)
		{
	        myList[i] =(char)i ;
	        myList[i] += 0x30;
	        System.out.format("%c ",myList[i]);
		}
		
		String a = "hello2";   
        final String b = "hello"; 
        String d = "hello"; 
        String c = b + 2;   
        String e = d + 2; 
        System.out.println((a == c)); 
        System.out.println((a == e));
		
	}

}
