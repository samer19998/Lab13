package edu.handong.csee.java.lab13.prob01;

public class InstanceOf {
	
	public static void WhatFriend(Friend friend)
	{
		
		if(friend instanceof ClassFriend)//if statement
			((ClassFriend)friend).ClassFriend();
		
		else if(friend instanceof SchoolFriend)
			((SchoolFriend)friend).SchoolFriend();
		
		else 
				friend.JustFriend();
	}

}
