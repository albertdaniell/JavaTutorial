class Account{

	String name;
	int amount;
	int bal=2000;
	
	void deposit(int amt) {
		amount=amt;
		bal=bal+amt;
		System.out.println("You have deposited ksh "+amt);
		printBalance();
		
	}
	
	void withdraw(int amt) {
		if(amt>bal) {
			System.out.println("You have inssuficient funds to wthdraw "+amt);
			
		}
		else {
			bal=bal-amt;
			System.out.println("You have withdrawn ksh "+amt+ " Balance is "+bal);
		}
		
	}
	
	void printBalance() {
		System.out.println("Balance is "+bal);
	}
	
	
	
}

public class Bank {
	public static void main(String args[]) {
		Account act=new Account();
		act.deposit(30000);
		act.withdraw(202200);
		act.printBalance();
		
	}

}
