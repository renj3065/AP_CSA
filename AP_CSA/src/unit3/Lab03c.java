package unit3;

import java.util.Scanner;

public class Lab03c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("a :: ");
		int a=keyboard.nextInt();
		
		System.out.print("b :: ");
		int b=keyboard.nextInt();
		
		System.out.print("c :: ");
		int c=keyboard.nextInt();
		Quadratic quad=new Quadratic(a,b,c);
		quad.calcRoots();
		quad.print();
		keyboard.close();
	}

}
