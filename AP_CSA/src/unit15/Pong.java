package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;

	private Wall topWall;
	private Wall bottomWall;
	
	private int pointsLeft=0;
	private int pointsRight=0;
	public Pong()
	{
		//set up all variables related to the game
				setBackground(Color.WHITE);
		setVisible(true);

		ball=new Ball(100,100,10,10, Color.GREEN, 3, 3);
		
		//instantiate a left Paddle
		
		leftPaddle=new Paddle(100,100,20,80, Color.GREEN,6);
		
		//instantiate a right Paddle
		
		rightPaddle=new Paddle(600,100,20,80, Color.RED,6);

		
		topWall=new Wall(10,800);



		//set up the Canvas
		
	

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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
		graphToBack.setColor(Color.black);
		graphToBack.drawString("Right score:"+pointsRight, 100, 100); 
		graphToBack.setColor(Color.black);
		graphToBack.drawString("Left score:"+pointsLeft, 600, 100); 

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		topWall.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.white);
			if(ball.getX()<100){
				graphToBack.setColor(Color.white);

				graphToBack.drawString("Right score:"+pointsRight, 100, 100); 

				pointsRight++;
				graphToBack.setColor(Color.black);
				graphToBack.drawString("Right score:"+pointsRight, 100, 100); 
			}
			if(ball.getX()>100){
				graphToBack.setColor(Color.white);

				graphToBack.drawString("Left score:"+pointsLeft, 600, 100); 

				pointsLeft++;
				//System.out.println("DAB");
				graphToBack.setColor(Color.black);

				graphToBack.drawString("Left score:"+pointsLeft, 600, 100); 

			}
			Random r=new Random();

			ball.setPos(400, r.nextInt(100)+100);
			if(r.nextInt(2)==0){
				ball.setXSpeed(r.nextInt(2)+1);
			}
			else{
				ball.setXSpeed((r.nextInt(2)+1)*-1);
			}
			if(r.nextInt(2)==0){
				ball.setYSpeed(r.nextInt(2)+1);
			}
			else{
				ball.setYSpeed((r.nextInt(2)+1)*-1);
			}
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.didCollideTop(rightPaddle)){
			ball.setYSpeed(-1*ball.getYSpeed());
		}

		if(ball.didCollideBottom(rightPaddle)){
			ball.setYSpeed(-1*ball.getYSpeed());
		}
		

		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftPaddle)){
			if( ball.getX() <= leftPaddle.getX() +leftPaddle.getWidth()- Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-1*ball.getYSpeed());

			}
			else{
				ball.setXSpeed(-1*ball.getXSpeed());
			}
		}
		
	
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightPaddle)){
			if( ball.getX() >= rightPaddle.getX()- Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-1*ball.getYSpeed());

			}
			else{
				ball.setXSpeed(-1*ball.getXSpeed());
			}
		}
		
		


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);


		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);

		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);

		}


		












		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}