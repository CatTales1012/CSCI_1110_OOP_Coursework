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
			return True;
		}
		return False;
	}
	public static Boolean isEven(int value){
		if(value % 2 == 0){
			return True;
		}
		return False;
	}
	public static Boolean isEven(MyInteger value){
		if(value.isEven()){
			return True;
		}
		return False;
	}
	
	public Boolean isOdd(){
		if(this.value % 2 != 0){
			return True;
		}
		return False;
	}
	public static Boolean isOdd(int value){
		if(value % 2 != 0){
			return True;
		}
		return False;
	}
	public static Boolean isOdd(MyInteger value){
		if(value.isOdd()){
			return True;
		}
		return False;
	}
	
	public Boolean isPrime(){
		for(int i = 2; i < this.value; i++){
			if(this.value % i == 0){
				return False;
			}
			return True;
		}
	}
	public static Boolean isPrime(int value){
		for(int i = 2; i < value; i++){
			if(value % i == 0){
				return False;
			}
			return True;
		}
	}
	public static Boolean isPrime(MyInteger value){
		if(value.isPrime()){
			return True;
		}
		return False;
	}
	
	public Boolean equals(MyInteger value){
		
	}
	
	public static int parseInt(char[]){
		
	}
	public static int parseInt(String){
		
	}
	
}
