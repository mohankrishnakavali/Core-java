package com.test;

import java.util.Scanner;

public class MissingCharectorFinding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int stringLength1, stringLength2;
		char characters1[], characters2[];
		boolean b = false;
		String input1, input2;

		System.out.print("Enter a word1: ");
		input1 = scan.nextLine();
		System.out.print("Enter a word2: ");
		input2 = scan.nextLine();
		stringLength1 = input1.length();
		stringLength2 = input2.length();
		characters1 = input1.toCharArray();
		characters2 = input2.toCharArray();
		
		for (int i = 0; i < characters1.length; i++) {
			for (int j = 0; j < characters2.length; j++) {
				if (characters1[i]==(characters2[j])) {
					b = true;
					System.out.println("arrayA element \"" + characters1[i]
							+ "\" was found in arrayB");
				}
			}
			if (b == false) {
				System.out.println("arrayA element \"" + characters1[i]
						+ "\" was Not found in arrayB");
			}
			b = false;
		}
	}

}
