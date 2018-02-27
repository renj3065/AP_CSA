package unit9;

public class Duplicates {
	int[] myArray;
public Duplicates(int[] list){
	myArray=list;
	eliminateDuplicates(myArray);
}
public static int[] eliminateDuplicates(int[] list){
	for(int x=0;x<list.length;x++){
		for(int y=0;y<list.length;y++){
			if(x!=y){
				if (list[x]==list[y]){
					list[y]=null;
				}
			}
		}
	}
}
}
