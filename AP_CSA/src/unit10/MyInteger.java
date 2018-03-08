package unit10;

public class MyInteger {
int num;

public MyInteger(int x){
	num=x;
}

public int getValue(){
	return num;
}

public boolean isEven(){
	if(num%2==0){
		return true;
	}
	return false;
}

public boolean isOdd(){
	if(num%2==0){
		return false;
	}
	return true;
}

public boolean isPrime(){
	if(num<=1){
		return false;
	}
	if(num==2){
		return true;
	}
	for(int x=2;x<num;x++){
		if(num%x==0){
			return false;
		}
	}
	return true;
}


public static boolean isEven(int x){
	if(x%2==0){
		return true;
	}
	return false;
}

public static boolean isOdd(int x){
	if(x%2==0){
		return false;
	}
	return true;
}

public boolean isPrime(int x){
	if(x<=1){
		return false;
	}
	if(x==2){
		return true;
	}
	for(int y=2;y<num;y++){
		if(x%y==0){
			return false;
		}
	}
	return true;
}

public boolean equals(int x){
	if (getValue()==x){
		return true;
	}
	return false;
}

public boolean equals(MyInteger x){
	if (getValue()==x.getValue()){
		return true;
	}
	return false;
}

public static int parseInt(char[] x){
	int ryan=0;
	int num=0;
	for(int y=x.length-1;y>=0;y--){
		ryan+=((int)x[y]-48)*Math.pow(10, num);
		num++;
	}
	return ryan;
	
}

public static int parseInt(String x){
	int ryan=0;
	int num=0;
	for(int y=x.length()-1;y>=0;y--){
		ryan+=((int)x.charAt(y)-48)*Math.pow(10, num);
		num++;
	}
	return ryan;
}

public static void main(String[] args){
	char[] ryan={'1','2','3'};
	int temp=MyInteger.parseInt(ryan);
	String howard="123";
	int temp1=MyInteger.parseInt(howard);
	System.out.println(temp);
	System.out.println(temp1);
}

}
