package com.test;

public class StringDef {
	public static void main(String[] args) {
		String str = "mohankrishnakavali";
		// System.out.println(str.length());
		String s = "";
		String s3 = "";
		for (int i = 0; i < 3; i++) {
			s = s + ".";
		}
		//System.out.println(s);
		String[] string = str.split("(?<=\\G" + s + ")");
		for (String s2 : string) {
			// System.out.println(s2);
			for (int k = s2.length() - 1; k >= 0; k--) {
				s3 = s3 + s2.charAt(k);
			}

		}
		System.out.println(s3);
		//recursiveStringReverse(2, "mani");
	}

	/*public static String recursiveStringReverse(int n, String name) {
		String s = "";
		String s3 = "";
		for (int i = 0; i < 2; i++) {
			s = s + ".";
		}
		System.out.println(s);
		String[] string = name.split("(?<=\\G" + s + ")");
		for (String s2 : string) {
			// System.out.println(s2);
			for (int k = s2.length() - 1; k >= 0; k--) {
				s3 = s3 + s2.charAt(k);
			}

		}
		System.out.println(name);
		return name;
	}*/
}
