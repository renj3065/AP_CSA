package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setPos(100,150);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);

	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y, int wd, int ht, Color cl){
		setPos(x,y);
		setWidth(wd);
		setHeight(ht);
		setColor(cl);
		
	}
	public Block(int x, int y){
		setPos(x,y);
		setWidth(10);
		setHeight(10);
		setColor(Color.black);
		
	}
	
	public Block(int x, int y, int wd, int ht){
		setPos(x,y);
		setWidth(wd);
		setHeight(ht);
		setColor(Color.black);
		
	}
	
	public void setPos( int x, int y){
		xPos=x;
		yPos=y;
	}
	public void setX( int x ){
		xPos=x;
	}
	public int getX(){
		return xPos;
	}
	public void setY( int y ){
		yPos=y;
	}
	public int getY(){
		return yPos;
	}
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color=col;

   }
   
   public Color getColor(){
	   return color;
   }
   
   public void setWidth(int wd){
	   width=wd;
   }
   
   public int getWidth(){
	   return width;
   }
   
   public void setHeight(int ht){
	   height=ht;
   }
   
   public int getHeight(){
	   return height;
   }
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block ryan=(Block) obj;
		if(ryan.getColor().equals(this.getColor())){
			if(ryan.getHeight()==this.getHeight()){
				if(ryan.getWidth()==this.getWidth()){
					return true;
				}
			}
		}


		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		String output="";
		output+=xPos+", "+yPos+", "+width+", "+height+", "+color;
		return output;
	}
}