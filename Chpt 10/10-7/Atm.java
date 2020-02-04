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
		
		boolean isIn = false;
		for(int i = 0; i < id.length; i++){
			if(id[check]){
				isIn = true;
			}
			
			//while it is true, here are the menu options
			while(isIn == true){
				System.out.println("Main Menu");
				System.out.println("1) Check Balance");
				System.out.println("2) Withdraw");
				System.out.println("3) Deposit");
				System.out.println("4) Exit");
				System.out.print("Enter a choice: ");
				int choice = input.nextInt();
				
				if(choice == 1){
					System.out.println(id.getBalance());
				}
				else if(choice == 2){
					System.out.print("Withdraw Amount: ");
					double withdrawn = input.nextDouble();
					id.withdraw(withdrawn);
				}
				else if(choice == 3){
					System.out.print("Deposit Amount: ");
					double deposited = input.nextDouble();
					id.deposit(deposited);
				}
				else if(choice == 4){
					isIn = false;
				}
			}
		}
		
		//Boolean to return true or false if it is valid 
			
		//while it is false, try again
		while(isIn == false){
			System.out.print("Please Enter a Valid Id: ");
			check = input.nextInt();
			
			for(int i = 0; i < id.length; i++){
				if(check == id.getId()){
					isIn = true;
				}
			
			
				//while it is true, here are the menu options
				while(isIn == true){
					System.out.println("Main Menu");
					System.out.println("1) Check Balance");
					System.out.println("2) Withdraw");
					System.out.println("3) Deposit");
					System.out.println("4) Exit");
					System.out.print("Enter a choice: ");
					int choice = input.nextInt();
					
					if(choice == 1){
						System.out.println("Balance is 100");
					}
					else if(choice == 2){
						System.out.print("Withdraw Amount: ");
						int withdrawn = input.nextInt();
						//subtract from balance here
					}
					else if(choice == 3){
						System.out.print("Deposit Amount: ");
						int deposited = input.nextInt();
						//add to balance here
					}
					else if(choice == 4){
						isIn = false;
						break;
					}
				}
			}
		}
	}
}