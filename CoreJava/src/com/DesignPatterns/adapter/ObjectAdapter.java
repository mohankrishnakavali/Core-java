package com.DesignPatterns.adapter;

public class ObjectAdapter extends ClsCollection{
	
	private ClsStack clsStack=new ClsStack();
	
	public void add(String str){
		clsStack.push(str);
	}
	
	public static void main(String[] args) {
		ObjectAdapter oa=new ObjectAdapter();
		oa.add("mohan");
	}

}
