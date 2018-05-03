package edu.handong.csee.java.lab13.prob01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend();//defining Friend
		Friend friend2 = new SchoolFriend();//defining SchoolFriend
		Friend friend3 = new ClassFriend();//defining ClassFriend
		
		InstanceOf.WhatFriend(friend1);// creating instancsof
		InstanceOf.WhatFriend(friend2);// creating instancsof
		InstanceOf.WhatFriend(friend3);// creating instancsof

	}

}
