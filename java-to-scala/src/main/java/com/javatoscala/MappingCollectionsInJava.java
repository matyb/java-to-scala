package com.javatoscala;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class MappingCollectionsInJava {

	public static void main(String[] args) {
		List<Integer> numbers = asList(0,1,2,3,4,5,6,7,8,9);
		List<String> statements = new ArrayList<String>();
		for(Integer number : numbers) {
			statements.add(numberToStatement(number));
		}
		System.out.println(statements);
	}
	
	private static String numberToStatement(Integer number) {
		return number + " is " + (number % 2 == 0 ? "even" : "odd") + "\n";
	}
	
}
