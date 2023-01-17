package test04;

import java.util.Arrays;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
		int A[] = new int[6];
		int rem, gcd, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 elements ");
		
		for (int i=0; i<6; i++)
			A[i] = sc.nextInt();
		
		Arrays.sort(A);
		
		for (int i=0; i<6; i++)
		{
			for (int j=5; j>0; j--)
			{
				rem = A[j]%A[i];
				count++;
				
				/*if (rem!=0 && A[j]>A[i])
				{
					count = 0;
					for (int k=0; k<6; k++)
					{
						gcd = A[k]%rem;
						count++;
						
						if (gcd!=0)
							break;
						
						if(count==5)
							System.out.println("GCD : " + gcd);
					}
				}*/
				if (rem!=0)
					break;
				else
					continue;
			}
			
			if (count==5)
				System.out.println("GCD : " +A[i]);
			else
			{
				count=0;
				continue;
			}		
		}
	}
}
