/*
Author: Cat Smith
Assignment: 11-3 create sub classes for savings and checkings
Date: February 12
*/
public class Checkings extends Accounts {
	private double overdraftLimit;
	public Checkings(int id, double balance){
		super(id, balance);
	}
	public void overdraft(double overdraftLimit){
		overdraftLimit = (0 - 350);
		this.overdraftLimit = overdraftLimit;
	}
	public String toString(){
		return  "Account Type: Checkings " + "\nOverdraft Limit: " + overdraftLimit + super.toString();
	}
}