

import java.util.LinkedList;

public class LinkedListTest
{

	public static void main(String[] args) 
	{
	    LinkedList<String> lList = new LinkedList<String>();
	    
	    lList.add("papa1");
	    lList.add("papa2");
	    lList.add("papa3");
	    lList.add("papa4");
	    lList.add("papa5");
	    System.out.println(lList);
	    
	    lList.addFirst("Â¥µÀpapapa");
	    System.out.println(lList);
	    
	    lList.addLast("³ø·¿papapa");
	    System.out.println(lList);
	    
	    lList.remove("papa1");
	    System.out.println("remove \"papa1\" from the lList:"+lList);
	    
	    System.out.println("Get lList First element:" + lList.getFirst());
	    
	    System.out.println("Get lList Last element:" + lList.getLast());
	    
	}

}
