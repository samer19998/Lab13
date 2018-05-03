package edu.handong.csee.java.lab13.prob02;

public class History extends Book {
	private String Author;
	public History(String Name ,String Author)
	{
	super(Name);
	this.Author = Author;
	{
	
	   } 
	}
	public String toString()// A method to get String from Book class
	{
		return super.toString() + "\n\tAuthor: "+
			Author;
	}
		public void show()
		{
			System.out.println("<<<History>>>" +this.toString());
		{
		}
		
	}

}
