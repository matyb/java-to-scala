package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class MappingCollectionsSpec extends FunSpec with Matchers {

  it("will tell me if a number is odd or even"){
    val numbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    val oddOrEven = numbers.map { number =>
      s"$number is ${if (number % 2 == 0) "even" else "odd"}"
    } 
    oddOrEven should equal(List("0 is even", "1 is odd", "2 is even", "3 is odd", "4 is even", 
                                "5 is odd", "6 is even", "7 is odd", "8 is even", "9 is odd"))
  }

}