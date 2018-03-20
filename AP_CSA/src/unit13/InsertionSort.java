package unit13;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
    list=new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
    loc=Collections.binarySearch(list,word);
    if(loc<0){
      list.add((loc+1)*-1,word);
    }






	}


	public void remove(String word)
	{
    	int loc = 0;
      loc=Collections.binarySearch(list,word);
      if(loc>=0){
        list.remove(loc);
      }




	}

	public String toString()
	{ 
	  String output="";
	  for(String x:list){
	    output+=x+" ";
	  }
		return output;
	}
}