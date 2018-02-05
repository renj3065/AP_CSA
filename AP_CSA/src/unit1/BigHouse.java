package unit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
	      window.setColor(Color.BLUE);

	      window.drawString( "BIG HOUSE ", 50, 50 );

	      window.setColor(Color.BLUE);
	      window.fillRect( 200, 200, 400, 400 );
	      window.setColor(Color.RED);

	      window.fillRect(150, 100, 500, 100);
   }

   public void bigHouse( Graphics window )
   {



   }
}


