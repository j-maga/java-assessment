package test06;

import java.util.Scanner;
import java.util.TreeSet;

public class CommonChar {

	public static void main(String[] args)
	{
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String 1 : ");
		s1 = sc.nextLine();
		s1 = s1.replace(" ", "");
		
		System.out.print("Enter String 2 : ");
		s2 = sc.nextLine();
		s2 = s2.replace(" ", "");
		
		TreeSet<Character> output = new TreeSet();
		
		for (int i=0; i<=s1.length()-1; i++)
		{
			for (int j=0; j<=s2.length()-1; j++)
			{
				char c = s1.charAt(i);
				if (s2.charAt(j)==c)
				{
					output.add(c);
				}
			}
		}
		
		System.out.println(output);
		

	}

}
