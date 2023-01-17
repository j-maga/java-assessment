package Kit;

public class Alphabet 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.print("A");
			String a = null;
			System.out.print("B");
			try
			{
				System.out.print("C");
				int b=1/0;
				System.out.print("D");
			}
			catch (Exception e)
			{
				System.out.print("E");
			}
		}
		catch(Exception e)
		{
			System.out.print("F");
		}
		finally
		{
			System.out.print("G");
		}
	}
}
