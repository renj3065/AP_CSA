package unit5;

import java.util.Random;

public class Plates {
	private String blank;
public Plates(){
	blank="";
}
public void generate(){
	Random r=new Random();
   blank=blank+(char)(r.nextInt(27)+65)+(char)(r.nextInt(27)+65)+(char)(r.nextInt(27)+65)+(char)(r.nextInt(11)+48)+(char)(r.nextInt(11)+48)+(char)(r.nextInt(11)+48)+(char)(r.nextInt(11)+48);
   System.out.println(blank);
}

public static void main(String[] arg){
	Plates test=new Plates();
	test.generate();
}
}
