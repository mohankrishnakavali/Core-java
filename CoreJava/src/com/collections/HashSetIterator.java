package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetIterator {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("mohan", "bgl");
		map.put("muni", "chennai");
		map.put("hari", "kvp");
		
		/*Set<String> set=map.keySet();
		//System.out.println(set);
		Iterator<String> itr=set.iterator();
		Object key,value;
		while(itr.hasNext())
		{
			key=itr.next();
			value=map.get(key);
			System.out.println("Key value is : "+key +"  Values is : "+value);
			
			System.out.println(itr.next());
			System.out.println(map.get(itr.next()));
		}*/
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		Object key, value;
		while(itr.hasNext())
		{
			key=itr.next();
			System.out.println(key);
		}
		
	}

}
