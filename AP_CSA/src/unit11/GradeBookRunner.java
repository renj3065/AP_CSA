package unit11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the name of the class:\t");
		String className=keyboard.nextLine();
		System.out.println("How many students are in the class:\t");
		int numStu=keyboard.nextInt();
		String filler=keyboard.nextLine();
		Class test=new Class(className, numStu);
		
		for(int x=0;x<numStu;x++){
			System.out.println("Enter the name of Student "+(x+1)+":\t");
			String tempName=keyboard.nextLine();
			System.out.println("Enter the grades\nUse the format x - grades ( 2 - 100 100) :");
			String tempGrades=keyboard.nextLine();
			test.addStudent(x, new Student(tempName,tempGrades));
		}


		out.println(test);
		
		
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());

		out.println(String.format("Class Average = %.2f",test.getClassAverage()));									















	}		
}