package com.javatoscala;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreatingBigObjectsJava {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(
				new EmployeeBuilder()
					.firstName("first")
					.lastName("last")
					.dob(format.parse("12/15/1980"))
					.hireDate(format.parse("1/13/2000"))
					.department("Shoe Counter")
					.salaryPennies(3100000L).build());
	}
	
	static class Employee {
		final Date hireDate, termDate;
		final Date dob;
		final String firstName, lastName, middleName;
		final String department;
		final Long salaryPennies;
		private Employee(Date hireDate, Date termDate, Date dob, String firstName, String lastName, String middleName, String department, Long salaryPennies){
			this.hireDate = hireDate;
			this.termDate = termDate;
			this.dob = dob;
			this.firstName = firstName;
			this.lastName = lastName;
			this.middleName = middleName;
			this.department = department;
			this.salaryPennies = salaryPennies;
		}
		@Override
		public String toString() {
			return "Employee [hireDate=" + hireDate + ", termDate=" + termDate
					+ ", dob=" + dob + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", middleName=" + middleName
					+ ", department=" + department + ", salaryPennies="
					+ salaryPennies + "]";
		}
	}
	
	static class EmployeeBuilder {
		Date hireDate, termDate;
		Date dob;
		String firstName, lastName, middleName;
		String department;
		Long salaryPennies;
		public EmployeeBuilder hireDate(Date hireDate) {
			this.hireDate = hireDate;
			return this;
		}
		public EmployeeBuilder termDate(Date termDate) {
			this.termDate = termDate;
			return this;
		}
		public EmployeeBuilder dob(Date dob) {
			this.dob = dob;
			return this;
		}
		public EmployeeBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public EmployeeBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public EmployeeBuilder middleName(String middleName) {
			this.middleName = middleName;
			return this;
		}
		public EmployeeBuilder department(String department) {
			this.department = department;
			return this;
		}
		public EmployeeBuilder salaryPennies(Long salaryPennies) {
			this.salaryPennies = salaryPennies;
			return this;
		}
		public Employee build() {
			try {
				termDate = termDate != null ? termDate : new SimpleDateFormat("MM/dd/yyyy").parse("12/31/9999");
			} catch (ParseException e) {
				throw new RuntimeException(e);
			}
			return new Employee(hireDate, termDate, dob, firstName, lastName, middleName, department, salaryPennies);
		}
	}
	
}
