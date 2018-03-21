package unit14;

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter bob=new AtCounter();
		//test the code
		bob.countAts(3, 9,0);
		System.out.println(bob);
		
		bob.countAts(0, 0,0);
		System.out.println(bob);
		
		bob.countAts(2, 5,0);
		System.out.println(bob);
		
		bob.countAts(5, 0,0);
		System.out.println(bob);
		
		bob.countAts(9, 9,0);
		System.out.println(bob);


	}
}