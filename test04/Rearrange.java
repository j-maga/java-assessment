package test04;

import java.util.Scanner;

public class Rearrange
{
	public static void main(String[] args)
	{
		int temp;
		int A[] = new int[11];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 11 elements ");
		
		for (int i=0; i<11; i++)
			A[i] = sc.nextInt();
		
		for (int i=1; i<11; i+=2)
		{
			if (A[i]>A[i-1])
			{
				if (A[i]>A[i+1])
				{
					continue;
				}
				else
				{
					temp = A[i+1];
					A[i+1] = A[i];
					A[i] = temp;
				}
			}
			else if (A[i] < A[i-1])
			{
				temp = A[i-1];
				A[i-1] = A[i];
				A[i] = temp;
				
				if (A[i]>A[i+1])
				{
					continue;
				}
				else
				{
					temp = A[i+1];
					A[i+1] = A[i];
					A[i] = temp;
				}
			}
		}
		
		for(int i=0; i<11; i++)
			System.out.print(A[i]+" ");
	}

}
