package test06;

class Colors implements Runnable
{
	String color[] = {"White", "Black", "Red", "Blue", "Green"};
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(color[i]);
		}
	}
}

public class MultiThreadiiing 
{
	public static void main(String[] args)
	{
		Colors clr = new Colors();
		
		Thread t1 = new Thread(clr);
		Thread t2 = new Thread(clr);
		Thread t3 = new Thread(clr);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
