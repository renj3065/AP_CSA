package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		int numWords=0;
		Scanner script=new Scanner(sentence);
		while(script.hasNext()){
			script.next();
			numWords++;
		}
		wordRay=new String[numWords];
		Scanner script2=new Scanner(sentence);
		int index=0;
		while(script2.hasNext()){
			wordRay[index]=script2.next();
			index++;
		}
	}

	public String toString()
	{
		String output="";
		int max = 1;
		int check;
		boolean condition=true;
		while(condition){
		for(int x=wordRay.length-1;x>-1;x--){
			if(wordRay[x].length()-max>-1){
				output+=wordRay[x].charAt(wordRay[x].length()-max);
			}
			else{
				output+=" ";
			}
		}
		max++;
		output+="\n";
		check=0;
		for(String ryan:wordRay){
			if(ryan.length()-max>-1)
				check++;
		}
		if(check==0){
			condition=false;
		}
		}




		return output+"\n\n";
	}
}