package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class FunctionsSpec extends FunSpec with Matchers {
  
  it("sorts based off a single element, not two in relation"){
    val strings = List("1", "2", "3", "42", "43", "45", "44", "46", "100", "99", "33")
    val sorted = strings.sortBy { x => (x.length(), x.toInt % 3) }
		sorted should equal(List("3","1","2","42","45","99","33","43","46","44","100"))
  }
  
}