package test26;

public class Pattern {
	public static void main(String[] args) {
		int k=1;
		
		for (int i=5; i>0; i--)
		{
			for (int j=5; j>0; j--)
			{
				if (k==j)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			k++;
			System.out.println("\n");
		}
	}
}
