/*
Author: Cat Smith
Assignment: 10-7, create an ATM for the 9-7 Accounting assignment
Date: January 31
*/
import java.util.Scanner;
public class Atm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//These are the ID's 
		int[] id = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.print("Enter an ID: ");
		int check = input.nextInt();
		
		//Boolean to return true or false if it is valid 
		Boolean isIn = false;
		for(int i = 0; i < id.length; i++){
			if(check == id[i]){
				isIn = true;
			}
		}	
		//while it is false, try again
		while(isIn == false){
			System.out.print("Please Enter a Valid Id: ");
			check = input.nextInt();
			
			for(int i = 0; i < id.length; i++){
				if(check == id[i]){
					isIn = true;
				}
			}
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
				System.out.print()
			}
			
		}
		
	}
}