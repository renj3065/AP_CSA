package unit1;

import java.awt.Rectangle;
import java.util.Random;

public class Unit1Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Part 1");
		Rectangle r1=new Rectangle(6,7);
		Rectangle r2=new Rectangle(20,1);
		
		System.out.println("r1 width:"+r1.getWidth()+" r1 height:"+r1.getHeight());
		System.out.println("r2 width:"+r2.getWidth()+" r2 height:"+r2.getHeight());

		System.out.println("Part 2");
		String str="Hello World";
		System.out.println(str);
		str=str.replace("e","*");
		str=str.replace("o", "e");
		str=str.replace("*", "o");
		System.out.println(str);
		
		Random generator=new Random();
		System.out.println("Let\'s try a couple rolls!");
		for(int i=1;i<11;i++){
			System.out.println(generator.nextInt(6)+1);

		}

	}

}
