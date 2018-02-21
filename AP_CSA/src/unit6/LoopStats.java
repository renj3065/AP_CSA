package unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		
setNums(1,5);
	}

	public LoopStats(int beg, int end)
	{
setNums(beg,end);

	}

	public void setNums(int beg, int end)
	{
		start=beg;
		stop=end;

	}

	public int getEvenCount()
	{
		int evenCount=0;
		for(int x=start; x<stop+1;x++){
			if (x%2==0)
				evenCount++;
		}



		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for(int x=start; x<stop+1;x++){
			if (x%2==1)
				oddCount++;
		}




		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		

		for(int x=start; x<stop+1;x++){
			total+=x;
		}

		return total;
	}
	
	public String toString()
	{
		return start + " " + stop+"\ntotal:"+getTotal()+"\nnumber of evens:"+getEvenCount()+"\nnumber of odds:"+getOddCount();
	}
}