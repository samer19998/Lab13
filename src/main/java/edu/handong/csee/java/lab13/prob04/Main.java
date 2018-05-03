package edu.handong.csee.java.lab13.prob04;
import java.util.Scanner;//import the scanner class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cat_name, dog_name;//variable as a String (names)
		
		Master master = new Master();//instantiating
		Cat cat = new Cat();//instantiating
		Dog dog = new Dog();//instantiating
		
		Scanner keyboard = new Scanner(System.in);// constructor
		System.out.println("enter the names of both the cat and the dog");//print out the line given, so we can enter the variables according to the line
		cat_name = keyboard.next();//getting the name from the scanner class
		dog_name = keyboard.next();//getting the name from the scanner class
		
		cat.setName(cat_name);//set the name of the cat
		cat.getName(cat_name);//getting the name
		master.feed(cat);//the method that was defined in the master class
		
		
		dog.setName(dog_name);//setting the name
		dog.getName(dog_name);//getting the name
		master.feed(dog);//the method that was defined in the master class

	}

}
