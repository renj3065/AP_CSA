package unit12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit12\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] temp=new Word[size];
		for(int x=0; x<size; x++){
			temp[x]=new Word(file.next());
		}

		Arrays.sort(temp);
		
		for(Word x:temp){
			System.out.println(x);
		}








	}
}
