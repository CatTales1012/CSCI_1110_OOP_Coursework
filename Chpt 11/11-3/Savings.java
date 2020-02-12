/*
Author: Cat Smith
Assignment: 11-3 create sub classes for savings and checkings
Date: February 12
*/
public class Savings extends Accounts {
	private double balance;
	public Savings(int id, double balance){
		super(id, balance);
		this.balance = balance;
	}
	public void withdraw(double withdrawValue){
		super.withdraw(withdrawValue);
		if(balance - withdrawValue < 0){
			//if balance - withdraw is less than 0, give an error message
			System.out.print("Sorry, insufficent funds. Try withdrawing less.");
		}
		else{
			balance = balance - withdrawValue;
		}
	}
	public String toString(){
		return "Account Type: Savings " + super.toString();
	}
}