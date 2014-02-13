package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SerachInArrayList {

	public static void main(String[] args) {
		int k=0;
		//int k=0;;
		List<Integer> numbers= new ArrayList<Integer>();
		for(int i=0;i<=500;i++)
		{
			numbers.add(k);
			k++;
		}
		//System.out.println("I Value list is : "+numbers);
	
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String value;
		do
		{
			System.out.println("Please enter number : ");
			Integer searchValue=sc.nextInt();
			System.out.println(numbers.contains(searchValue));
			System.out.println("Again (Y/N) ");
			value=sc1.next();
		
		}while(value.equals("y"));
		
		
		/*	while(i<=100){
			numbers.add(i);
			i++;
		}
		System.out.println(numbers);*/
	}

}
