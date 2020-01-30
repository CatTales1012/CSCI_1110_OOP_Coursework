/*
Author: Cat Smith
Assignment: 10-3, create a MyInteger Class and create a client Program
Date: January 30
*/
class MyInteger {
	int value;
	
	MyInteger(int myValue){
		value = myValue;
	}
	public int getValue(){
		return value;
	}
	
	public Boolean isEven(){
		if(this.value % 2 == 0){
			return true;
		}
		return false;
	}
	public static Boolean isEven(int value){
		if(value % 2 == 0){
			return true;
		}
		return false;
	}
	public static Boolean isEven(MyInteger value){
		if(value.isEven()){
			return true;
		}
		return false;
	}
	
	public Boolean isOdd(){
		if(this.value % 2 != 0){
			return true;
		}
		return false;
	}
	public static Boolean isOdd(int value){
		if(value % 2 != 0){
			return true;
		}
		return false;
	}
	public static Boolean isOdd(MyInteger value){
		if(value.isOdd()){
			return true;
		}
		return false;
	}
	
	public Boolean isPrime(){
		return (isPrime(this.value));
	}
	public static Boolean isPrime(int value){
		for(int i = 2; i < value; i++){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}
	public static Boolean isPrime(MyInteger value){
		if(value.isPrime()){
			return true;
		}
		return false;
	}
	public Boolean equals(int value){
		return true;
	}
	public Boolean equals(MyInteger value){
		return true;
	}
	
	public static int parseInt(char[] valueChar){
		int out = 0;
		for(int i = 0; i < valueChar.length; i++){
			int temp = parseInt((valueChar[i]) - 48);
			out = out * 10 + temp;
		}
		return out;
	}
	public static int parseInt(String value){
		char[] aValue = value.toCharArray();
		int something = parseInt(aValue);
		return something;
	}
	
}
