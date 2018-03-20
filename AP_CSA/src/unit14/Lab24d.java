package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File (System.getProperty("user.dir")+"\\src\\unit14\\lab24d.dat"));
		int blah=file.nextInt();
		file.nextLine();
		for(int i = 0; i<blah; i++)
		{
			String word = file.next();

			TicTacToe bob=new TicTacToe(word);
			System.out.println(bob);


	   }







	}
}


