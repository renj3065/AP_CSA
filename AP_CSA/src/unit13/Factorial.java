package unit13;

import java.util.Random;

public class Factorial {
public Factorial(int x){
	calc(x);
	recCalc(x,x);

}

public int calc(int n){
	int answer=1;
	for(int x=0;x<n;x++){
		answer=answer*(n-x);
	}
	return answer;
}

public int recCalc(int n, int x){
	int answer=n*(x-1);
	x--;
	if(x<1){
		return n;
	}
	else{
		return recCalc(answer,x);
	}
}

public int FindMax(int[] x, int index){
	 if (index > 0) {
	        return Math.max(x[index], FindMax(x, index-1));
	    } else {
	        return x[0];
	    }
	
	
}
public void generateMatrix(){
	int[][] temp=new int[6][6];
	Random r=new Random();
	for(int x=0;x<temp.length;x++){
		for(int y=0;y<temp[0].length;y++){
			temp[x][y]=r.nextInt(2);
		}
	}
	String output="";


	for (int i = 0; i < temp.length; i++) {
	    for (int j = 0; j < temp[i].length; j++) {
	        output+=temp[i][j] + " ";
	    }
	    	output+="\n";
	}
	
	System.out.println(output);
	boolean even=true;
	int sum;
	for(int x=0;x<6;x++){
		even=true;
		sum=0;
		for(int y=0;y<6;y++){
			sum+=temp[x][y];
		}
		if(sum%2==1){
			even=false;
		}
		if(even){
			System.out.println("There is an even number of 1s in row "+x);
		}
		else
			System.out.println("There is an odd number of 1s in row "+x);
	}
	

	
	 even=true;
	for(int x=0;x<6;x++){
		even=true;
		sum=0;
		for(int y=0;y<6;y++){
			sum+=temp[y][x];
		}
		if(sum%2==1){
			even=false;
		}
		if(even){
			System.out.println("There is an even number of 1s in column "+x);
		}
		else
			System.out.println("There is an odd number of 1s in column "+x);
	}
	
	
}
public static void main(String[] args){
	Factorial test=new Factorial(10);
	System.out.println(test.calc(10));
	System.out.println(test.recCalc(10,10));
	int[] temp={1,2,3};
System.out.println(test.FindMax(temp, temp.length-1));
test.generateMatrix();

}
}
