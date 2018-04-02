package unit15;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block
{
 //instance variables


 public Wall()
 {
		super(10,10);
 }


 //add the other Paddle constructors


 public Wall(int x, int y)
	{
		super(x,y);
	}

	public Wall(int x, int y, int wd, int ht)
	{
		super(x,y,wd,ht);
	}
	public Wall(int x, int y, int wd, int ht, Color col)
	{
		super(x,y,wd,ht,col);
	}
 //add a toString() method
 public String toString(){
		String output="";
		output+=super.toString();
		return output;
	}
}
