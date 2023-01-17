package test06;

import java.util.Scanner;

class Car
{
	int interest, balance, paid, totMon, remMon, totAmount;
	
	int interestAmount(int cost)
	{
		int interest = (cost*3)/100;
		return interest;
	}
	
	int balanceAmount(int totAmount, int paid)
	{
		int balance = totAmount - paid; 
		return balance;
	}
	
	int paidAmount(int interest, int installment, int paidMon)
	{
		int paid = (interest+installment)*paidMon;
		return paid;
	}
		
	int totalMonths(int cost, int installment)
	{
		int totMon = cost/installment;
		return totMon;
	}
	
	int remainMonths(int totMon, int paidMonths)
	{
		int remMon = totMon - paidMonths;
		return remMon;
	}
	
	int totalAmount(int installment, int interest, int totMon)
	{
		int totAmount = (installment+interest)*totMon;
		return totAmount;
		
	}
}

public class InterestRate
{
	public static void main(String[] args)
	{
		int cost = 840000, installment = 15000;
		int paidMonths;
		
		Car car = new Car();
		
		int totMon = car.totalMonths(cost, installment);
		int interest = car.interestAmount(cost);
				
		Scanner sc = new Scanner(System.in);
		System.out.println("\n------------------------");
		System.out.println("CAR PRICE - "+cost+"\nINTEREST RATE - 3%");
		System.out.println("INSTALLMENT - "+installment+"\nTOTAL MONTHS - "+totMon);
		System.out.println("------------------------");
		
		System.out.println("\nEnter No. of Months you paid (Installment+Interest) :");
		paidMonths = sc.nextInt();
		
		int remMon = car.remainMonths(totMon, paidMonths);
		int paid = car.paidAmount(interest, installment, paidMonths);
		int totAmount = car.totalAmount(installment, interest, totMon);
		int balance = car.balanceAmount(totAmount, paid);
		
		System.out.println("PAID MONTHS - "+paidMonths);
		System.out.println("\n------------------------");
		System.out.println("REMAIN MONTHS - "+remMon+"\nINTEREST / MONTH - "+interest);
		System.out.println("AMOUNT PAID - "+paid+"\nBALANCE AMOUNT - "+balance);
		System.out.println("------------------------");
	}
}
