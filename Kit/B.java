package Kit;

abstract class A
{
	int i;
	int print(int i) { return i*2; }
}

public class B extends A
{
	int i=8;
	int print(int i) { return i; }
	public static void main(String[] args)
	{
		int i=5;
		A b = new B();
		System.out.println(b.i);
		System.out.println(b.print(3));
	}
}
