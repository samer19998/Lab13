package edu.handong.csee.java.lab13.prob03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double n1, n2;//defining the variables as double
		Scanner keyboard= new Scanner(System.in);//constructor
		
		
		System.out.print("Enter Radius");//print the line given
		n1 = keyboard.nextDouble();//
		Circle c1 = new Circle(n1);//instantiating
		
		System.out.println("Radius: " + c1.get_Radius());//print the line given
		c1.display();// to show c1
		
		System.out.print("Enter length and width");//print the line given
		n1=keyboard.nextDouble();//to get the value n1 from the Scanner
		n2=keyboard.nextDouble();//to get the value n2 from the Scanner
		Rectangle r1 = new Rectangle(n1, n2);//instantiating
		
		System.out.println("Length: "+ r1.get_length());//order to print the line 
		System.out.println("Width: "+ r1.get_Width());// order to print the line
		r1.display();

	}

}
