package unit12;
import static java.lang.System.*;

public class Word2 implements Comparable<Word2>
{
	private String word;

	public Word2( String s)
	{

		word=s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(char x:word.toCharArray()){
			if(vowels.indexOf(x)!=-1){
				vowelCount++;
			}
		}






		return vowelCount;
	}

	public int compareTo(Word2 rhs)
	{

		if(this.numVowels()==rhs.numVowels()){
			return this.word.compareTo(rhs.word);
		}
		if(this.numVowels()>rhs.numVowels()){
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