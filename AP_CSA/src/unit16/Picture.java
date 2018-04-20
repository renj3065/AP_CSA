package unit16;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
  Pixel[][] pixels = this.getPixels2D();
  for (Pixel[] rowArray : pixels)
  {
  for (Pixel pixelObj : rowArray)
  {
  pixelObj.setRed(0);
  pixelObj.setGreen(0);

  }
  }
  }
  
  public void negate()
  {
  Pixel[][] pixels = this.getPixels2D();
  for (Pixel[] rowArray : pixels)
  {
  for (Pixel pixelObj : rowArray)
  {
  pixelObj.setRed(255-pixelObj.getRed());
  pixelObj.setGreen(255-pixelObj.getGreen());
  pixelObj.setBlue(255-pixelObj.getBlue());

  }
  }
  }
  
  public void grayscale()
  {
	  int average;
  Pixel[][] pixels = this.getPixels2D();
  for (Pixel[] rowArray : pixels)
  {
  for (Pixel pixelObj : rowArray)
  {
	  average=(pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3;
  pixelObj.setRed(average);
  pixelObj.setGreen(average);
  pixelObj.setBlue(average);

  }
  }
  }
  public void fixUnderwater()
  {
  Pixel[][] pixels = this.getPixels2D();
  for (Pixel[] rowArray : pixels)
  {
  for (Pixel pixelObj : rowArray)
  {
if(!(pixelObj.getBlue()>150 && pixelObj.getRed()<30)){
  pixelObj.setBlue(pixelObj.getBlue()/2);
  //pixelObj.setRed(pixelObj.getRed()/2);
  //pixelObj.setGreen(pixelObj.getGreen()/2);
}
  }
  }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  public void mirrorHorizontal(){
	  {
		    Pixel[][] pixels = this.getPixels2D();
		    Pixel topPixel = null;
		    Pixel botPixel = null;
		    int height = pixels.length;
		    for (int col = 0; col < pixels[0].length; col++)
		    {
		      for (int row = 0; row < height / 2; row++)
		      {
		        topPixel = pixels[row][col];
		        botPixel = pixels[height-row-1][col];
		        botPixel.setColor(topPixel.getColor());
		      }
		    } 
		  }
  }
  public void mirrorHorizontalBotToTop(){
	  {
		    Pixel[][] pixels = this.getPixels2D();
		    Pixel topPixel = null;
		    Pixel botPixel = null;
		    int height = pixels.length;
		    for (int col = 0; col < pixels[0].length; col++)
		    {
		      for (int row = 0; row < height / 2; row++)
		      {
		        topPixel = pixels[row][col];
		        botPixel = pixels[height-row-1][col];
		        topPixel.setColor(botPixel.getColor());
		      }
		    } 
		  }
  }
  public void mirrorDiagonal(){
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    int height = pixels.length;
	    int width =pixels[0].length;
	    if(width>=height){
	    	for(int x=0;x<height;x++){
		    	for(int y=0;y<=x;y++){
		    		topPixel=pixels[y][x];
		    		botPixel=pixels[x][y];
			        topPixel.setColor(botPixel.getColor());
		    	}
	    	}
	    }
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println("The loop runs "+count+" times.");
  }
  public void mirrorArms()
  {
	  {
		    Pixel[][] pixels = this.getPixels2D();
		    Pixel topPixel = null;
		    Pixel botPixel = null;
		    int mirrorPoint = 194;
		    int height = pixels.length;
		    for (int col = 100; col < 301; col++)
		    {
		      for (int row = 160; row < mirrorPoint; row++)
		      {
		        topPixel = pixels[row][col];
		        botPixel = pixels[mirrorPoint-row+mirrorPoint][col];
		        botPixel.setColor(topPixel.getColor());
		      }
		    } 
		  }
  }
  public void mirrorGull()
  {
	    int mirrorPoint = 355;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 234; row < 326; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 230; col < mirrorPoint ; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row]                       
	                         [mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        count++;
	      }
	    }
	    System.out.println("The loop runs "+count+" times.");
	  }
  public void blur(int x, int y, int width, int height){
	  Pixel[][] pixels = this.getPixels2D();
	  int avgRed;
	  int avgBlue;
	  int avgGreen;
	  
	  for (int startX=x+1;startX<x+width; startX++)
	  {
	  for (int startY=y+1;startY<y+height; startY++)
	  {
	 if(startX<pixels.length-2 && startY<pixels[0].length-2){
		   avgRed=(pixels[startX][startY].getRed()+pixels[startX+1][startY].getRed()+pixels[startX][startY+1].getRed()+pixels[startX-1][startY].getRed()+pixels[startX][startY-1].getRed())/5;
		   avgBlue=(pixels[startX][startY].getBlue()+pixels[startX+1][startY].getBlue()+pixels[startX][startY+1].getBlue()+pixels[startX-1][startY].getBlue()+pixels[startX][startY-1].getBlue())/5;
		   avgGreen=(pixels[startX][startY].getGreen()+pixels[startX+1][startY].getGreen()+pixels[startX][startY+1].getGreen()+pixels[startX+1][startY].getGreen()+pixels[startX+1][startY+1].getGreen())/5;
		   pixels[startX][startY].setRed(avgRed);
		   pixels[startX][startY].setBlue(avgBlue);
		   pixels[startX][startY].setGreen(avgGreen);
		   //pixels[startX+1][startY+1].setRed(avgRed);
		   //pixels[startX+1][startY+1].setBlue(avgBlue);
		   //pixels[startX+1][startY+1].setGreen(avgGreen);
		   //pixels[startX][startY+1].setRed(avgRed);
		   //pixels[startX][startY+1].setBlue(avgBlue);
		   //pixels[startX][startY+1].setGreen(avgGreen);
		   //pixels[startX+1][startY].setRed(avgRed);
		   //pixels[startX+1][startY].setBlue(avgBlue);
		   //pixels[startX+1][startY].setGreen(avgGreen);
		 
	  }
	  }
	  }
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  public void copy(Picture fromPic, 
          int startRow, int startCol, int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol)
	{
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = fromStartRow, toRow = startRow; 
	  fromRow < fromEndRow &&
	  toRow < toPixels.length; 
	  fromRow++, toRow++)
	{
	for (int fromCol = fromStartCol, toCol = startCol; 
	    fromCol < fromEndCol &&
	    toCol < toPixels[0].length;  
	    fromCol++, toCol++)
	{
	 fromPixel = fromPixels[fromRow][fromCol];
	 toPixel = toPixels[toRow][toCol];
	 toPixel.setColor(fromPixel.getColor());
	}
	}   
	}
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    
    
  }

  public void edgeDetection2(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel leftPixel2 = null;

    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    Color rightColor = null;
    Color bottomColor = null;

    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        leftPixel2= pixels[row][col+1];

        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
  
        bottomPixel = pixels[row+1][col];
        bottomColor=bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
        
        
        if (leftPixel2.colorDistance(bottomColor) >
        edgeDist)
        leftPixel.setColor(Color.BLACK);
        else
        leftPixel.setColor(Color.WHITE);
        }
      }
    }


  
  public void myCollage(){
	 
	    Picture person1 = new Picture("barbaraS.jpg");
	    Picture person2 = new Picture("jenny-red.jpg");
	    person1.keepOnlyBlue();
	    person2.fixUnderwater();
	    this.copy(person1,174,168);
	    this.copy(person2, 180, 396,0,90,180,220);
	    this.mirrorHorizontalBotToTop();
	    
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture flower = new Picture("wall.jpg");
    flower.blur(0,0,300, 300);
    flower.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
