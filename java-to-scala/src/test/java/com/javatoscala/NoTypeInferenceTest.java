package com.javatoscala;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoTypeInferenceTest {

	@Test
	public void testStringConcatenation() {
		int meh = 1;
		assertEquals("meh: 11", "meh: " + meh + 1);
	}
	
}
