package edu.handong.csee.java.lab13.prob03;

public class Circle extends Shape {
	double Radius;// variable defined as double
	
	public Circle()// method
	{
		Radius = 0;
	}
	
	public Circle(double Radius)//method
	{
		this.Radius = Radius;//constructor
	}
	public double area() {//method that has a return value
		double Area;//defining Area as double value
		Area = Math.PI*Radius*Radius;//mathematical equation to measure area
		return Area;//return value
	}
	public double perimeter() {//method
		double Perimeter;//defining perimeter as double value
		Perimeter = 2*Math.PI;//mathematical equation to measure perimeter
		return Perimeter;//return value
	}
	public double get_Radius() {//method that returns a value
		return Radius;// return value for the method
	}

}
