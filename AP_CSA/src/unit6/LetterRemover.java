package unit6;



public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
setRemover("I love computer science",'o');
	}

public LetterRemover(String s, char rem){
	setRemover(s,rem);
}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while (cleaned.indexOf(lookFor)!=-1){
			cleaned=cleaned.substring(0,cleaned.indexOf(lookFor))+cleaned.substring(cleaned.indexOf(lookFor)+1,cleaned.length());
		}




		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+"\n Cleaned sentence:"+removeLetters();
	}
}