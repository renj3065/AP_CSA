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
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit11\\gradebook.dat"));
		
		
		//System.out.println("What is the name of the class:\t");
		String className=file.nextLine();
		//System.out.println("How many students are in the class:\t");
		int numStu=file.nextInt();
		String filler=file.nextLine();
		Class test=new Class(className, numStu);

		for(int x=0;x<numStu;x++){
			//System.out.println("Enter the name of Student "+(x+1)+":\t");
			String tempName=file.nextLine();
			//System.out.println("Enter the grades\nUse the format x - grades ( 2 - 100 100) :");
			String tempGrades=file.nextLine();
			test.addStudent(x, new Student(tempName,tempGrades));
		}


		out.println(test);
		
		
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());

		out.println(String.format("Class Average = %.2f",test.getClassAverage()));	










	}		
}