package Threads;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {//thread
		// TODO Auto-generated method stub
		book bk=new book();
		bk.start();//thread
		if(bk.isAlive())
		{
			System.out.println("still working");
		}
		note nt=new note();
		Thread th=new Thread(nt);
		//new Runnable() {
//			public void run() {
//				
//			}
//		}
		th.start();//thread
		bk.join();
		th.join();
		bk.setName("book process");
		System.out.println(bk.getName());
		System.out.println(th.getPriority());
		System.out.println("End of the program");
	}

}

class book extends Thread
{
public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("JK-Rowling");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
class note implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
