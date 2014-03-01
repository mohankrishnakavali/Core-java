package com.test;

import java.util.Scanner;

public class Task21 {

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
		for (int i = 0; i < stringLength1; i++) {
			// System.out.println(characters[i]);
			for (int j = 0; j < stringLength2; j++) {
				if (characters1[i]==(characters2[j])) {
					System.out.println(characters1[i]+":::: "+characters2[i]);
					b = true;
					System.out.println("true");
				} else {
					b = false;
					System.out.println(characters1[i]+":::: "+characters2[i]);
					System.out.println("False");
					break;
				}
			}
		}
		// System.out.println(characters.length);
	}
}