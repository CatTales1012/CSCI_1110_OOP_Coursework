/*
Author: Cat Smith
Assignment: 10-7 create accounts.
Date: February 4
*/
public class Account {
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
		
		public int getId(){
			return id;
		}
		public void setId(int idSet){
			id = idSet;
		}
		
		public double getBalance(){
			return balance; 
		}
		public void setBalance(double balSet){
			balance = balSet;
		}
		
		public java.util.Date getDateCreated(){
			return this.dateCreated;
		}
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		public void setAnnualInterestRate(double airSet){
			annualInterestRate = airSet;
		}
		
		public double getMonthlyInterestRate(){
			monthlyInterestRate = annualInterestRate / 12;
			return monthlyInterestRate;
		}
		public double getMonthlyInterest(){
			return balance * monthlyInterestRate;
		}
		
		public void withdraw(double withdrawValue){
			balance = balance - withdrawValue;
		}
		
		public void deposit(double depositValue){
			balance = balance + depositValue;
		}

}