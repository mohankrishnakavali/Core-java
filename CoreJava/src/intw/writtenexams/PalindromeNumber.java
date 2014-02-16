package intw.writtenexams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		String original;
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter name :");
		original=sc.next();
		List<String> rev= new ArrayList<String>();
		
		int length=original.length();	
		for(int i=length-1;i>=0;i--)
		{
			rev.add(reverse+original.charAt(i));
		//	System.out.println(reverse);
		}
		System.out.println(rev);
		//System.out.println(reverse);
		/*if(reverse.equals(original))
		{
			System.out.println("given string is polindrome");
		}else
		{
			System.out.println("given string is not-polindrome");
		}*/
	}
	
	
}
