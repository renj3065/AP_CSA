package unit1;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
	   	  window.setColor(Color.BLUE);
	      window.drawString("SMILEY FACE LAB ", 35, 35);

	      window.setColor(Color.YELLOW);
	      window.fillOval( 210, 100, 400, 400 );
	      
	      window.setColor(Color.BLACK);
	      window.drawArc(350, 250,100,100,180,180);
	      window.fillOval( 300, 200, 10, 10 );
	      window.fillOval( 400, 200, 10, 10 );



   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here


   }
}