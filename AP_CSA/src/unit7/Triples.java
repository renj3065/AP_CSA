package unit7;

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
		
	}

	public void setNum(int num)
	{
		number=num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		for(int x=a;x>0;x--){
			if(b%x==0 && c%x==0){
				return x;
			}
		}
		return 1;
		


	}

	public String toString()
	{
		String output="";
		for(int a=1;a<number+1;a++){
			for(int b=1;b<number+1;b++){
				for(int c=1;c<number+1;c++){
					if(a*a+b*b==c*c)
						if(c%2==1){
							if(a%2==1){
								if(b%2==0){
									if (greatestCommonFactor(a,b,c)<=1)
										output=output+a+" "+b+" "+c+"\n";
								}
							}
							else if(a%2==0){
								if(a%2==1){
									if (greatestCommonFactor(a,b,c)<=1)
										output=output+a+" "+b+" "+c+"\n";								}
							}
						}
						
							
					
				}
			}
		}





		return output;
	}
}