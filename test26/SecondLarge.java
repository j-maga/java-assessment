package test26;

import java.util.Scanner;

public class SecondLarge {
	public static void main(String[] args) {
		int Arr[] =new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 elements : ");
		for (int i=0; i<6; i++)
		{
			Arr[i] = sc.nextInt();
		}
		int large=0, secondLarge=-1;
		
		for (int i=1; i<Arr.length; i++)
		{
			if(Arr[i]>large)
			{
				large = Arr[i];
			}
			if(Arr[i-1]>secondLarge && Arr[i-1]<large)
			{
				secondLarge = Arr[i];
			}
		}
		System.out.println("Large " +large);
		System.out.println("Second Large " +secondLarge);
	}
}
