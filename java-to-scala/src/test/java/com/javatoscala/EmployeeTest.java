package com.javatoscala;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void givenAFirstNameWhenRequestedThenAnEmployeeReturnsIt() throws Exception {
		assertEquals("first", new EmployeeJava("first","last").getFirstName());
	}
	
	@Test
	public void givenALastNameWhenRequestedThenAnEmployeeReturnsIt() throws Exception {
		assertEquals("last", new EmployeeJava("first","last").getLastName());
	}
	
	@Test
	public void givenTwoLogicallyEqualEmployeesWhenTestingIfEqualThenTrueIsReturned() throws Exception {
		assertEquals(new EmployeeJava("first","last"), new EmployeeJava("first","last"));
	}
	
	@Test
	public void givenTwoLogicallyUnequalEmployeesWhenTestingIfEqualThenFalseIsReturned() throws Exception {
		assertNotEquals(new EmployeeJava("f","l"), new EmployeeJava("first","last"));
	}
	
	@Test
	public void givenTwoLogicallyEqualEmployeesWhenHashingThenWhatIsReturnedIsConsistent() throws Exception {
		assertEquals(new EmployeeJava("first","last").hashCode(), new EmployeeJava("first","last").hashCode());
	}
	
	@Test
	public void givenTwoLogicallyUnequalEmployeesWhenHashingThenWhatIsReturnedIsDifferent() throws Exception {
		assertNotEquals(new EmployeeJava("f","l").hashCode(), new EmployeeJava("first","last").hashCode());
	}
	
	@Test
	public void givenAnEmployeeWhenInvokingToStringItContainsFirstAndLastName() throws Exception {
		assertEquals("Employee [firstName=first, lastName=last]", new EmployeeJava("first","last").toString());
	}
	
}
