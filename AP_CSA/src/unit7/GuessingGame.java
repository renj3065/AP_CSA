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
		theNumber=(int)Math.random()*upperBound+1;
		
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int guess=keyboard.nextInt();
		
	}

	public String toString()
	{
		String output="";
		return output;
	}
}