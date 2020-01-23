/*
Author: Cat Smith
Assignment: 9-7, create Accounts.
Date: January
*/
class Accounting {
	public static void main(String[] args) {
		
	}
}
class Accounts {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account(){
		
	}
	Account(int i , double b){
		id = i;
		balance = b;
	}
	
	getId(){
		return id;
	}
	void setId(int idSet){
		id = idSet;
	}
	
	getBalance(){
		return balance; 
	}
	void setBalance(double balSet){
		balance = balSet;
	}
	
	getAnnualInterestRate(){
		return annualInterestRate;
	}
	void setAnnualInterestRate(double airSet){
		annualInterestRate = airSet;
	}
	
	getMonthlyInterestRate(double monthlyInterestRate){
		monthlyInterestRate = annualInterestRate / 12;
		return montlyInterestRate;
	}
	getMonthlyInterest(double monthlyInterestRate){
		return balance * montlyInterestRate;
	}
	
	void withdraw(double withdrawValue){
		balance = balance - withdrawValue;
	}
	
	void deposit(double depositValue){
		balance = balance + depositValue;
	}
}