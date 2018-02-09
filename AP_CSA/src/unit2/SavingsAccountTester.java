package unit2;

import java.util.Scanner;

public class SavingsAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double interestRate=10;
		double initialAmount=1000;
		SavingsAccount savAcc=new SavingsAccount(interestRate, initialAmount);
		double compound=savAcc.addAmount();
		System.out.printf("New amount: %.2f\n",compound);
	}

}
