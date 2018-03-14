package unit12;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit12\\lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word2[] temp=new Word2[size];
		for(int x=0; x<size; x++){
			temp[x]=new Word2(file.next());
		}

		Arrays.sort(temp);
		
		for(Word2 x:temp){
			System.out.println(x);
		}









	}
}