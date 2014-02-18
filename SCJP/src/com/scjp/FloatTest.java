package com.scjp;

public class FloatTest {
	
	public static void parse(String str){
		try{
		float f=Float.parseFloat(str);
		}catch(NumberFormatException nfe){
			//f=0;// f not available in catch block
		}
		
	}
	public static void main(String[] args) {

	}

}
