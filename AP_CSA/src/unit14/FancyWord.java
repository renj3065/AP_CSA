package unit14;


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{

	   int size=s.length();
	   mat=new char[size][size];
	   for(int x = 0; x<size;x++){
		   mat[0][x]=s.charAt(x);
	   }
	   for(int x=1; x<size-1;x++){
		   mat[x][x]=s.charAt(x);
		   mat[size-1-x][x]=s.charAt(x);

	   }
	   for(int x = 0; x<size;x++){
		   mat[size-1][x]=s.charAt(x);
	   }

	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        output+=mat[i][j] + " ";
		    }
output+="\n";
		}



		return output+"\n\n";
	}
}