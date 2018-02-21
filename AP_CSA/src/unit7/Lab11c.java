package unit7;

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
Scanner keyboard=new Scanner(System.in);
System.out.println("Enter a character:");
String strng=keyboard.nextLine();
System.out.println("How many layers in the pyramid?");
int nt=keyboard.nextInt();
TriangleThree test=new TriangleThree(nt,strng);
System.out.println(test);
keyboard.close();




	}
}