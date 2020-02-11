/*
Author Cat Smith
Assignment 11-1, create a triangle class that extends geometric object class. 
Date: Febuary 11
*/

import java.util.Scanner;

public class TriangleGeometricObject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter Triangle side 1: ");
		double side1 = input.nextDouble();
		System.out.print("Please enter Triangle side 2: ");
		double side2 = input.nextDouble();
		System.out.print("Please enter Triangle side 3: ");
		double side3 = input.nextDouble();
		
		Triangle triangle1 = new Triangle(side1, side2, side3, "blue", true);
		System.out.println(triangle1.toString());
		System.out.println("Area of Triangle: " + triangle1.getArea());
		System.out.println("Perimeter of Triangle: " + triangle1.getPerimeter());
		System.out.print(triangle1.toStringOrigin());
	}
}