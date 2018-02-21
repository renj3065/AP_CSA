package unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int theNumber;
	public GuessingGame(int stop)
	{
		upperBound=stop;

		theNumber=(int)(Math.random()*upperBound+1);

		System.out.println("The numbers will range from 1 to "+upperBound);
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int count=0;
		do{
			System.out.println("Enter a number between 1 and "+upperBound+":");
			guess=keyboard.nextInt();
			
			if (guess<1 || guess>upperBound)
				System.out.println("That number is out of range");
			else
				count++;
		}
		while(guess!=theNumber);
		
		double wrongPercentage=((double)count-1)/upperBound*100;
		
		System.out.println("It took "+count+" tries to guess "+theNumber);
		System.out.println("You guessed wrong "+wrongPercentage+"% of the time.");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}