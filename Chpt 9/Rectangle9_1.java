/*
Author: Cat Smith
Date: January 23
Assignment: 9-1 Create a rectangle with specifics. 
*/
public class Rectangle9_1 {
	public static void main(String[] args) {
		//Rectangle 1 should have 40 height and 4 width
		Rectangle rectangle1 = new Rectangle(40, 4);
		System.out.println("For Rectangle 1:");
		System.out.print("The width is " + rectangle1.width + ". ");
		System.out.print("The height is " + rectangle1.height + ". ");
		System.out.print("The area is " + rectangle1.getArea() + ". ");
		System.out.println("The perimeter is " + rectangle1.getPerimeter() + ". ");
		
		//Rectangle 2 should have 35.9 height and 3.5 width
		Rectangle rectangle2 = new Rectangle(35.9, 3.5);
		System.out.println("For Rectangle 2:");
		System.out.print("The width is " + rectangle2.width + ". ");
		System.out.print("The height is " + rectangle2.height + ". ");
		System.out.print("The area is " + rectangle2.getArea() + ". ");
		System.out.println("The perimeter is " + rectangle2.getPerimeter() + ". ");
	}
}
class Rectangle{
	double height;
	double width;
	
	Rectangle(){
		height = 1;
		width = 1;
	}
	
	Rectangle(double h , double w){
		this.height = h;
		this.width = w;
	}
	
	double getArea(){
		return width * height;
	}
	double getPerimeter(){
		return (width * 2) + (height * 2);
	}
	void setHeight(double h){
		height = h;
	}
	void setWidth(double w){
		width = w;
	}
}
