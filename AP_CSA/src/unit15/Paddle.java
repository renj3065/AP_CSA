package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
		speed =5;
   }


   //add the other Paddle constructors


   public Paddle(int x, int y)
	{
		super(x,y);
		setSpeed(5);
	}
	public Paddle(int x, int y, int spd)
	{
		super(x,y);
		setSpeed(speed);
	}
	public Paddle(int x, int y, int spd, int wd, int ht)
	{
		super(x,y,wd,ht);
		setSpeed(spd);
	}
	public Paddle(int x, int y, int wd, int ht, Color col, int spd)
	{
		super(x,y,wd,ht,col);
		setSpeed(spd);
	}


	public void setSpeed(int x){
		speed=x;
	}




   public void moveUpAndDraw(Graphics window)
   {
	   if(getY()>0){
		   draw(window,Color.white);


			//setY
	      setY(getY()-speed);
			//draw the ball at its new location
	      draw(window);
	   }
   }

   public void moveDownAndDraw(Graphics window)
   {
	   if(getY()+getHeight()<540){
	   System.out.println("Why D:");
	   draw(window,Color.white);


		//setY
	   setY(getY()+speed);
		//draw the ball at its new location
	   draw(window);
	   }
   }

   //add get methods
   public int getSpeed(){
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
		String output="";
		output+=super.toString()+", "+speed;
		return output;
	}
}