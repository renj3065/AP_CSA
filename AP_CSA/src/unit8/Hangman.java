package unit8;

import java.util.Random;
import java.util.Scanner;

public class Hangman{
  Random rn=new Random();
  String[] wordBank={"potato","broccoli","noodles","zebra","computer"};
  Scanner keyboard=new Scanner(System.in);
  
  public Hangman(){
	  play();
}
  public void play(){
	  String answer;
	  String display="";
	  String displayStart="";
	  char input;
	  char playGame='y';
	  int countWrong;
	  while(playGame=='y'){
		  int[] oldGuesses=new int[26];

		  countWrong=0;
		  display="";
		  answer=wordBank[rn.nextInt((wordBank.length))];  

	  for(int x=0;x<answer.length();x++){
		  display+="*";
	  }
	  
	  do{
		System.out.print("Enter a letter in the word "+display+">\n");
		input=keyboard.next().charAt(0);
		if(oldGuesses[input-97]==0){
		displayStart=display;
		for(int y=0;y<answer.length();y++){
			if(answer.charAt(y)==input){
				if(y==answer.length()-1)
					display=display.substring(0, y)+input;
				else
					display=display.substring(0, y)+input+display.substring(y+1);
			}
			
		}
		}

		if(displayStart.equals(display) && oldGuesses[input-97]==0){
			System.out.println(input+" is not in the word.");
			countWrong++;
			}
		else if (oldGuesses[input-97]==1) {
			System.out.println(input+" is already in the word.");
	}
		else{
			oldGuesses[input-97]=1;
		}
		
		
	  }while(!display.equals(answer));
	  
	  
	  System.out.println("The word is "+answer+". You had "+countWrong+" wrong guesses. Good job!");
	  
	  System.out.println("Would you like to play again? (y/n)");
	  playGame=keyboard.next().charAt(0);
	  }
  }
  
}