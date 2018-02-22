package unit8;

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	int numEntries=5;
	int[] gradebook;
	//constructor
	public Grades(){
		setNumEntries(0);
		
		//gradebook=int[numEntries];
	}
	public Grades(int num){
		setNumEntries(num);
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



}