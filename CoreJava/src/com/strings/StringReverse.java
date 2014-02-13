package com.strings;

public class StringReverse {

	public static void main(String[] args) {
		String reverse ="", ogs="mohan";
		int len=ogs.length();
		
		for(int i=len-1;i>=0;i--)
		{
			reverse =reverse+ogs.charAt(i);
		}
		
		System.out.println("Reverse String is : "+reverse);
	}

}
