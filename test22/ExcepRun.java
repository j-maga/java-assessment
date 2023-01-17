package test22;

public class ExcepRun
{
	public static void main(String[] args)
	{
		try
		{
			ExcepRun er = null;
			System.out.println(er.equals(""));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
