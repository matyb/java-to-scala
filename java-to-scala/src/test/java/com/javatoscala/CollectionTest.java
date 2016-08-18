package com.javatoscala;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {

	public void testListCreation() {
		List<String> strings = asList("1", "2", "3");
		// this will throw an UnsupportedOperationException! strings.add("4");
		strings = new ArrayList<String>(strings);
		strings.add("4");
		
		assertThat(strings, is(Arrays.asList("1", "2", "3", "4")));
	}
	
	public void testMapCreation() {
		// no one liners with maps, this doesn't work 
		// Map<String, Integer> map = new LinkedHashMap<String, Integer>("1", 1, "2", 2);
		// though some static methods can help
		// Map<String, Integer> map = map(entry("1", 1), entry("2", 2));
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		
		assertThat(map.get("1"), is(1));
		assertThat(map.get("2"), is(2));
		assertThat(map.get("3"), is(3));
	}
	
}
