package unit1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics;

public class Shape extends Canvas {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color1;
	private Color color2;
	public Shape(int x, int y, int wid, int ht, Color col1, Color col2)
	   {
			xPos = x;
			yPos = y;
			width = wid;
			height=ht;
			color1=col1;
			color2=col2;
			
	   }
	 public void draw(Graphics window)
	   {
	      window.setColor(color1);
	      window.fillArc(xPos, yPos, width,height,180,180);
	      window.setColor(color2);
	      window.fillArc(xPos+10, yPos+5, width-20,height-10,180,180);
	      //draw whatever you want
	      //    ^
	      //  [ :: ]
	      //    ()

	   }

	   //BONUS
	   //add in set and get methods for all instance variables

	   public String toString()
	   {
	   	return xPos+" "+yPos+" "+width+" "+height+" "+color1+color2;
	   }

}
