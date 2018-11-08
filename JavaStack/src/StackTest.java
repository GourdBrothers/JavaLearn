
// 自定义栈插入数据与取出数据

public class StackTest
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	// 构造函数
	public StackTest(int size)
	{
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	// 入栈
	public void push(long value)
	{
		if(top<maxSize) {
		   stackArray[++top] = value;
		   System.out.println("after push top is:"+top);
		}else {
		   System.out.println("stackArray is full!");
		}
	}
	
	// 出栈
	public long pop()
	{
		System.out.println("before push top is:" + top);
		long tempOut = stackArray[top--];
		return tempOut;
	}
	
	// 读取栈顶
	public long peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top== maxSize - 1);
	}

	public static void main(String[] args)
	{
		StackTest theStack = new StackTest(3);

		System.out.println("theStack is empty? "+ theStack.isEmpty());

		theStack.push(1);
		theStack.push(2);
		theStack.push(3);

		System.out.println("theStack is full? "+ theStack.isFull());

		System.out.println("pop value :"+ theStack.pop());
		System.out.println("pop value :"+ theStack.pop());
		System.out.println("pop value :"+ theStack.pop());
		
	}

}
