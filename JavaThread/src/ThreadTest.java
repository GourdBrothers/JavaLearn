/*
 *   线程的创建有两种实现方法
 *   1. java.lang.Thread 类的继承
 *   2. java.lang.Runnable 接口的实现
 *   
 */

public class ThreadTest {

	public static void main(String[] args)
	{

		TaskA task_A = new TaskA();
		TaskB task_B = new TaskB();

		new Thread(task_A).start();
	    new Thread(task_B).start();

	}

	// 实现方法 1. java.lang.Runnable 接口的实现
	private static class TaskA implements Runnable 
	{
		private int countA = 0;

		public void run() {

			while (true) {

				try {
					System.out.println("taskA:" + countA);
					countA++;
					Thread.sleep(500);
				} catch (InterruptedException errCode) {
					errCode.printStackTrace();
				}

			}
		}
	}

	// 实现方法 2. java.lang.Thread 类的继承
	private static class TaskB extends Thread 
	{

		private int countB = 0;
		public void run() {

			
			while (true) {
				try {
					System.out.println("taskB:" + countB);
					countB++;
					Thread.sleep(500);
				} catch (InterruptedException errCode) {
					errCode.printStackTrace();
				}
			}
		}
	}

}
