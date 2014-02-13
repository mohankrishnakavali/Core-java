package com.scjp;

public class Person {
	private String name, comment;
	private int age;
	public Person(String n,int a,String c)
	{
		this.age=a;
		this.name=n;this.comment=c;
	}
	public boolean equals(Object o) {
		 if (! (o instanceof Person)) return false;
		 Person p = (Person)o;
		 return age == p.age && name.equals(p.name);
		 }
public static void main(String[] args) {
	Person p1=new Person("mohan", 1, "hi");
	boolean br=p1.equals(p1);
	System.out.println(br);
}
}
