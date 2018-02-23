package unit8;


import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman="";

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		System.out.println(getNumber());
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);


	}

	public void setNumber(Integer num)
	{
		number=num;
	}

	public void setRoman(String rom)
	{
		roman=rom;
	}

	public Integer getNumber()
	{
			number=0;
			/*
			for(int x=0;x<roman.length();x++){
				int index=0;
				int blockLength=0;
				boolean condition=true;
				String block=LETTERS[index];
				
				if (condition)
					blockLength=block.length();
				else 
					blockLength=1;
				//System.out.println("MARK 0");
				while(!roman.substring(x, x+block.length()).equals(block))
				{
					index++;
					block=LETTERS[index];
					//System.out.println(roman.substring(x, x+block.length()));
					//System.out.println(block);
					//System.out.println("MARK 1");
					if(condition)
						blockLength=block.length();
					else
						blockLength=1;
				}
				if(block.length()==2){
						x++;
						//System.out.println("MARK 2");
					}
				number+=NUMBERS[index];
				System.out.println(number);
				System.out.println(x);
				
				if(x==roman.length()-2){
					condition=false;
				}
				
				

 			}
		*/
		roman=roman.replaceAll("IV", "IIII");
		roman=roman.replaceAll("IX", "VIIII");
		roman=roman.replaceAll("XL", "XXXX");
		roman=roman.replaceAll("XC", "LXXXX");
		roman=roman.replaceAll("CD", "CCCC");
		roman=roman.replaceAll("CM", "DCCCC");

		for(int x=0;x<roman.length();x++){
			int index=0;
			String block=roman.substring(x, x+1);
			while(!block.equals(LETTERS[index])){
				index++;
			}
			number+=NUMBERS[index];
		}		
		return number;
	}

	public String toString()
	{ 
		String convertedRoman="";
		for(int x=0; x<13;x++){
			int count=0;
			while(number/NUMBERS[x]>0){
				number=number-NUMBERS[x];
				count++;
			}
			for(int y=0; y<count;y++){
				convertedRoman+=LETTERS[x];
			}
		}
		return convertedRoman + "\n";
	}
}