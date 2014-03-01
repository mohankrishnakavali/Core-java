package com.test;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] numbers={1,2,3,4,590909,9999996,99999};
		int f1=1,f2=0,f3=0,num=0;
		
		for(int i=0;i<numbers.length;i++){  
			num=numbers[i];
			if(f1<num){
				f3=f1;
				f1=num;
				num=f3;
			}
			if(f2<num){
				f3=f2;
				f2=num;
				num=f3;
			}
		}
		System.out.println("First Highest "+f1+" Second Highest "+f2 +" Third Highest : "+f3);
	}

}
