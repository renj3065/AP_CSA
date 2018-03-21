package unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private int[][] track;
   private int trackX;
   private int trackY;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
		track=new int[atMat.length][atMat[0].length];
		for(int x=0;x<atMat.length;x++){
			for(int y=0;y<atMat[0].length;y++){
				track[x][y]=0;
			}
		}
	}

	public int countAts(int r, int c, int original)
	{
		if(original==0){
			trackX=r;
			trackY=c;
			atCount=0;
			original++;
		}
		  int row = atMat.length;
		  int col = atMat[0].length;
		if(atMat[r][c]=='@' && track[r][c]==0){
			track[r][c]=1;
			atCount++;
			if(r+1>-1 && r+1<row)
				 countAts(r+1,c,original);
				
			if(r-1>-1 && r-1<row)
				 countAts(r-1,c,original);
			if(c+1>-1 && c+1<col)
				 countAts(r,c+1,original);
			if(c-1>-1 && c-1<col)
				 countAts(r,c-1,original);
		}
		//add in recursive code to count up the # of @s connected
		
		//start checking at spot [r,c]
		
		
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=trackX+" "+trackY+" has "+getAtCount()+" @s connected.";
		return output;
	}
}