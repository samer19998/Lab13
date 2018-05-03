package edu.handong.csee.java.lab13.prob02;

public class Book {
	
	private static int idCount=0;
	private String Name;
	private int id;
	public Book(String Name)
	{
		this.Name = Name;
		idCount++;
		id = idCount;
		
	}
public String toString()
{
	return "\n\tId: " + id + "\n\tBook Name: " + Name;
		
}
	public void show()
	{
		System.out.println("<<<Book>>>" + this.toString());
	}
}
