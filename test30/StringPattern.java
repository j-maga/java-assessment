package test30;

import java.util.Scanner;

public class StringPattern {
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		s = sc.next();
		
		for (int first=0; first<s.length(); first++)
		{
			for (int second=first; second<s.length()+1; second++)
			{
				System.out.println(s.substring(first, second));
			}
		}
	}

}
