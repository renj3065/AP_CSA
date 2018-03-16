package labAssessment;

import java.util.ArrayList;

public class DuffelBag {
private ArrayList<SoccerBall> duff;
public DuffelBag(){
	duff=new ArrayList<SoccerBall>();
}

public void addBall(SoccerBall s){
	duff.add(s);
}
public void clean(){
	for(SoccerBall s: duff){
		s.setClean(true);
	}
}
public void useNextBall(){
	int ball2use=-1;
	for(int x=0;x<duff.size();x++){
		if(duff.get(x).getClean()){
			ball2use=x;
		}
	}
	if(ball2use==-1){
		System.out.println("No clean balls to use!");
	}
	else{
		System.out.println("Used:"+duff.get(ball2use).toString());
	}
}
public String toString(){
	String output="";
	for(SoccerBall s: duff){
		output+=s.toString()+"\n";
	}
	return "Contents:\n"+output;
}
}
