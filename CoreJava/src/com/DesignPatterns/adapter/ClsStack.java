package com.DesignPatterns.adapter;

public class ClsStack extends Stack {
	
	@Override
	public void push(String s){
		System.out.println("Pushed Element "+s+" in stack");
	}

}
