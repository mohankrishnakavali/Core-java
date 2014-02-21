package com.strings;


public class StringSplit {
	public static void main(String[] args) {
		String str="mohank";
		//System.out.println(str.length());
		/*String string=java.util.Arrays.toString(str.split("(?<=\\G..)"));
		System.out.println(string);*/
		String[] splitvalues=str.split("(?<=\\G..)");
		
		String rev="";
		 for(String s:splitvalues){
			 rev +=s;
			 System.out.println(rev);
			 String reverse ="", ogs=rev;
				int len=ogs.length();
				
				for(int i=len-1;i>=0;i--)
				{
					reverse =reverse+ogs.charAt(i);
				}
				
				System.out.println("Reverse String is : "+reverse);
			}
		 System.out.println(rev);
			 
		 }
	
}
