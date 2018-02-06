package unit2;

public class Unit2Notes {
static float fNum=4.283728f;
static String output="";
public static void main(String[] args){
	output+="Formatted Number: "+String.format("%.2f",fNum);
	System.out.println(output);
}
}
