package unit2;

public class Runway {
	private double speed;
	private double accel;
public Runway(double spd, double accl){
	speed=spd;
	accel=accl;
	calculateRunway();
}
public void calculateRunway(){
	System.out.println("Minimum runway length: "+speed*speed/(2*accel));
}
}
