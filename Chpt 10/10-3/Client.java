/*
Author: Cat Smith
Assignment: 10-3, create a MyInteger Class and create a client Program
Date: January 30
*/
import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value to be tested: ");
		int theValue = input.nextInt();
		
		//Test the parseInt(char[]) method
		char[] myChar = {'n','o'};
		int testChar = MyInteger.parseInt(myChar);
		
		//Test the parseInt(String) method
		String myString = "Yes";
		int testString = MyInteger.parseInt(myString);
		
		MyInteger aValue = new MyInteger(theValue);
		
		System.out.println("The Integer information: ");
		
		//Print the value to test the constructor and getter method.
		System.out.println("The Value being tested is " + aValue.getValue() + ".");
		
		//Test if it is even or odd through both methods(all versions of the methods)
		if(aValue.isEven() == true){
			System.out.println("A Value is Even.");
		}
		//Put in this way to specifically test the isOdd() method
		if (aValue.isOdd()){
			System.out.println("A Value is Odd.");
		}
		//Test if it is prime(all versions of the method)
		if(aValue.isPrime() == true){
			System.out.println("A Value is Prime.");
		}
		else{
			System.out.println("A Value is not Prime.");
		}
		//Test if it is equal to specified value
		if(aValue.equals(3)){
			System.out.println("A value is equal to specified value.");
		}
		else{
			System.out.println("A value is not equal to specified value.");
		}
		//Testing the parse for char
		System.out.println("The Value(s) for the Parse Int Character is (Original word being 'n''o'): " + testChar + ".");
		//Testing the parse for String
		System.out.println("The Value(s) for the Parse Int String is (Original word being 'yes'): " + testString + ".");
	}
}