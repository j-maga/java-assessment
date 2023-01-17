package test30;

import java.util.Arrays;
import java.util.Scanner;

public class StrSort
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Sentence ");
		s = sc.nextLine();
		
		String []SA = s.split(" ");
		
		Arrays.sort(SA);
		for (int i=0; i<SA.length; i++)
		{
			System.out.println(SA[i]);
		}
	}
}
