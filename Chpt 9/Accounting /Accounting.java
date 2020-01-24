/*
Author: Cat Smith
Assignment: 9-7, create Accounts.
Date: January 24
*/
public class Accounting {
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
		account.withdraw(2500);  account.deposit(3000); account.setAnnualInterestRate((4.5 / 100)); account.getMonthlyInterest();
		System.out.println("Account Information: ");
		System.out.println("Account ID " + account.getId());
		System.out.printf("Balance: $%.2f" , account.getBalance());
		System.out.println();
		System.out.println("Monthly Interest Rate: " + (account.getMonthlyInterestRate() * 100) + "%");
		System.out.println("Annual Interest Rate: " + (account.getAnnualInterestRate() * 100) + "%");
		System.out.println("Account Start Date: " + account.getDateCreated());
	}
}
