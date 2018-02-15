package unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
setPrime(3);

	}

	public Prime(int num)
	{
setPrime(num);

	}

	public void setPrime(int num)
	{
number=num;

	}

	public boolean isPrime()
	{
		int x=2;
		boolean test=true;
		while(test){
			if (number==1 || number==2)
				return true;
			if(number%x==0)
				return false;
			x++;
			if(x==number){
				test=false;
			}
		}
		return true;





	}

	public String toString()
	{	
		String output="";
		if (isPrime()) 
			output=number+" is prime.";
		else 
			output=number+" is not prime.";





		return output;
	}
}