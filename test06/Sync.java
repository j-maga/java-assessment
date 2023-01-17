package test06;

class Color implements Runnable
{
	String color[] = {"White", "Black", "Red", "Blue", "Green"};
	
	synchronized public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(color[i]);
		}
	}
}

public class Sync 
{
	public static void main(String[] args)
	{
		Color clr = new Color();
		
		Thread t1 = new Thread(clr);
		Thread t2 = new Thread(clr);
		Thread t3 = new Thread(clr);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
