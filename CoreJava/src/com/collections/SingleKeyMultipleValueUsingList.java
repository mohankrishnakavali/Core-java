package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SingleKeyMultipleValueUsingList {

	//Integer Sno;

	public static void main(String[] args) {
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();

		List<String> valFirst = new ArrayList<String>();
		valFirst.add("mohan");
		valFirst.add("SVU");
		valFirst.add("kavali");

		List<String> valSecond = new ArrayList<String>();
		valSecond.add("muni");
		valSecond.add("SVU");
		valSecond.add("kavali");

		List<String> valThird = new ArrayList<String>();
		valThird.add("manu");
		valThird.add("BGLU");
		valThird.add("Chenna");

		map.put(1, valFirst);
		map.put(2, valSecond);
		map.put(3, valThird);

	/*	System.out
				.println("Fetching keys and corresponding [multiple] values n");*/

		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {

			Integer key = entry.getKey();
			List<String> values = entry.getValue();

			Scanner consoleValue = new Scanner(System.in);
			Integer sno = consoleValue.nextInt();
			//System.out.println("Please enter Student Number : " + sno1);
			if (key == sno) {
				//System.out.println("Key Value is = " + key);
				System.out.println("Student "+ key +" Values is =" + values);
			}else{
				System.out.println("Student number is not available ..Please check the details and correct" );
			}
		}

	}

}
