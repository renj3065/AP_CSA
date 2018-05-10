package unit0;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroClass {

	public static void main(String[] args) {
		System.out.println((int)Math.ceil(-0.2));
		ArrayList<String> billy=new ArrayList<String>(3);
		billy.add(0,"Wa");
		System.out.println(billy.size());
		int[] blep=new int[3];
		System.out.println(blep.length);
		for(String x: billy){
			System.out.println(x);
		}
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String str="Hello";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		int x=1;
			int y=2;
			double z=x/y;
		System.out.println(z);
		String test="";
		test=""+y;
		System.out.println(test.length());
		
		String name="hello";


		System.out.println(name.substring(5,5));	
		System.out.println("L"=="L");
		
		Scanner keyboard=new Scanner(" 100 90 85 72.5 95.6");
		System.out.println(keyboard.nextDouble());
		System.out.println(keyboard.nextInt());

		int p=1, r=2;
		if(p>0 || r++>5 && p>10){
			System.out.println("dude");
		}
		System.out.println(r);
		
		int a=5;
		int b=3;
		int c=5;

		if (a==b || b==c || c==a){
			System.out.println("I am wrong!");
		}
		}
		
	
		
}


