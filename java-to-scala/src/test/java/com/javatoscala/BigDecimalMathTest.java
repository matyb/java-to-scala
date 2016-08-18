package com.javatoscala;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalMathTest {

	@Test
	public void testBigDecimalAddition() {
		BigDecimal number = new BigDecimal("123456789012345678901234567890");
		//number + 1 // doesn't compile
		assertThat(number.add(new BigDecimal("1")), is(new BigDecimal("123456789012345678901234567891")));
	}
	
}
