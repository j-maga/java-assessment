package test04;

import java.util.Scanner;

public class RelativeOrder
{
	public static void main(String[] args)
	{
		System.out.println("Enter Size of Array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int A[] = new int[size], B[] = new int[size];
		int nonzero=0;
		
		System.out.println("Enter array elements ");
		for (int i=0; i<size; i++)
			A[i] = sc.nextInt();
		
		System.out.println("\nNon Zero Relative Order ");
		
		int index=0;
		
		for (int j=0; j<size; j++)
		{
			if (A[j]!=0)
			{
				B[index]=A[j];
				index++;
				nonzero++;
			}
		}
		
		//System.out.println(nonzero);
		
		for (int i=nonzero; i<size; i++)
		{
			B[i] = 0;
		}
		
		for(int j=0; j<size; j++)
			System.out.print(B[j]+" ");
	}

}
