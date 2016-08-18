package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class SummarizingCollectionsSpec extends FunSpec with Matchers {
  
  it("collections have a fold operation") {
    val numbers = List(1,2,3,4,5,6,7,8,9,0)
    numbers.foldLeft(0)(_ + _) should equal(45)
    // or
    numbers.foldLeft(0){ (result, num) => num + result} should equal(45)
    // or
    val sum = (result : Int, num : Int) => num + result
    numbers.foldLeft(0)(sum) should equal(45)
  }
  
}