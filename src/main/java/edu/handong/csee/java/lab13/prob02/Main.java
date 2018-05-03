package edu.handong.csee.java.lab13.prob02;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Simple Book");
		
		Science science = new Science("Hello Physics!" , "ScienceWorld");
		History history1 = new History("What Is History?" , "E.H.Carr");
		
		book.show();
		science.show();
		history1.show();
		
	}

}
