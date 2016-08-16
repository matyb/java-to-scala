package com.javatoscala;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class FilteringCollectionsJava {

	public static void main(String[] args) {
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
		System.out.println("even: " + even);
		System.out.println("odd: " + odd);
	}
	
}
