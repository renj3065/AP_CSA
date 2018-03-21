package unit13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class JournalCount {
	public static void main(String[] args){
	int[] temp=new int[100];
	Random r=new Random();
	int wa;
	int index=0;
	
	boolean condition=true;
	while(index<100){
		wa=r.nextInt(100)+1;
		if(Arrays.binarySearch(temp, wa)<0){
			temp[index]=wa;
			index++;
		}
	}
	for(int x:temp){
		System.out.println(x);
	}

	
	int num2find=r.nextInt(100)+1;
	System.out.println("Races begin");
	long start=System.currentTimeMillis();
	for(int x:temp){
		System.out.println(x);
		if(x==num2find){
			break;
		}
	}
	long stop=System.currentTimeMillis();
	
	System.out.println(stop-start);
	
	
	
	
}
}
