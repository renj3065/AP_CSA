package unit2;

public class SavingsAccount {
	private double interest;
	private double amount;
	public SavingsAccount(){
		interest=0;
		amount=0;
	}
public SavingsAccount(double interRate, double initAm){
	interest=interRate/100;
	amount=initAm;
}
public double addInterest(){
	amount+=amount*interest;	
	return amount;
}
public void deposit(double newMoney)

{

    amount = amount + newMoney;

}

public void withdraw(double oldMoney)

{

    amount = amount - oldMoney;

}

}
