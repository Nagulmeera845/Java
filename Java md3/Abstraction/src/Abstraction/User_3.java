package Abstraction;
interface ATM{
	void Withdraw();
	void Deposit();
	void Pinchange();
}
class Icici_Atm implements ATM{    //we are using it instead of extends
	public void Withdraw() {
		System.out.println("Withdraw");
	}
	public void Deposit() {
		System.out.println("Deposit");
	}
	public void Pinchange() {
		System.out.println("Deposit");
	}
}
class City_Atm implements ATM{  // we are using it instead of extends
	public void Withdraw() {
		System.out.println("Withdraw");
	}
	public void Deposit() {
		System.out.println("Deposit");
	}
	public void Pinchange() {
		System.out.println("Deposit");
	}
}

public class User_3 {

	public static void main(String[] args) {
		ATM a1=new Icici_Atm();   //upcasting
		a1.Withdraw();
		a1.Deposit();
		a1.Pinchange();
		ATM a2=new City_Atm();   //upcasting
		a2.Withdraw();
		a2.Deposit();
		a2.Pinchange();

	}

}
