package test26;

class Java
{
	static int a = 5;
}
public class Okay 
{
	static class Java2
	{
		int b;
		//Java f = new Java()
		//b=f.a;
	}
	
	public static void main(String args[])
	{
		Okay.Java2 f2 = new Okay.Java2();
		System.out.println(f2.b);
	}

}
