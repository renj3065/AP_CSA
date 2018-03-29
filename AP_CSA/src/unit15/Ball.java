package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int x, int y, int wd, int ht)
	{
		super(x,y,wd,ht);
		setXSpeed(3);
		setYSpeed(1);
	}
	public Ball(int x, int y, int wd, int ht, Color col,int xsp, int ysp)
	{
		super(x,y,wd,ht, col);
		setXSpeed(xsp);
		setYSpeed(ysp);
	}
	public Ball(int x, int y, int wd, int ht, Color col)
	{
		super(x,y,wd,ht,col);
		setXSpeed(3);
		setYSpeed(1);
	}
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   public void setXSpeed(int x){
	   xSpeed=x;
   }
   public void setYSpeed(int x){
	   ySpeed=x;
   }
   public int getXSpeed(){
	   return xSpeed;
   }
   public int getYSpeed(){
	   return ySpeed;
   }
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball ryan=(Ball) obj;
		
		if(ryan.getColor().equals(this.getColor())){
			if(ryan.getHeight()==this.getHeight()){
				if(ryan.getWidth()==this.getWidth()){
					if(ryan.getXSpeed()==this.getXSpeed()){
						if(ryan.getYSpeed()==this.getYSpeed()){
							return true;

						}
					}
				}
			}
		}

		return false;
	}   

   //add the get methods

   //add a toString() method
	public String toString(){
		String output="";
		output+=super.toString()+", "+xSpeed+", "+ySpeed;
		return output;
	}
	
	public boolean didCollideLeft(Object obj){
		Paddle temp=(Paddle) obj;
		if( getX() <= temp.getX() +temp.getWidth()+Math.abs(getXSpeed())){
			if(getY()>=temp.getY() && getY()<=temp.getY()+temp.getHeight()){
				return true;
			}
			if(getY() +getHeight() >= temp.getY() && getY()+getHeight()<=temp.getY()+temp.getHeight()){
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
		if( getX() >= temp.getX()+Math.abs(getXSpeed())){
			if(getY()>=temp.getY() && getY()<=temp.getY()+temp.getHeight()){
				return true;
			}
			if(getY() +getHeight() >= temp.getY() && getY()+getHeight()<=temp.getY()+temp.getHeight()){
				return true;
			}
		}
		
				//set Y speed to negative of current speed
				//else
				//set X speed to negative of current speed				
		return false;
	
	}
	public boolean didCollideTop(){
		if(getY()<=0){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(){
		if(getY()>=550){
			return true;
		}
		return false;
	}
}