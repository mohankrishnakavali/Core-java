package intw.MSWE;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RemovingDuplicatesRecursively {

	public static void main(String[] args) {
		String s = removeDups("ABBA");
		System.out.println(s);
	}

	/*
	 * public static String removeDups(String s) { if ( s.length() <= 1 ) return
	 * s; if( s.substring(1,2).equals(s.substring(0,1)) ) return
	 * removeDups(s.substring(1)); if( s.substring(1,2).equals(s.substring(0,1))
	 * ) return removeDups(s.substring(1)); else return s.substring(0,1) +
	 * removeDups(s.substring(1)); if ( s.length() <= 1 ) return s; //else
	 * return "Hi All String length is not 1"; if(
	 * s.substring(1,2).equals(s.substring(0,1)) ) return
	 * removeDups(s.substring(1)); return s.substring(0,1) +
	 * removeDups(s.substring(1));
	 * 
	 * }
	 */
	/*
	 * public static String removeDups(String realString) { StringBuilder
	 * resultString = null; try { List<Character> characterArray = new
	 * ArrayList<Character>(); for(char c : realString.toCharArray()) {
	 * characterArray.add(c); } resultString = new StringBuilder();
	 * for(Character c : new TreeSet<Character>(characterArray)) {
	 * resultString.append(c.charValue()); } } catch (Exception e) {
	 * e.printStackTrace(); } return resultString.toString(); }
	 */
	public static String removeDups(String str) {

		if (str.length() <= 1) {
			return str;
		}

		String current = str.substring(0, 1);
		String next = str.substring(1, 2);
		if( next.equals(current) ) {
			System.out.println("123");
			return removeDups(current);	
		}
		else {
			System.out.println("456");
			return  removeDups(next)+current;
		}
		
		/*String rest = str.substring(1);*/
		
		//return next;

	}
}
