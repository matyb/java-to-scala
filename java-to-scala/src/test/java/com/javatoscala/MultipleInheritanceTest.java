package com.javatoscala;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultipleInheritanceTest {

	@Test
	public void testShoutingHai() {
		SayHiClass sayHiInstance = new SayHiClass();
		assertEquals("hi er i mean hai!", sayHiInstance.shout(sayHiInstance.sayHi("er i mean hai")));
	}
	
	public static class SayHiClass implements Shout, SayHi {}
	
	public static interface Shout {
		default public String shout(String something) {
			return something + "!";
		}
	}
	
	public static interface SayHi {
		default public String sayHi(String something) {
			return "hi " + something;
		}
	}
	
}
