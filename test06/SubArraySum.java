package test06;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of Array Elements : ");
		int n = sc.nextInt();
		
		System.out.println("\nElements :- ");
		int A[] = new int[n];
		for (int i=0; i<n; i++)
			A[i] = sc.nextInt();
		
		System.out.print("Enter Sum Value : ");
		int sum = sc.nextInt();
		
		for (int i=0; i<n-1; i++)
		{
			if (A[i]+A[i+1]==sum)
				System.out.println(A[i]+" + "+A[i+1]+" = "+sum);
		}
	}
}
