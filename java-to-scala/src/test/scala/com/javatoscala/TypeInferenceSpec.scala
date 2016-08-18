package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class TypeInferenceSpec extends FunSpec with Matchers {
  
  it("should know how to infer the type from an assignment"){
    val meh = 1
    println(s"meh: ${meh + 1}")
  }
  
}