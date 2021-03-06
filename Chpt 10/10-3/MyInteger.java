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
	
	public boolean isEven(){
		if(this.value % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isEven(int value){
		if(value % 2 == 0){
			return true;
		}
		return false;
	}
	public static boolean isEven(MyInteger value){
		if(value.isEven()){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(){
		if(this.value % 2 != 0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(int value){
		if(value % 2 != 0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger value){
		if(value.isOdd()){
			return true;
		}
		return false;
	}
	
	public boolean isPrime(){
		return (isPrime(this.value));
	}
	public static boolean isPrime(int value){
		for(int i = 2; i < value; i++){
			if(value % i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(MyInteger value){
		if(value.isPrime()){
			return true;
		}
		return false;
	}
	public boolean equals(int value){
		if(this.value == value){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger value){
		return equals(this.value);
	}
	
	public static int parseInt(char[] valueChar){
		int out = 0;
		for(int i = 0; i < valueChar.length; i++){
			int temp = (int)(valueChar[i]) - 48;
			out = out * 10 + temp;
		}
		return out;
	}
	public static int parseInt(String value){
		char[] aValue = value.toCharArray();
		int hold = parseInt(aValue);
		return hold;
	}
	
}
