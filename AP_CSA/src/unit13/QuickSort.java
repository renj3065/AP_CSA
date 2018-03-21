package unit13;


import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		quickSort(list,0,list.length-1);


	}


	private static void quickSort(Comparable[] list, int low, int high)
	{

		if(low<high){
			int split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
			for(Comparable x:list){
				System.out.print(x);
			}
			System.out.println("\n");
		}





	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable temp;
		Comparable pivot=list[low];
		int bot=low-1;
		   for(int top=low; top<high-1; top++)
	         {
	             if(list[top].compareTo(pivot)<=0)
	             {
	                 bot++;
	                 temp = list[bot];
	                 list[bot] = list[top];
	                 list[top] = temp;
	             }
	         }

	         temp = list[bot+1];
	         list[bot+1] = list[high];
	         list[high] = temp;
	         return (bot+1);
	     

/*		while(bot<=top){
			System.out.println("Mark 2");

			while(list[bot].compareTo(pivot)<0){
				bot++;
			}
			while(list[top].compareTo(pivot)>0){
					if(top<=bot){
						return top;
					}
					Comparable temp=list[top];
					 list[top]=list[bot];
						list[bot]=temp;
				}
			
			
		}
*/










	}
}