package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class FilteringCollectionsSpec extends FunSpec with Matchers {
  
  it("makes filtering look ok"){
    val numbers = List(0,1,2,3,4,5,6,7,8,9)
    numbers.filter(_ % 2 == 0) should equal(List(0,2,4,6,8))
    numbers.filter(_ % 2 == 1) should equal(List(1,3,5,7,9))
  }
  
}