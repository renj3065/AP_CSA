package unit10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{




	}

	public Histogram(char[] values, String fName)
	{
		letters=new ArrayList<Character>();
		for(char x: values){
			letters.add(x);
		}
		count=new ArrayList<Integer>();
		for(int x=0;x<letters.size();x++){
			count.add(0);
		}

		fileName=fName;


		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{

		
		Scanner file = new Scanner(new File(fileName));
		String ryan;
		
		while(file.hasNext()){
			ryan=file.next();
			for(int x=0;x<ryan.length();x++){
				for(int y=0;y<letters.size();y++){
					if(ryan.charAt(x)==letters.get(y)){
						count.set(y, count.get(y)+1);
					}
				}
			}
		}




	}

	public char mostFrequent()
	{
		int ryan;
		int wrongDoings;
		int placeOfWinner=0;
		for(int x=0;x<count.size();x++){
			ryan=count.get(x);
			wrongDoings=0;
			for(int y=x+1;y<count.size();y++){
				if(count.get(x)<count.get(y)){
					wrongDoings++;
				}
			}
			if(wrongDoings==0){
				placeOfWinner=x;
				break;
			}
		}
		return letters.get(placeOfWinner);
	}

	public char leastFrequent()
	{
		int ryan;
		int wrongDoings;
		int placeOfWinner=0;
		for(int x=0;x<count.size();x++){
			ryan=count.get(x);
			wrongDoings=0;
			for(int y=x+1;y<count.size();y++){
				if(count.get(x)>count.get(y)){
					wrongDoings++;
				}
			}
			if(wrongDoings==0){
				placeOfWinner=x;
				break;
			}
		}
		return letters.get(placeOfWinner);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}