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
		// 创建一个空的数组链表对象list,用来存放String类型的数据
		System.out.println("Creating the list.");
		ArrayList<String> list = new ArrayList<String>();
		
		// 检查链表是否为空
		boolean checkEmpty = list.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + checkEmpty);

		// 添加元素到list中
		System.out.println("Adding items to the list.");
		list.add("Di_1");
		list.add("Di_2");
		list.add(2,"Di_3");
		list.add("Di_4");
		
		// 显示数组链表中的内容
		System.out.println("The arraylist contains the follwing elements: " + list +'.');
		
		// 检查元素在数组链表中的位置
		int pos = list.indexOf("Di_2");
		System.out.println("The index of Di_2 is: " + pos);
		
		// 获取指定位置的元素
		String item = list.get(1);
		System.out.println("The item in the list at index 1 is: "+ item);
		
		// 遍历 list 中的元素,方法1，按大小来for循环获取
		System.out.println("Getting all items use for ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// 遍历 list 中的元素,方法2，foreach 循环
		System.out.println("Getting all items use foreach.");
		for(String str : list) 
		{
			System.out.println("Item is: " + str);
		}
		
		// 遍历 list 中的元素,方法3，使用迭代器
		// hasNext(): 返回true表示链表链表中还有元素
		// next(): 返回下一个元素 
		System.out.println("Getting all items use iterator.");
		Iterator<String> it = list.iterator();
		//for(;it.hasNext();)
		while(it.hasNext())
		{
			System.out.println("Item is: " + it.next());
		}
		
		// 替换元素
		list.set(1, "Np");
		System.out.println("Getting all items after excahng.");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// 移除元素
		list.remove(0);
		System.out.println("Getting all items after remove.");
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Item at index " + i + " is " + list.get(i));
		}
		
		// 转换 Arraylist 为  Array 
		String simpleArray[] = new String[list.size()];
		simpleArray = list.toArray(simpleArray);
		System.out.println("The array created after the conversion of our arraylist is: " + Arrays.toString(simpleArray));
		
	}

}
