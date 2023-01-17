package test04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args)
	{
		int Asize=3, Bsize=6, Csize=4;
		ArrayList <Integer> output = new ArrayList <Integer>(Arrays.asList());
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("\nArray A\nEnter 3 elements");
		
		int A[] = new int[Asize];
		
		for (int i=0; i<Asize; i++)
			A[i] = sc.nextInt();
		
		System.out.println("\nArray B\nEnter 6 elements");
		
		int B[] = new int[Bsize];
		
		for (int i=0; i<Bsize; i++)
			B[i] = sc.nextInt();
		
		System.out.println("\nArray C\nEnter 4 elements");
		
		int C[] = new int[Csize];
		
		for (int i=0; i<Csize; i++)
			C[i] = sc.nextInt();
		
		System.out.println("\nCommon Elements present : ");
		for (int i=0; i<3; i++)
		{
			int search = A[i];
			
			for (int j=0; j<4; j++)
			{
				if (C[j]==search)
				{
					for (int k=0; k<6; k++)
					{
						if (B[k]==search)
						{
							//System.out.println(search);
							output.add(search);
						}
					}
				}
				else
				{
					continue;
				}
			}
		}
		Collections.sort(output);
		System.out.println(output);
	}

}
