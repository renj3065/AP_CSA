package unit17;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;

	
	private ArrayList<Alien> aliens;
	private ArrayList<Ammo> shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other stuff
		ship=new Ship(300,400,4);
		aliens=new ArrayList<Alien>();
		shots=new ArrayList<Ammo>();
		aliens.add(new Alien(100,100,3));
		aliens.add(new Alien(200,100,3));

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		for(Alien a: aliens){
			a.draw(graphToBack);
		}
		for(Ammo s: shots){
			s.draw(graphToBack);
		}
		boolean  first=true;
		int click=0;

		for(Alien a: aliens){
			//if(first){
			a.move("LEFT");
			//}
		}
		first=false;
		if(ship.getX()+10>0){
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		}
		if(ship.getX()<700){
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		}
		if(ship.getY()>0){
		if(keys[2] == true)
		{
			ship.move("UP");
			System.out.println(ship.getY());
		}
		}
		if(ship.getY()<440){
		if(keys[3] == true)
		{
			ship.move("DOWN");
			System.out.println(ship.getY());

		}
		}
		
		if(keys[4] == true)
		{
			System.out.println(ship.getX());
			shots.add(new Ammo(ship.getX(),ship.getY(),5));

		}
		//add code to move stuff
		
		//add in collision detection
		for(Alien a: aliens){
		if(a.getX()<0 || a.getX()>750){
			a.setSpeed(-a.getSpeed());
		}
		}
		for(Ammo s: shots){
			if(s.getY()<-10){
				s.setSpeed(0);
			}
		}
		for(Ammo s: shots){
			for(Alien a: aliens){
				if(s.getY()==a.getY()+50 && (s.getX()>=a.getX() && s.getX()<a.getX()+50)){
					a.setPos(-100, -100);
				}
			}
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}