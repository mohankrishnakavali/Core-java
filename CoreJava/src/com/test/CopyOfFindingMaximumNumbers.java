package com.test;

import java.util.Arrays;

public class CopyOfFindingMaximumNumbers {
	public static void main(String[] args) {
	int[] numbers={1,2,3,90,89,67};
	Arrays.sort(numbers);
	System.out.println(numbers[numbers.length-2]);
	}
}
