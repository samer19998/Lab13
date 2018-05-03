package edu.handong.csee.java.lab13.prob5;

public class Equals {
	
	public static boolean equals(int[][] m1, int[][] m2)  {//method that returns a value
		int count = 0;//variable as integer value
		if (m1.length != m2.length)//if statement
			return false;// return value 
			for (int i = 0; i < m1.length; i++)//defining the loop
		{
			for (int j = 0; j < m1[i].length; j++)
			{
				if (m1[i][j] != m2[i][j])//if statement
					count++;//add one every loop
			}
		}
			if(count<= 3)// if statement
				return false;//// if count variable is equal or smaller than 3 it returns false
			else
				return true;//else it returns true
		}
	

}
