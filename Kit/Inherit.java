package Kit;

class Ques
{
	int a=40;
	int b=20;
}

public class Inherit extends Ques
{
	int a=100;
	int b=200;
	
	void add(int a, int b)
	{
		System.out.println(a + this.b - super.a);
	}
	
	public static void main(String[] args)
	{
		Inherit i = new Inherit();
		i.add(10, 30);
	}
}
