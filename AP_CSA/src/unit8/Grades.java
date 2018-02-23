package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	int numEntries;
	int[] gradebook;
	//constructor
	public Grades(){
		setNumEntries(1);
		int[] temp=new int[numEntries];
		gradebook=temp;
	}
	public Grades(int num){
		setNumEntries(num);
		int[] temp=new int[numEntries];
		gradebook=temp;
	}
	
	//set method
	
	public void setNumEntries(int num){
		numEntries=num;
	}
	public void setGrades(){
		Scanner keyboard=new Scanner(System.in);
		int tempNum;
		for(int x=0;x<numEntries; x++){
			System.out.println("Grade "+x+":");
			tempNum=keyboard.nextInt();
			gradebook[x]=tempNum;
		}
	}


	private double getSum()
	{
		double sum=0.0;
		for(int x:gradebook){
			sum+=x;
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average=getSum()/numEntries;


		return average;
	}


	//toString method
	public String toString(){
		String temp="";
		for(int x=0;x<gradebook.length;x++){
			temp+=gradebook[x]+" ";
		}
		return "Gradebook:"+temp+"\nSum:"+getSum()+"\nAverage:"+String.format("%.2f", getAverage());
		
	}


}