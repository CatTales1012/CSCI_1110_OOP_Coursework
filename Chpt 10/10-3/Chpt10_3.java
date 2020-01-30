/*
Author: Cat Smith
Assignment: 10-3, create a MyInteger Class and create a client Program
Date: January 30
*/
class Chpt10_3 {
	public static void main(String[] args) {
		char[] myChar = {'1','5','6','5'};
		int testChar = MyInteger.parseInt(myChar);
		
		MyInteger aValue = new MyInteger(3);
		
		System.out.println("The Integer information: ");
		System.out.println(aValue.getValue());
		
		//Test if it is even or odd through both methods(all versions of the methods)
		if(aValue.isEven() == true){
			System.out.println("A Value is Even");
		}
		if (aValue.isOdd()){
			System.out.println("A Value is Odd");
		}
		//Test if it is prime(all versions of the method)
		if(aValue.isPrime() == true){
			System.out.println("A Value is Prime");
		}
		else{
			System.out.println("A Value is not Prime");
		}
		//Test if it is equal to specified value
		if(aValue.equals(3)){
			System.out.print("A value is equal to specified value.");
		}
		else{
			System.out.print("A value is not equal to specified value.");
		}
		System.out.print(testChar);
	}
}