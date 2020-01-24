/*
Author: Cat Smith
Assignment: 9-7, create Accounts.
Date: January
*/
class Accounting {
	public static void main(String[] args) {
		/*
		Account ID = 1122, Balance = 20,000, a.i.r. = 4.5%.
		Withdraw 2,500 then deposit 3,000. Print Balance, monthly interest, and date account was created. 
		Should look like-
		
		Account ID 1122
		*Balance: $20,500
		Annual Interest Rate: 4.5%
		*Monthly Interest Rate: 3.75%
		*Date Account was Created: [todays date]
		
		* = Important that it is showed for credit. 
		
		*/
		Account account = new Account(1122, 20000);
		account.withdraw(2500);  account.deposit(3000); account.setAnnualInterestRate((4.5 / 100)); 
		System.out.println("Account Information: ");
		System.out.println("Account ID " + account.getId());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Account Start Date: " );
	}
}
class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double monthlyInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account(){
		
	}
	Account(int i , double b){
		id = i;
		balance = b;
	}
	
	int getId(){
		return id;
	}
	void setId(int idSet){
		id = idSet;
	}
	
	double getBalance(){
		return balance; 
	}
	void setBalance(double balSet){
		balance = balSet;
	}
	
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	void setAnnualInterestRate(double airSet){
		annualInterestRate = airSet;
	}
	
	double getMonthlyInterestRate(){
		monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	double getMonthlyInterest(){
		return balance * monthlyInterestRate;
	}
	
	void withdraw(double withdrawValue){
		balance = balance - withdrawValue;
	}
	
	void deposit(double depositValue){
		balance = balance + depositValue;
	}
}