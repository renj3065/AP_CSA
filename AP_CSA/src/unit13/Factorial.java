package unit13;

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
public static void main(String[] args){
	Factorial test=new Factorial(10);
	System.out.println(test.calc(10));
	System.out.println(test.recCalc(10,10));

}
}