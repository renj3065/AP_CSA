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
import java.util.ArrayList;

public class Grades
{
	//private Grade[] grades;
	private ArrayList<Grade> grades;
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		//System.out.println("Mark 0");
		int index=0;
		Scanner keyboard=new Scanner(gradeList);
		//System.out.println("Mark 0");
		int x=keyboard.nextInt();
		grades=new ArrayList<Grade>(x);
		//grades=new Grade[keyboard.nextInt()];
		//System.out.println("Mark 0");
		String howard=keyboard.next();
		while(keyboard.hasNextDouble()){

			setGrade(index,keyboard.nextDouble());
			index++;
		}

		keyboard.close();

	}
	
	public void setGrade(int spot, double grade)
	{
		// System.out.println("Mark 1");
		grades.set(spot, new Grade(grade));//[spot]=new Grade(grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(Grade x: grades){
			sum+=x.getNumericGrade();
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		Grade ryan=grades.get(0);
		for(int x=0;x<getNumGrades()-1;x++){
			if(grades.get(x+1).getNumericGrade()<ryan.getNumericGrade()){
				ryan=grades.get(x+1);
				//System.out.println(ryan.getNumericGrade());
			}
		}
		low=ryan.getNumericGrade();


		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		Grade ryan=grades.get(0);
		for(int x=0;x<getNumGrades()-1;x++){
			if(grades.get(x+1).getNumericGrade()>ryan.getNumericGrade()){
				ryan=grades.get(x+1);
				//System.out.println(ryan.getNumericGrade());

			}
		}
		high=ryan.getNumericGrade();






		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		
		for(Grade x: grades){
			output+=x.getNumericGrade()+" ";
		}
		
		//output+="\nsum - "+getSum()+"\nnum grades - "+getNumGrades()+"\nlow grade - "+getLowGrade()+"\nhigh grade - "+getHighGrade();




		return output;
	}	
}