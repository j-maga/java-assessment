package test30;

import java.util.Scanner;

public class Count {

	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		s = sc.nextLine();
		
		for (int i=0; i<s.length(); i++)
		{
			int count = 0;
			char ch = s.charAt(i);
			for (int j=0; j<s.length(); j++)
			{
				if (s.charAt(j)==ch)
					count++;
			}
			System.out.println(s.charAt(i)+" occurs " +count +" times.");
		}


	}

}
