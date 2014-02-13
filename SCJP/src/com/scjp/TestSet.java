package com.scjp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

	enum Example{ONE, TWO, THREE}
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add(Example.THREE);
		col.add(Example.THREE);
		col.add(Example.THREE);
		col.add(Example.TWO);
		col.add(Example.TWO);
		col.add(Example.ONE);
		Set set=new HashSet(col);
		System.out.println(set);
	}

}
