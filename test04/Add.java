package test04;

import java.util.Scanner;

public class Add
{
	public static void main(String[] args)
	{
		System.out.println("Addition of 3 X 2 Array ");
		int A[][] = new int[3][2];
		int B[][] = new int[3][2];
		int C[][] = new int[3][2];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\nEnter Elements of Array A");

		for (int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++)
			{
				A[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("\n\nEnter Elements of Array B");
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++)
			{
				B[i][j] = sc.nextInt(); 
			}
		}
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++)
			{
				C[i][j] = A[i][j] + B[i][j]; 
			}
		}
		
		System.out.println("\n\nOutput : ");
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<2; j++)
			{
				System.out.print(C[i][j]+" "); 
			}
			System.out.print("\n");
		}
	}

}
