package unit13;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner keyboard=new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit13\\lab15d.dat"));
		int numLines=keyboard.nextInt();
		keyboard.nextLine();
		for(int x=0;x<numLines;x++){
			FancyWords test=new FancyWords(keyboard.nextLine());
			System.out.println(test);
		}




	}
}
