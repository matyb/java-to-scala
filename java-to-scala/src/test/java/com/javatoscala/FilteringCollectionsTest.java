package com.javatoscala;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FilteringCollectionsTest {

	@Test
	public void testThatFilterngCollectionsIsKindOfReasonable() {
		List<Integer> numbers = asList(0,1,2,3,4,5,6,7,8,9);
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(Integer i : numbers){
			if(i % 2 == 0){
				even.add(i);
			}else{
				odd.add(i);
			}
		}
		assertEquals(asList(0,2,4,6,8), even);
		assertEquals(asList(1,3,5,7,9), odd);
	}
	
}
