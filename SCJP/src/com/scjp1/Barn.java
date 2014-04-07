package com.scjp1;

public class Barn {

	public static void main(String[] args) {
		new Barn().go(1, "hi");
		new Barn().go(2, "HI","Helloworld");

	}
	public void go(int x,String...y){
		System.out.println(y[y.length-1]+"");
		System.out.println(y);
	}

}
