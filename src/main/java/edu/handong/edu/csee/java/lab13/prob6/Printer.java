package edu.handong.edu.csee.java.lab13.prob6;


public class Printer {
	public static void print(Object object)
	{
		
		String str = object.toString();//
		if(object instanceof CapitalPrint)//if statement
			str = str.toUpperCase();//
		System.out.println(str);//print out the string name
	}

}
