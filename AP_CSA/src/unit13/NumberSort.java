package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0){
			number=number/10;
			count++;
		}















		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		int keepTrack=number;
		int digits=getNumDigits(number);
		
		sorted=new int[digits];
		int index=0;
		while(keepTrack>0){
			sorted[index]=keepTrack%10;
			index++;
			keepTrack=keepTrack/10;
		}
		
		int ryan=sorted[0];
		int tempSwitch;
		for(int x=sorted.length-1;x>0;x--){
			for(int y=0;y<x;y++){
				if(sorted[y+1]<sorted[y]){
					tempSwitch=sorted[y+1];
					sorted[y+1]=sorted[y];
					sorted[y]=tempSwitch;
					//System.out.println(ryan.getNumericGrade());
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		















		return sorted;
	}
}