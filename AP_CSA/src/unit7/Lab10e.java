package unit7;


import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing game how many numbers:");
		
		int response=keyboard.nextInt();
		GuessingGame test=new GuessingGame(response);
		test.playGame();
		
		keyboard.close();
		




	}
}
