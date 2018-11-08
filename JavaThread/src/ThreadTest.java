/*
 *   �̵߳Ĵ���������ʵ�ַ���
 *   1. java.lang.Thread ��ļ̳�
 *   2. java.lang.Runnable �ӿڵ�ʵ��
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

	// ʵ�ַ��� 1. java.lang.Runnable �ӿڵ�ʵ��
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

	// ʵ�ַ��� 2. java.lang.Thread ��ļ̳�
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
