package com.javatoscala;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionJava {

	public static void main(String[] args) {
		List<String> strings = asList("1", "2", "3");
		// this will throw an UnsupportedOperationException! strings.add("4");
		strings = new ArrayList<String>(strings);
		strings.add("4");
		
		// no one liners with maps, this doesn't work 
		// Map<String, Integer> map = new LinkedHashMap<String, Integer>("1", 1, "2", 2);
		// though some static methods can help
		// Map<String, Integer> map = map(entry("1", 1), entry("2", 2));
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		
		System.out.println(strings);
		System.out.println(map);
	}
	
}
