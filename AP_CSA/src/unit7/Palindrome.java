package unit7;

import java.util.Scanner;

public class Palindrome {
	// Return the reversal of an integer, i.e., reverse(456) returns 654 public static int reverse(int number) 
public static int getReversal(int number){
	int store=0;
	while(number>0){
		store=store*10+number%10;
		number=number/10;
	}
	return store;
}
	// Return true if number is a palindrome 
	public static boolean isPalindrome(int number){
		if (getReversal(number)==number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int testNumber=keyboard.nextInt();
		if (isPalindrome(testNumber))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}

}
