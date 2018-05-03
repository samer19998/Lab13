package edu.handong.csee.java.lab13.prob02;

public class Science extends Book{
	
	private String publisher;//variable as a string
	public Science(String Name, String Publisher)//two string to define the Science book
	{
			super(Name);//to get book class
			this.publisher = Publisher;//constructor
	}
	public String toString()//to get the String from the book class
	{
		return super.toString() + "\n\tPublisher: "+
				publisher;//to give the name to the string method
	}
	public void show()//method to show the result
	{
		System.out.println("<<<Science>>>" + this.toString());
	}
}
