package test04;

import java.util.Scanner;

public class NonZero
{
	public static void main(String[] args)
	{
		int size, temp, zero=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Size ");
		
		size = sc.nextInt();
		int A[] = new int [size];
					
		System.out.println("\n\nEnter Array elements\nzero and non-zero\n");
		
		for (int i=0; i<size; i++)
		{
			A[i] = sc.nextInt();
		}
		
		for (int i=0; i<size; i++)
		{
			if (A[i]==0)
				zero++;
		}
		System.out.println("\nNo. of Zeros" + zero);
		
		for (int i=0; i<size; i++)
		{
			if (A[i]==0)
			{
				for (int j=size-1; j>=0 && i<j; j--)
				{
					if (A[j]==0)
					{
						continue;
					}
					else
					{
						temp = A[j];
						A[j] = 0;
						A[i] = temp;
					}
					break;
				}
			}
			
			else
				continue;
		} 
		
		for (int i=0; i<size; i++)
		{
			System.out.print(A[i]+" ");
		}

	}

}
