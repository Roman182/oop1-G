package lab4;

public class Account_Test {

	public static void main(String[] args) {
		
		
		Account A1 = new Account (" Khan Shaheb", " zeroseven", 250000);
		System.out.println(A1);
		A1.show();
		A1.Deposit(5000);
		A1.Withdraw(25000);
		System.out.println();
		
		A1.CurrentBalance(25000,5000,2500);
		
		
		
		
		
		
	}

}
