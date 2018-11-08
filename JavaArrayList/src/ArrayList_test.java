/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList_test 
{

	public static void main(String[] args) 
	{
		// ����һ���յ������������list,�������String���͵�����
		System.out.println("Creating the list.");
		ArrayList<String> list = new ArrayList<String>();
		
		// ��������Ƿ�Ϊ��
		boolean checkEmpty = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + checkEmpty);

		// ���Ԫ�ص�list��
		System.out.println("Adding items to the list.");
		list.add("Di_1");
		list.add("Di_2");
		list.add(2,"Di_3");
		list.add("Di_4");
		
		// ��ʾ���������е�����
		System.out.println("The arraylist contains the follwing elements: " + list +'.');
		
		// ���Ԫ�������������е�λ��
		int pos = list.indexOf("Di_2");
		System.out.println("The index of Di_2 is: " + pos);
		
		// ��ȡָ��λ�õ�Ԫ��
		String item = list.get(1);
		System.out.println("The item in the list at index 1 is: "+ item);
		
		// ���� list �е�Ԫ��,����1������С��forѭ����ȡ
		System.out.println("Getting all items use for ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// ���� list �е�Ԫ��,����2��foreach ѭ��
		System.out.println("Getting all items use foreach.");
		for(String str : list) 
		{
			System.out.println("Item is: " + str);
		}
		
		// ���� list �е�Ԫ��,����3��ʹ�õ�����
		// hasNext(): ����true��ʾ���������л���Ԫ��
		// next(): ������һ��Ԫ�� 
		System.out.println("Getting all items use iterator.");
		Iterator<String> it = list.iterator();
		//for(;it.hasNext();)
		while(it.hasNext())
		{
			System.out.println("Item is: " + it.next());
		}
		
		// �滻Ԫ��
		list.set(1, "Np");
		System.out.println("Getting all items after excahng.");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// �Ƴ�Ԫ��
		list.remove(0);
		System.out.println("Getting all items after remove.");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// ת�� Arraylist Ϊ  Array 
		String simpleArray[] = new String[list.size()];
		simpleArray = list.toArray(simpleArray);
		System.out.println("The array created after the conversion of our arraylist is: " + Arrays.toString(simpleArray));
		
	}

}
