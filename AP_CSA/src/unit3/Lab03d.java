package unit3;

import java.util.Scanner;

public class Lab03d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard=new Scanner(System.in);
		
		System.out.print("x1 :: ");
		int a=keyboard.nextInt();
		
		System.out.print("y1 :: ");
		int b=keyboard.nextInt();
		
		System.out.print("x2 :: ");
		int c=keyboard.nextInt();
		
		System.out.print("y2 :: ");
		int d=keyboard.nextInt();
Distance dist=new Distance(a,b,c,d);
dist.calcDistance();
dist.print();
	}

}
