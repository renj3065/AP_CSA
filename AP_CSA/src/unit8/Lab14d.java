package unit8;

import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many grades?");
		int num=keyboard.nextInt();
		Grades test=new Grades(num);
		test.setGrades();
		keyboard.close();
		
	}
}