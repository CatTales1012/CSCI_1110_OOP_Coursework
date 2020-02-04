/*
Author: Cat Smith
Assignment: 10-7, create an ATM for the 9-7 Accounting assignment
Date: February 4
*/
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//These are the ID's
		Account [] id = new Account[10];
		for(int i = 0; i < id.length; i++){
			id[i] = new Account(i, 100);
		}
		
		System.out.print("Enter an ID: ");
		int check = input.nextInt();
		
		while (id <= 0 && id >10){
			System.out.print("Enter an ID: ");
			check = input.nextInt();
		}
		//boolean isIn = false;
		while (true){
			
			while (id <= 0 && id >10){
				System.out.print("Enter an ID: ");
				check = input.nextInt();
			}
			
			System.out.println("Main Menu");
			System.out.println("1) Check Balance");
			System.out.println("2) Withdraw");
			System.out.println("3) Deposit");
			System.out.println("4) Exit");
			System.out.print("Enter a choice: ");
			int choice = input.nextInt();
			
			if(choice == 1){
				System.out.println(id[check].getBalance());
			}
			else if(choice == 2){
				System.out.print("Withdraw Amount: ");
				double withdrawn = input.nextDouble();
				id[check].withdraw(withdrawn);
			}
			else if(choice == 3){
				System.out.print("Deposit Amount: ");
				double deposited = input.nextDouble();
				id[check].deposit(deposited);
			}
			else if(choice == 4){
				System.out.print("Enter an ID: ");
				check = input.nextInt();
			}
		}			
			
			
			
	}
}