package intw.writtenexams;

import java.util.Arrays;

public class HighestAndSecondHighestInArray {
	public static void main(String[] args) {
	    int[] numbers = {1, 5, 4, 2, 8, 1, 1, 6, 7, 8, 9};
	    Arrays.sort(numbers);
	    System.out.println("The second Higest Element :" + numbers[numbers.length-2]);
	    System.out.println("The First Higest Element :" + numbers[numbers.length-1]);
	    System.out.println(numbers[9]);
	    }
}
