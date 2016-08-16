package com.javatoscala;

import java.util.List;
import static java.util.Arrays.asList;

public class SummarizingCollectionsJava {

	public static void main(String[] args) {
		List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,0);
		Integer sum = 0;
		for(Integer number : numbers){
			sum += number;
		}
		System.out.println(sum);
	}
	
}
