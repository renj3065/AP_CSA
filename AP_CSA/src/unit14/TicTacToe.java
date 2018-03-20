package unit14;


import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		mat=new char[3][3];
		for(int x=0;x<game.length();x++){
		if(x<3){
			mat[0][x]=game.charAt(x);
		}
		else if(x<6){
			mat[1][x-3]=game.charAt(x);
		}
		else{
			mat[2][x-6]=game.charAt(x);
		}
		}



	}

	public String getWinner()
	{
		for(int x=0;x<3;x++){
			if((mat[x][0]==mat[x][1])&&(mat[x][1]==mat[x][2])){
				return mat[x][1]+" wins horizonatally!";
			}
		}

		for(int x=0;x<3;x++){
			if((mat[0][x]==mat[2][x])&&(mat[1][x]==mat[2][x])){
				return mat[x][1]+" wins vertically!";
			}
		}
		if((mat[0][0]==mat[1][1])&&(mat[1][1]==mat[2][2])){
			return mat[1][1]+" wins diagonally!";
		}
		if((mat[0][2]==mat[1][1])&&(mat[1][1]==mat[2][0])){
			return mat[1][1]+" wins diagonally!";
		}


		return "It is a draw";
	}

	public String toString()
	{
		String output="";


		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        output+=mat[i][j] + " ";
		    }
		    	output+="\n";
		}
		output+="\n"+getWinner();



		return output+"\n\n";
	}
}