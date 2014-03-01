package com.test;

public class CompareStrings {

	public static void main(String[] args) {
		String str1="mohankrishnakavali";
		String str2="mohanakrishnakavali";
		char[] cArray = str1.toCharArray();
		System.out.println(cArray);
	}
    private static String[] split1(String string)  
    {  
        char[] chars = string.toCharArray();  
        String[] strings = new String[chars.length];  
        for (int i = 0; i < chars.length; i++)  
        {  
            strings[i] = String.valueOf(chars[i]);  
        }  
        return strings;  
    }  
  

}
