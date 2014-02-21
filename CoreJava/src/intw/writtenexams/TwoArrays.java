package intw.writtenexams;

public class TwoArrays {
	public static void main(String[] args) {
		String[] arrayA = { "dog", "cat", "wolf", "flamingo", "spider", "?",
				"7", "orange" };
		String[] arrayB = { "fox", "wolf", "bear", "7", "cheese", "spider",
				"paper", "cat" };
		boolean foundSwitch = false;
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i].equals(arrayB[j])) {
					foundSwitch = true;
					System.out.println("arrayA element \"" + arrayA[i]
							+ "\" was found in arrayB");
				}
			}
			if (foundSwitch == false) {
				System.out.println("arrayA element \"" + arrayA[i]
						+ "\" was Not found in arrayB");
			}
			foundSwitch = false;
		}
	}
}
