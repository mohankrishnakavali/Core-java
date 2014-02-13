package com.strings;

public class StringTrimMethod {

	public static void main(String[] args) {
		/*String s=" hello ";
		s +=" world ";
		System.out.println(s.length());
	    String s2=	s.trim();
		System.out.println(s2.length());
		System.out.println(s2);
		System.out.println(s.length());
		*/
		
		/*String s = " Hello ";
		s += " World ";
		System.out.println(s.length());
		String s1=		s.trim( );
		System.out.println(s1.length());*/
		
		StringBuilder sb=new StringBuilder(" Hello ");
		sb.append(" world ");
		System.out.println(sb.capacity());
		System.out.println(sb.toString().trim());
		
	}

}
