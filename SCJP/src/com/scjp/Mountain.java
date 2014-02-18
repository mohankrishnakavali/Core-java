package com.scjp;

class Atom{
	Atom(){
		System.out.println("Atom");
	}
}
class Rock extends Atom{
	public Rock(String type) {
		System.out.println(type);
	}
}
public class Mountain extends Rock{
	public Mountain() {
		super("granite");
		new Rock("granite");
	}

	public static void main(String[] a) {
		new Mountain();

	}

}
