package unit5;
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('0');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);


	}

	public void setChar(char c)
	{
		theChar=c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper()
	{
		if(getASCII()<91)
			if(getASCII()>64)
				return true;
		return false;
	}

	public boolean isLower( )
	{
		if(getASCII()<123)
			if(getASCII()>96)
				return true;
		return false;
	}
	
	public boolean isNumber( )
	{
		if(getASCII()<58)
			if(getASCII()>47)
				return true;
		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if(isUpper())
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";

		if(isLower())
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		if(isNumber())
			return ""+getChar() + " is a numeric character. ASCII == " + getASCII() + "\n";	  

		return "Your character is not alphanumeric";
	}
}
