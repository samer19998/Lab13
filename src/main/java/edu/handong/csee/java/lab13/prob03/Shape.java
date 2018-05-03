package edu.handong.csee.java.lab13.prob03;

public abstract class Shape {//abstract class
	public abstract double area();//method
	public abstract double perimeter();//method
	public void display()//method
	{
		System.out.println("Area: " +area()+ "\nperimeter: "+perimeter() +"\n");// order to print the line
	}
	

}
