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
import java.util.ArrayList;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   	ArrayList<Class> gradebook=new ArrayList<Class>();

		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\unit11\\gradebook.dat"));
		
		
		//System.out.println("What is the name of the class:\t");
		String className=file.nextLine();
		//System.out.println("How many students are in the class:\t");
		int numStu=file.nextInt();
		String filler=file.nextLine();
		gradebook.add(new Class(className, numStu));

		for(int x=0;x<numStu;x++){
			//System.out.println("Enter the name of Student "+(x+1)+":\t");
			String tempName=file.nextLine();
			//System.out.println("Enter the grades\nUse the format x - grades ( 2 - 100 100) :");
			String tempGrades=file.nextLine();
			gradebook.get(0).addStudent(x, new Student(tempName,tempGrades));
		}


		out.println(gradebook.get(0));
		
		
		out.println("Failure List = " + gradebook.get(0).getFailureList(70));	
		out.println("Highest Average = " + gradebook.get(0).getStudentWithHighestAverage());
		out.println("Lowest Average = " + gradebook.get(0).getStudentWithLowestAverage());

		out.println(String.format("Class Average = %.2f",gradebook.get(0).getClassAverage()));	










	}		
}