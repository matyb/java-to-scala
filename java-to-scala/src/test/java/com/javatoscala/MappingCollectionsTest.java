package com.javatoscala;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MappingCollectionsTest {

	@Test
	public void testMappingATypeToAnother() {
		List<Integer> numbers = asList(0,1,2,3,4,5,6,7,8,9);
		List<String> statements = new ArrayList<String>();
		for(Integer number : numbers) {
			statements.add(numberToStatement(number));
		}
		assertEquals(asList("0 is even", "1 is odd", "2 is even", "3 is odd", "4 is even", 
							"5 is odd", "6 is even", "7 is odd", "8 is even", "9 is odd"), statements);
	}
	
	private static String numberToStatement(Integer number) {
		return number + " is " + (number % 2 == 0 ? "even" : "odd");
	}
	
}
