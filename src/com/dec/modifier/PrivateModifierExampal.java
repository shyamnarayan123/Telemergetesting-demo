package com.dec.modifier;

public class PrivateModifierExampal {
// private member can be access within the current class only.
// we can  not access the out side of class .	
		int idd=100;//default
	public	String name1="shyam";//default
	private int id=100;
	private String name="shyam";
	private void m1() {
		System.out.println("Hii Cheking Private");
	}
	

	public static void main(String[] args) {
		PrivateModifierExampal  ref=new PrivateModifierExampal ();
		System.out.println(ref.id);
		System.out.println(ref.name);
		ref.m1();
		
	}

}
