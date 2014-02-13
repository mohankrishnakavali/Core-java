package com.strings;

public class MethodOverloadVSOverride {
	/*public boolean equals(MethodOverloadVSOverride molo)
	{
		System.out.println("MethodOverloadVSOverride equal method reached");
		return true;
	}
	public static void main(String[] args) {
		
		Object ob1=new MethodOverloadVSOverride();
		Object ob2=new MethodOverloadVSOverride();
		
		MethodOverloadVSOverride ob3=new MethodOverloadVSOverride();
		MethodOverloadVSOverride ob4=new MethodOverloadVSOverride();
		
		if(ob1.equals(ob2))
			System.out.println("ob1 and ob2 are equal");
		else System.out.println("both are not equal");
		
		if(ob3.equals(ob4))System.out.println("ob3 and ob4 are equal");
		else System.out.println("both are not equal");
	}*/
	
	public boolean equals(Object other)
	{
		System.out.println("MethodOverloadVSOverride equal method reached");
		return true;
	}
	public static void main(String[] args) {
		
		Object ob1=new MethodOverloadVSOverride();
		Object ob2=new MethodOverloadVSOverride();
		
		MethodOverloadVSOverride ob3=new MethodOverloadVSOverride();
		MethodOverloadVSOverride ob4=new MethodOverloadVSOverride();
		
		if(ob1.equals(ob2))
			System.out.println("ob1 and ob2 are equal");
		else System.out.println("both are not equal");
		
		if(ob3.equals(ob4))System.out.println("ob3 and ob4 are equal");
		else System.out.println("both are not equal");
	}
}
