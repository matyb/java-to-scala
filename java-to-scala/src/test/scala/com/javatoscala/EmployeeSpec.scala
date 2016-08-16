package com.javatoscala

import org.scalatest.FunSpec
import org.scalatest.Matchers

class EmployeeSpec extends FunSpec with Matchers {

  describe("creating an employee") {
    it("has a first name") {
      EmployeeScala("first", "").firstName should equal("first")
    }

    it("has a last name") {
      EmployeeScala("", "last").lastName should equal("last")
    }
  }

  describe("implementing requisite object methods") {
    it("should be logically equal") {
      EmployeeScala("first", "last") should equal(EmployeeScala("first", "last"))
    }

    it("should NOT be logically equal") {
      EmployeeScala("f", "l") should not equal (EmployeeScala("first", "last"))
    }

    it("should produce consistent hashcodes") {
      EmployeeScala("first", "last").hashCode() should equal(EmployeeScala("first", "last").hashCode())
    }

    it("should produce unequal hashcodes for unequal instances") {
      EmployeeScala("f", "l").hashCode() should not equal (EmployeeScala("first", "last").hashCode())
    }

    it("toString is helpful") {
      EmployeeScala("first", "last").toString() should equal("Employee(first,last)")
    }
  }

}
