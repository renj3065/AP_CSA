package unit12;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;

	}

	public int compareTo( Word rhs )
	{
		if(this.word.length()==rhs.word.length()){
			return this.word.compareTo(rhs.word);
		}
		if(this.word.length()>rhs.word.length()){
			return 1;
		}
		else{
			return -1;
		}
		
		
		
	}

	public String toString()
	{
		return word;
	}
}