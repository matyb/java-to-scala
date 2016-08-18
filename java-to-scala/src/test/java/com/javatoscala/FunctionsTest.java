package com.javatoscala;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class FunctionsTest {

	@Test
	public void testThatOrderingIsKindOfReasonable() {
		List<String> strings = asList("1", "2", "3", "42", "43", "45", "44", "46", "100", "99", "33");
		Collections.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				int result = 0;
				if(o2.length() > o1.length()){
					result = -1;
				}else if(o1.length() > o2.length()){
					result = 1;
				}else{
					result = Integer.valueOf(o1) % 3 - Integer.valueOf(o2) % 3;
				}
				return result;
			}
		});
		assertEquals(asList("3", "1", "2", "42", "45", "99", "33", "43", "46", "44", "100"), strings);
	}
	
}
