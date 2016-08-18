package com.javatoscala

import java.math.BigDecimal

import org.scalatest.FunSpec
import org.scalatest.Matchers

class BigDecimalMathSpec extends FunSpec with Matchers {
  
  class BigDecimalWithOperators(val value: BigDecimal) {
    def + (addend: Number): BigDecimal = value add new BigDecimal(addend.toString())
  }

  implicit def bigDecimalWithOperators(value: BigDecimal): BigDecimalWithOperators =
    new BigDecimalWithOperators(value)
  
  it("can use operators to work with objects") {
    val number = new BigDecimal("123456789012345678901234567890")
    number + 1 should equal(new BigDecimal("123456789012345678901234567891"))
  }
  
}