package unit1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Robot extends Canvas
{
   public Robot()    //constructor - sets up the class
   {
      setSize(800,800);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
	   	  head(window);
	      eyes(window);
	      body(window);
	      legs(window);
	      


   }
   public void head(Graphics window){
	   window.setColor(Color.BLUE);
	      window.fillRect(10,10,100,100);
   }
   public void eyes(Graphics window){
	   window.setColor(Color.RED);
	      window.fillRect(20,20,10,10);
	      window.fillRect(80, 20, 10, 10);
   }
   public void body(Graphics window){
	   window.setColor(Color.GREEN);
	      window.fillRect(0, 110, 120, 200);
   }
   public void legs(Graphics window){
	     window.setColor(Color.BLACK);
	      window.drawLine(10, 310, 10, 410);
	      window.drawLine(100, 310, 100, 410);

   }
}
