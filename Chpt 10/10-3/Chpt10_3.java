/*
Author: Cat Smith
Assignment: 10-3, create a MyInteger Class and create a client Program
Date: January 30
*/
class Chpt10_3 {
	public static void main(String[] args) {

		MyInteger aValue = new MyInteger(3);
		if(aValue.isEven() == true){
			System.out.println("A Value is Even");
		}
		else{
			System.out.println("A Value is Odd");
		}
		System.out.println(aValue.getValue());
		if(aValue.equals(3)){
			System.out.print("A value is equal to specified value.");
		}
		else{
			System.out.print("A value is not equal to specified value.");
		}
	}
}