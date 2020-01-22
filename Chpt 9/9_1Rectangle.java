class 9_1Rectangle {
	public static void main(String[] args) {
		
	}
	class Rectangle{
		double height = 1;
		double width = 1;
		
		Rectangle(){
		
		}
		
		Rectangle(double h; double w;){
			height = h;
			width = w;
		}
		
		double getArea(){
			return width * height;
		}
		double getPerimeter(){
			return (width * 2) + (height * 2);
		}
	}
}