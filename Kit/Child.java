package Kit;

class Parent
{
	int a=40;
	int b=20;
}

public class Child extends Parent 
{
	int a=100;
	int b=200;
	
	void add(int a, int b)
	{
		System.out.println(a+this.b-super.a);
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.add(10, 30);
	}
}
