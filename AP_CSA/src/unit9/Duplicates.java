package unit9;

public class Duplicates {
	int[] myArray;
public Duplicates(int[] list){
	myArray=list;
	eliminateDuplicates(myArray);
}
public static int[] eliminateDuplicates(int[] list){
	String empty=list[0]+" ";
	for(int x=1;x<list.length;x++){
		if(empty.indexOf(list[x]+" ")<0){
			empty+=list[x]+" ";
		}
	}
	String[] nums=empty.split(" ");
	int[] dupped=new int[nums.length];
	return dupped;
}
}
