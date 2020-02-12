/*
Author: Cat Smith
Assignment: 11-3 create sub classes for savings and checkings
Date: February 12
*/
public class Checkings extends Accounts {
	private double overdraft;
	public Checkings(int id, double balance){
		super(id, balance);
	}
	public void overdraft(double overdraftLimit){
		overdraftLimit = 350;
		this.overdraft = overdraftLimit;
	}
	public String toString(){
		return  "Account Type: Checkings " + "\nOverdraft Limit: " + overdraft + super.toString();
	}
}