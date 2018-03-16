package labAssessment;

import java.util.Random;

public class SoccerPlayer {
private String name;
private DuffelBag playerBag;
private boolean injury=false;
public SoccerPlayer(String s, DuffelBag d){
	name=s;
	playerBag=d;
}
public void playGame(){
	Random r=new Random();
	int x=r.nextInt(2);
	if(x==0){
		System.out.println(name+" got injured. Bummer.");
		injury=true;
	}
	playerBag.useNextBall();
}
public void getContents(){
	System.out.println(playerBag);
}
public void recover(){
	injury=false;
}
public String toString(){
	if(injury){
		return name+" who is injured.";
	}
	else{
		return name+" who is healthy";
	}
}

}
