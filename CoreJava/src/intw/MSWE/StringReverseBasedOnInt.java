package intw.MSWE;

public class StringReverseBasedOnInt {

	public static void main(String[] args) {
		recursiveStringReverse(4, "mohanakrishnakavali");
	}
	public static String recursiveStringReverse(int n, String name) {
	String string1 = "",string2 = "";
	
	for (int i = 0; i < n; i++) {
		string1 = string1 + ".";
	}
	String[] string = name.split("(?<=\\G" + string1 + ")");
	for (String string3 : string) {
		for (int k = string3.length() - 1; k >= 0; k--) {
			string2 = string2 + string3.charAt(k);
		}

	}
	System.out.println(string2);
	return string2;
}
}
