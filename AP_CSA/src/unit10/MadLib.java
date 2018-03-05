package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
		//gettype
		verbs=new ArrayList<String>();
		nouns=new ArrayList<String>();
		adjectives=new ArrayList<String>();

		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			loadVerbs();
			loadNouns();
			loadAdjectives();
			while(file.hasNext()){
				if(file.next()=="#"){
					System.out.println(getRandomNoun());
					
				}
				else if(file.next()=="@"){
					System.out.println(getRandomVerb());
				}
				else if(file.next()=="&"){
					System.out.println(getRandomAdjective());
				}
				else{
					System.out.println(file.next());
				}
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\nouns.dat"));
			
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
			
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\verbs.dat"));
			//System.out.println(file.hasNext());
			//System.out.println(file.next());
			
			while(file.hasNext()){
				verbs.add(file.nextLine());
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
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit10\\adjectives.dat"));
			
			while(file.hasNext()){
				adjectives.add(file.next());
			}
	
	
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("Adjective issue");
		}
	}

	public String getRandomVerb()
	{
		Random r=new Random();
		int ryan=r.nextInt(verbs.size()-1);
		return verbs.get(ryan);
	}
	
	public String getRandomNoun()
	{
		Random r=new Random();
		int ryan=r.nextInt(nouns.size()-1);
		return nouns.get(ryan);
	}
	
	public String getRandomAdjective()
	{
		Random r=new Random();
		int ryan=r.nextInt(adjectives.size()-1);
		return adjectives.get(ryan);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}