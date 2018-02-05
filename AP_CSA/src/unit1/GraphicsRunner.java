package unit1;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner(int x)
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);
		if(x==1){
		getContentPane().add(new SmileyFace());
		}
		else if(x==2){
			getContentPane().add(new BigHouse());

		}
		else if(x==3){
			getContentPane().add(new Robot());
		}
		else if(x==4){
			getContentPane().add(new ShapePanel());
		}
		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner(0);
	}
}