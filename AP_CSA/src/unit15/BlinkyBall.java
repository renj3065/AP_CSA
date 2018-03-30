package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {

	   super(x,y);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
super(x,y,wid,ht);


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {


super(x,y,wid,ht, Color.black,xSpd,ySpd);
   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {


super(x,y,wid,ht,col,xSpd,ySpd);

   }

   public Color randomColor()
   {
	   Random bleh=new Random();
   	int r = bleh.nextInt(256);//use Math.random()
 		int g = bleh.nextInt(256);
 		int b = bleh.nextInt(256);
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   draw(window,Color.white);

	      setX(getX()+getXSpeed());
			//setY
	      setY(getY()+getYSpeed());
			//draw the ball at its new location
	      System.out.println("BLAH");
	      System.out.println(randomColor());
	      draw(window,randomColor());



   }
}