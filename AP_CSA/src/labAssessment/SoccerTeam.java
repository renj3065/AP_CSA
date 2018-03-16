package labAssessment;

import java.util.ArrayList;

public class SoccerTeam {
private String club;
private ArrayList<SoccerPlayer> team;
public SoccerTeam(String s){
	club=s;
	team=new ArrayList<SoccerPlayer>();
}
public void recruit(SoccerPlayer s){
	team.add(s);
}

public void playGame(){
	for(SoccerPlayer s:team){
		s.playGame();
	}
}
public String toString(){
	String output="";
	for(SoccerPlayer s:team){
		output+=s.toString()+"\n";
	}
	return output;
}

public void heal(){
	for(SoccerPlayer s:team){
	s.recover();
	}
}
public void viewBags(){
	for(SoccerPlayer s:team){
		s.getContents();
		}
}
}
