package com.scjp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap props = new HashMap();
		 props.put("key45", "some value");
		 props.put("key12", "some other value");
		 props.put("key39", "yet another value");
		 Set s = props.keySet();
		 s=new TreeSet();
		 //System.out.println(s);
		 //Collections.sort(s);
		 /*s=new SortedSet() {
		};*/
	}

}
