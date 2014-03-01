package com.test;

public class ArrayOpt {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 5, 7 };
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			
		}
		System.out.println("max number is = " + max);
	}

}
