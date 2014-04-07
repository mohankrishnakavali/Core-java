package com.DesignPatterns.adapter;

public class ClsCollection extends CollectionBase{
	
	@Override
	public void add(String str){
		System.out.println("Add Element "+str+" to the list");
	}

}
