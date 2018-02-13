package unit5;
public class CheckSSN{
private String ssn; 
private int count;
public CheckSSN(){
ssn= "123-45-6789" ;
}

public CheckSSN(String s){
ssn=s;
}

public boolean valid(){
for(int x=0;x<ssn.length();x++){
	if(ssn.charAt(x)<=57 && ssn.charAt(x)>=48 || ssn.charAt(x)==45)
		count+=0;
	else
		count++;
}
if (count==0)
	return true;

return false;

}

public static void main(String[] arg){
	CheckSSN test=new CheckSSN("12-344-4442");
	if (test.valid())
		System.out.println("VALID");
	else
		System.out.println("INVALID");
	
}

}
