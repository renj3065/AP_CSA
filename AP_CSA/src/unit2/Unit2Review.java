package unit2;

import java.util.Scanner;

public class Unit2Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Write a class SavingsAcount that is similar to the BankAccount class, except that it has an added instance variable interest. 
		 Supply a constructor that sets both the initial balance and the interest rate. Supply a method addInterest(with no eplicit parameter) 
		 that adds the interest to the account. Write a SavingsAccountTester class that constructs a savings account with an initial balance of $1000 
		 and an interest rate of 10%. Then apply the addInterest method and print the resulting balance. 
*/
		System.out.println("Part 1");
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Interest Rate (percent):");
		double interestRate=keyboard.nextDouble();
		System.out.println("Initial Investment:");
		double initialAmount=keyboard.nextDouble();
		SavingsAccount savAcc=new SavingsAccount(interestRate, initialAmount);
		savAcc.deposit(200);
		savAcc.withdraw(100);
		double compound=savAcc.addInterest();
		System.out.printf("New amount: %.2f\n",compound);
		
		
		System.out.println("Part 2");
		System.out.println("Speed: ");
		double takeoffSpeed=keyboard.nextDouble();
		System.out.println("Acceleration: ");
		double accel=keyboard.nextDouble();
		Runway airport=new Runway(takeoffSpeed, accel);
		
		
		keyboard.close();
		
		
	}

}
