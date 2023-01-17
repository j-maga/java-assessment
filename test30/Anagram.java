package test30;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args)
	{
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Strings ");
		s1 = sc.next();
		s2 = sc.next();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Anagram?");
		
		for (int i=0; i<s1.length(); i++)
		{
			for(int j=0; j<s1.length(); j++)
			{
				if (s1.charAt(i)==s2.charAt(j))
				{
					continue;
				}
				else
				{
					System.out.println("Not Anagram");
					break;
				}
			}
			
			
		}
	}
}
