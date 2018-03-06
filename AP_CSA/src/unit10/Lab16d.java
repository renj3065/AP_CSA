package unit10;

import static java.lang.System.*;

import java.io.File;

public class Lab16d
{
	public static void main( String args[] )
	{
		//make a new MadLib
		
		out.println("\n");
		String madLibFile=System.getProperty("user.dir")+"\\src\\unit10\\story.dat";

		MadLib test=new MadLib(madLibFile);
	}
}