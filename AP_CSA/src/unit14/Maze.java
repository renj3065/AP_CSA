package unit14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
ArrayList<Integer> indices;
private int[][] track;
private int trackX;
private int trackY;
private int[][] atMat;
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		atMat=new int[size][size];
		Scanner keyboard=new Scanner(line);
		for(int x=0;x<size;x++){
			for(int y=0;y<size;y++){
				atMat[x][y]=keyboard.nextInt();
			}
		}
		track=new int[atMat.length][atMat[0].length];
		for(int x=0;x<atMat.length;x++){
			for(int y=0;y<atMat[0].length;y++){
				track[x][y]=0;
			}
		}
		
	}
	public ArrayList<Integer> countAts(int r, int c, int original)
	{
		if(original==0){
			trackX=r;
			trackY=c;
			indices=new ArrayList<Integer>();
			original++;
		}
		  int row = atMat.length;
		  int col = atMat[0].length;
		if(atMat[r][c]==1 && track[r][c]==0){
			track[r][c]=1;
			indices.add(c);
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
		
		
		return indices;
	}
	public boolean hasExitPath(int r, int c)
	{
		if(countAts(r,c,0).indexOf(atMat.length-1)>-1){
			return true;
		}
		return false;
	}

	public String toString()
	{
		String output="";


		for (int i = 0; i < atMat.length; i++) {
		    for (int j = 0; j < atMat[i].length; j++) {
		        output+=atMat[i][j] + " ";
		    }
		    	output+="\n";
		}
		
		if(hasExitPath(1,1)){
			output+="\nThere is an exit";
		}
		else{
			output+="\nThere is no exit";
		}
		
		return output;
	}
}