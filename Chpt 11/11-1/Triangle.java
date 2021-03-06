/*
Author Cat Smith
Assignment 11-1, create a triangle class that extends geometric object class. 
Date: Febuary 11
*/
public class Triangle extends GeometricObject{
	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}
	public double getPerimeter(){
		double perimeter = this.side1 + this.side2 + this.side3;
		return perimeter;
	}
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}