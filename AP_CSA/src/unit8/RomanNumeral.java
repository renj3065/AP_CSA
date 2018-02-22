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
		for(int x=0; x<roman.length();x++){
			int index=0;
			//while(roman[x]!=LETTERS[index]){
				//index++;
			//}
			
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