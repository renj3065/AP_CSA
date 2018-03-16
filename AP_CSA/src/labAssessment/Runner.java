package labAssessment;

public class Runner {
	public static void main(String[] args) {
	DuffelBag bag1=new DuffelBag();
	bag1.addBall(new SoccerBall("Nike",true));
	bag1.addBall(new SoccerBall("Adidas",false));
	bag1.addBall(new SoccerBall("Puma",true));
	
	DuffelBag bag2=new DuffelBag();
	bag2.addBall(new SoccerBall(false));
	bag2.addBall(new SoccerBall("Adidas"));
	
	DuffelBag bag3=new DuffelBag();
	bag3.addBall(new SoccerBall("Adidas",true));
	bag3.addBall(new SoccerBall("Adidas",true));
	
	SoccerPlayer player1=new SoccerPlayer("Sam",bag1);
	SoccerPlayer player2=new SoccerPlayer("Bill",bag2);
	SoccerPlayer player3=new SoccerPlayer("Jillian", bag3);
	
	SoccerTeam temp=new SoccerTeam("Barcalona");
	temp.recruit(player1);
	temp.recruit(player2);
	temp.recruit(player3);
	System.out.println(temp);
	temp.playGame();
	System.out.println("Team after game:");
	System.out.println(temp);

	temp.viewBags();

	temp.heal();
	
	System.out.println(temp);
	

	}
}
