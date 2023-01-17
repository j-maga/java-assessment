package test22;

public class ExcepCom 
{
	public static void main(String[] args)
	{
		try
		{
			int div = 45/0;
			System.out.println(div);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
