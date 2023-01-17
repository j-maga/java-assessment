package test26;

import java.util.Scanner;

public class SumPair {
	public static void main(String[] args) {
		int Arr[] = new int [8];
		System.out.println("Enter elements : ");
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<8; i++)
		{
			Arr[i] = sc.nextInt();
		}
		System.out.println("Enter Sum : ");
		int sum = sc.nextInt();
		
		for (int i=0; i<8; i++)
		{
			for(int j=0; j<i-1; j++)
			{
				if (Arr[i]+Arr[j] == sum)
					System.out.println(Arr[i] + " + "+ Arr[j] + " = " + sum);
			}
		}

	}

}
