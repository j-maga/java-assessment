package test30;

import java.util.Scanner;

public class Reverse2
{
	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Sentence ");
		s = sc.nextLine();
		
		String []SA = s.split(" ");
		
		for (int i=0; i<SA.length; i++)
		{
			//System.out.println(SA[i]);
			SA[i] = reverse(SA[i]);
		}
	}

	private static String reverse(String string)
	{
		String rev="";
		for (int i=string.length(); i>0; i--)
		{
			rev = rev + string.charAt(i-1);
		}
		System.out.print(rev+" ");
		return null;
	}
	
	

}
