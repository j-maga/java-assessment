package Kit;

class Que
{
	static int b=2;
}

class Ans extends Que
{
	static int b=20;
}

public class Output extends Ans
{
	public static void main(String[] args)
	{
		b=100;
		System.out.println(Ans.b);
		System.out.println(b+Que.b);		
	}
}
