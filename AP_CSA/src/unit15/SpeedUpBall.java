package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y,10,10, Color.black, xSpd, ySpd);

   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht, Color.black,xSpd,ySpd);


   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht,col,xSpd,ySpd);



   }

   public void setXSpeed( int xSpd )
   {
	   super.setXSpeed(xSpd);



   }

   public void setYSpeed( int ySpd )
   {
	   super.setYSpeed(ySpd);




   }
   public boolean didCollideLeft(Object obj){
		Paddle temp=(Paddle) obj;
		if( getX() <= temp.getX() +temp.getWidth()+Math.abs(getXSpeed())){
			if(getY()>=temp.getY() && getY()<=temp.getY()+temp.getHeight()){
				setXSpeed(getXSpeed()-1);
				return true;
			}
			if(getY() +getHeight() >= temp.getY() && getY()+getHeight()<=temp.getY()+temp.getHeight()){
				setXSpeed(getXSpeed()-1);
				
				return true;
			}
		}
		
				//set Y speed to negative of current speed
				//else
				//set X speed to negative of current speed				
		return false;
   }
   public boolean didCollideRight(Object obj){

		Paddle temp=(Paddle) obj;
		if( getX() + getWidth()>= temp.getX()-getXSpeed()){
			if(getY()>=temp.getY() && getY()<=temp.getY()+temp.getHeight()){
				setXSpeed(getXSpeed()+1);
				System.out.println("DUB");
				return true;
			}
			if(getY() +getHeight() >= temp.getY() && getY()+getHeight()<=temp.getY()+temp.getHeight()){
				setXSpeed(getXSpeed()+1);

				return true;
			}
		}
		
				//set Y speed to negative of current speed
				//else
				//set X speed to negative of current speed				
		return false;
	
	}
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);

      setX(getX()+getXSpeed());
		//setY
      setY(getY()+getYSpeed());
		//draw the ball at its new location
      draw(window);
   }
}

