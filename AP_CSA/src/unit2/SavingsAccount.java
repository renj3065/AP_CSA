package unit2;

public class SavingsAccount {
	private double interest;
	private double amount;
public SavingsAccount(double interRate, double initAm){
	interest=interRate/100;
	amount=initAm;
}
public double addAmount(){
	amount+=amount*interest;	
	return amount;
}
}
