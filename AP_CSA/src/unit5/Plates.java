package unit5;

import java.util.Random;

public class Plates {\
	private String blank;
public Plates(){
	blank="";
}
public void generate(){
   blank+=Random.ints(65,91);
}
}
