package unit17;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Powerup {
	private Image image;
	private int xPos;
	private int yPos;
	public Powerup(){
		xPos=100;
		yPos=450;
		try
		{
			image = ImageIO.read(new File("src\\unit17\\pu.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Cannot open powerup");
		}
	}
	public void draw( Graphics window )
	{
   	window.drawImage(image,xPos,yPos,40,40,null);
	}
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	public void setPos(int x, int y){
		xPos=x;
		yPos=y;
	}
}
