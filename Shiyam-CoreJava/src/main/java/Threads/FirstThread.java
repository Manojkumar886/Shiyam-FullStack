package Threads;

public class FirstThread implements Runnable
{
	public void run()
	{
		System.out.println("Shiyam is Iron man");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft=new FirstThread();
		Thread th=new Thread(ft);
		th.start();//thread
		

	}

}
