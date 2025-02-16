package com.dec.modifier2;

public class ProtectedExample {
	protected int id =100;
	protected String name="Hydrabad";
	
	public static void main(String[] args) {
		ProtectedExample ref=new ProtectedExample();
		System.out.println(ref.id);
		System.out.println(ref.name);
	}

}
