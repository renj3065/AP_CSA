package unit11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String name;
	//private Student[] studentList;
	private ArrayList<Student> studentList;
	public Class()
	{
		name="";
		//studentList=new Student[0];
		studentList=new ArrayList<Student>(0);
	}
	
	public Class(String names, int stuCount)
	{
		name=names;
		//studentList=new Student[stuCount];
		studentList=new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum]=s;
		studentList.set(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for(Student x:studentList){
			classAverage+=x.getAverage();
		}
		classAverage=classAverage/studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		//return studentList[stuNum].getAverage();
		return studentList.get(stuNum).getAverage();

	}

	public double getStudentAverage(String stuName)
	{
		int ryanHoward=-1;
		for(int x=0;x<studentList.size();x++){
			if(studentList.get(x).getName().equals(stuName)){
				ryanHoward=x;
			}
		}

		if (ryanHoward==-1)
			return 0.0;
		//return studentList[ryanHoward].getAverage();
		return studentList.get(ryanHoward).getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		//return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();

	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		/*
		Student ryan=studentList[0];
		for(int x=0;x<studentList.length-1;x++){
			if(studentList[x+1].getAverage()>ryan.getAverage()){
				ryan=studentList[x+1];
				//System.out.println(ryan.getNumericGrade());

			}
		}
		*/
		sort(studentList);
		hName=studentList.get(studentList.size()-1).getName();





		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		/*
		Student ryan=studentList[0];
		for(int x=0;x<studentList.length-1;x++){
			if(studentList[x+1].getAverage()>ryan.getAverage()){
				ryan=studentList[x+1];
				//System.out.println(ryan.getNumericGrade());

			}
		}
		*/
		sort(studentList);
		hName=studentList.get(0).getName();




		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (Student stu:studentList){
			if(stu.getAverage()<=failingGrade){
				output+=stu.getName()+" ";
			}
		}




		return output;
	}
	
	public void sort(ArrayList<Student> s){
		
		Student ryan=s.get(0);
		Student tempSwitch;
		for(int x=s.size()-1;x>0;x--){
			for(int y=0;y<x;y++){
				if(studentList.get(y+1).compareTo(studentList.get(y))<0){
					tempSwitch=studentList.get(y+1);
					studentList.set(y+1, studentList.get(y));
					studentList.set(y, tempSwitch);
					//System.out.println(ryan.getNumericGrade());
					
				}
			}
		}
	}
	
	public String toString()
	{
		sort(studentList);
		String output=""+getClassName()+"\n";
		for(Student stu:studentList){
			output+=stu.toString()+"\t"+String.format("%.2f", stu.getAverage())+"\n";
		}



		return output;
	}  	
}