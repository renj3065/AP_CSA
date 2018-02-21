package unit7;
import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("X",3);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		

		for(int x=1; x<size+1; x++){
			for(int z=size-x; z>0; z--){
				output+=" ";
			}

			for(int y=0; y<x;y++){
				
				output+=letter;
			}
						output+="\n";
		}
		return output;
	}
}