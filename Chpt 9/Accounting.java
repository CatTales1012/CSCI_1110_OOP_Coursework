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
		
	}
	setId(int idSet){
		id = idSet;
	}
	
	getBalance(){
		
	}
	setBalance(double balSet){
		balance = balSet;
	}
	
	getAnnualInterestRate(){
		
	}
	setAnnualInterestRate(double airSet){
		annualInterestRate = airSet;
	}
	
	getMonthlyInterestRate(){
		
	}
	getMonthlyInterest(){
		
	}
	
	withdraw(double withdrawValue){
		balance = balance - withdrawValue;
	}
	
	deposit(double depositValue){
		balance = balance + depositValue;
	}
}