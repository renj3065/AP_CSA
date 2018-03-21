package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		int num;
		String str;
		Scanner keyboard=new Scanner(new File (System.getProperty("user.dir")+"\\src\\unit14\\lab21i.dat"));
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test1=new Maze(num,str);
		System.out.println(test1);
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test2=new Maze(num,str);
		System.out.println(test2);
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test3=new Maze(num,str);
		System.out.println(test3);
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test4=new Maze(num,str);
		System.out.println(test4);
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test5=new Maze(num,str);
		System.out.println(test5);
		
		num=keyboard.nextInt();
		keyboard.nextLine();
		str=keyboard.nextLine();
		Maze test6=new Maze(num,str);
		System.out.println(test6);
	}
}