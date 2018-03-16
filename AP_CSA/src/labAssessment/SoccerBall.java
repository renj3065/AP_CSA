package labAssessment;

public class SoccerBall {
private String brand;
private boolean clean;
public SoccerBall(){
	setBrand("Unknown Brand");
	setClean(false);
}

public SoccerBall(String s){
	setBrand(s);
	setClean(false);
}
public SoccerBall(String s, boolean x){
	setBrand(s);
	setClean(x);
}
public SoccerBall(boolean x){
	setBrand("Unknown Brand");
	setClean(x);
}



private void setBrand(String s){
	brand=s;
}

public void setClean(boolean x){
	clean=x;
}
public boolean getClean(){
	return clean;
}
public String toString(){
	if(getClean())
		return "Clean "+brand+" soccer ball";
	else
		return "Dirty "+brand+" soccer ball";
}
}
