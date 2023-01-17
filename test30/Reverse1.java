package test30;

import java.util.Scanner;

public class Reverse1 {
	public static void main(String[] args) {
		String s, S;
		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		S = s.replaceAll("\\s", "");

		StringBuffer sb = new StringBuffer(S);
		sb = sb.reverse();
		
		String []SA = s.split(" ");
		
		int a=0;
		
		for (int i=0; i<SA.length; i++)
		{
			int b = a + SA[i].length();
			System.out.print(sb.substring(a, b)+ " ");
			a = b;
		}
	}
}
