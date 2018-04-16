package unit15;
<<<<<<< HEAD


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

public class BrickBreaker extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	//private Paddle leftPaddle;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;

	private Wall topWall;
	private Wall bottomWall;
	private Wall rightWall;
	private Wall leftWall;
	private Block block1;
	private Block block2;

	private Block block3;
	private Block block4;
	private Block block5;

	private int points=0;

	public BrickBreaker()
	{
		//set up all variables related to the game
				setBackground(Color.WHITE);
		setVisible(true);

		ball=new Ball(100,100,10,10, Color.GREEN, 3, 3);
		
		//instantiate a left Paddle
		
		paddle=new Paddle(100,100,80,20, Color.GREEN,6);
		System.out.println("Johnny Ren Period 4 4/5/2018 computer 34");
		//instantiate a right Paddle
		
		//rightPaddle=new Paddle(600,100,20,80, Color.RED,6);

		
		topWall=new Wall(0,0,800,10);
		bottomWall=new Wall(0,550,800,10);
		leftWall=new Wall(0,0,10,600);
		rightWall=new Wall(750,0,10,600);

		block1=new Block(0,400, 50,5);
		block2=new Block(55,400, 50,5);
		block3=new Block(110,400, 50,5);
		block4=new Block(165,400, 50,5);
		block5=new Block(220,400, 50,5);

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
		

		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		//rightPaddle.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		block1.draw(graphToBack);
		block2.draw(graphToBack);

		block3.draw(graphToBack);
		block4.draw(graphToBack);
		block5.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(ball.didCollideTop(topWall))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.white);
				graphToBack.setColor(Color.white);

				graphToBack.drawString("Score:"+points, 100, 100); 

				points=0;
				graphToBack.setColor(Color.black);
				graphToBack.drawString("Score:"+points, 100, 100); 
		
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
		if(ball.didCollideTop(paddle)){
			ball.setYSpeed(-1*ball.getYSpeed());
		}


		

		if(ball.didCollideLeft(leftWall)){
			if( ball.getX() <= leftWall.getX() +leftWall.getWidth()- Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-1*ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-1*ball.getXSpeed());
			}
		}
		if(ball.didCollideRight(rightWall)){
			if( ball.getX() >= rightWall.getX()- Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-1*ball.getYSpeed());

			}
			else{
				ball.setXSpeed(-1*ball.getXSpeed());
			}
		}
	
		//see if the ball hits the right paddle
		if(ball.didCollideBottom(bottomWall)){
				ball.setYSpeed(-1*ball.getYSpeed());
		}
	

		if(ball.didCollideBottom(block1) || ball.didCollideTop(block1)){
			block1.draw(graphToBack,Color.WHITE);
			block1.setWidth(0);
			block1.setHeight(0);
			ball.setYSpeed(-ball.getYSpeed());
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score:"+points, 100, 100); 

			points++;
			graphToBack.setColor(Color.black);
			graphToBack.drawString("Score:"+points, 100, 100); 
		}
		if(ball.didCollideBottom(block2) || ball.didCollideTop(block2)){
			block2.draw(graphToBack,Color.WHITE);
			block2.setWidth(0);
			block2.setHeight(0);
			ball.setYSpeed(-ball.getYSpeed());
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score:"+points, 100, 100); 

			points++;
			graphToBack.setColor(Color.black);
			graphToBack.drawString("Score:"+points, 100, 100); 
		}
		if(ball.didCollideBottom(block3) || ball.didCollideTop(block3)){
			block3.draw(graphToBack,Color.WHITE);
			block3.setWidth(0);
			block3.setHeight(0);
			ball.setYSpeed(-ball.getYSpeed());
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score:"+points, 100, 100); 

			points++;
			graphToBack.setColor(Color.black);
			graphToBack.drawString("Score:"+points, 100, 100); 
		}
		if(ball.didCollideBottom(block4) || ball.didCollideTop(block4)){
			block4.draw(graphToBack,Color.WHITE);
			block4.setWidth(0);
			block4.setHeight(0);
			ball.setYSpeed(-ball.getYSpeed());
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score:"+points, 100, 100); 

			points++;
			graphToBack.setColor(Color.black);
			graphToBack.drawString("Score:"+points, 100, 100); 
		}
		if(ball.didCollideBottom(block5) || ball.didCollideTop(block5)){
			block5.draw(graphToBack,Color.WHITE);
			block5.setWidth(0);
			block5.setHeight(0);
			ball.setYSpeed(-ball.getYSpeed());
			graphToBack.setColor(Color.white);

			graphToBack.drawString("Score:"+points, 100, 100); 

			points++;
			graphToBack.setColor(Color.black);
			graphToBack.drawString("Score:"+points, 100, 100); 
		}
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveRightAndDraw(graphToBack);


		}


		












		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;

		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;

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
=======
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

public class BrickBreaker extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	//private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;

	private Wall topWall;
	private Wall bottomWall;
	private Wall rightWall;
	private Wall leftWall;
	private int pointsLeft=0;
	private int pointsRight=0;
	private Block block1;
	private Block block2;
	public BrickBreaker()
	{
		//set up all variables related to the game
				setBackground(Color.WHITE);
		setVisible(true);

		ball=new Ball(100,100,10,10, Color.GREEN, 1, 1);
		
		//instantiate a left Paddle
		
		paddle=new Paddle(400,400,80,20, Color.GREEN,6);
		
		//instantiate a right Paddle
		
		//rightPaddle=new Paddle(600,100,20,80, Color.RED,6);

		
		topWall=new Wall(0,0,800,10);
		bottomWall=new Wall(0,520,800,10);
		leftWall=new Wall(0,0,10,600);
		rightWall=new Wall(765,0,10,600);
		block1=new Block(100,100,100, 100);
		block1=new Block(500,100,100, 100);
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
		paddle.draw(graphToBack);
		//rightPaddle.draw(graphToBack);
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		leftWall.draw(graphToBack);
		block1.draw(graphToBack);
		if(ball.didCollideBottom(block1) || ball.didCollideTop(block1)){
			ball.setYSpeed(-ball.getYSpeed());
			block1.draw(graphToBack,Color.white);
			block1.setWidth(0);
			block1.setHeight(0);
		}
		
		//see if ball hits left wall or right wall
		if(ball.didCollideBottom(bottomWall))
		{
			System.out.println("why");
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
		if(ball.didCollideTop(topWall)){
			ball.setYSpeed(-1*ball.getYSpeed());
		}

		if(ball.didCollideBottom(paddle)){
			ball.setYSpeed(-1*ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		if(ball.didCollideLeft(leftWall)){
			if( ball.getX() <= leftWall.getX() +leftWall.getWidth()- Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-1*ball.getYSpeed());

			}
			else{
				ball.setXSpeed(-1*ball.getXSpeed());
			}
		}
		
	
		//see if the ball hits the right paddle
		if(ball.didCollideRight(rightWall)){
			if( ball.getX() >= rightWall.getX()- Math.abs(ball.getXSpeed())){
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
			paddle.moveRightAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveLeftAndDraw(graphToBack);


		}



		












		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;

		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;

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
>>>>>>> refs/remotes/origin/master
