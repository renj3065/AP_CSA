package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{



	}

	public MadLib(String fileName)
	{
		//load stuff
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
			while(file.hasNext()){
				nouns.add(file.next());
			}
		
		
		
		}
		catch(Exception e)
		{
			out.println("Noun issue");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
	
			while(file.hasNext()){
				verbs.add(file.next());
			}
	
	
		}
		catch(Exception e)
		{
			out.println("Verb issue");

		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("adjectives.dat"));
			
			while(file.hasNext()){
				adjectives.add(file.next());
			}
	
	
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("Verb issue");
		}
	}

	public String getRandomVerb()
	{
	
		return "";
	}
	
	public String getRandomNoun()
	{
		
		return "";
	}
	
	public String getRandomAdjective()
	{
		
		return "";
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}