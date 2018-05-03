package edu.handong.csee.java.lab13.prob03;

public class Rectangle extends Shape {
	double width;// variable defined as double
	double length;// variable defined as double

	public Rectangle() {//method
		width =0;
		length =0;
	}
	public Rectangle(double width , double length) {//method the get the values of length and width
		this.length = length;//defining lengthand width
		this.width = width;
	}
	public double area() {//method that returns a value
		double Area;// Area as a double value
		Area = width*length;//mathematical equation
		return Area;//return the value of area

	}
	public double perimeter() {// method
		double perimeter;//perimeter as a double value
		perimeter = 2*width + 2*length;//mathematical equation
		return perimeter;////return the value of perimeter
	}
	public double get_Width() {// method that returns a value
		return width;
	}
	public double get_length() {// method that returns a value
		return length;
	}


}
