package com.javatoscala

import org.scalatest.FunSpec
import org.scalatest.Matchers

class CollectionSpec extends FunSpec with Matchers {
  
  describe("making collections reasonable"){
  
    it("lists"){
      val strings = List("1", "2", "3")
      strings :+ "4" should equal (List("1", "2", "3", "4"))
    }
    
    it("maps"){
      val map = Map[String, Integer]("1" -> 1,  "2" -> 2)
		  map + ("3" -> 3) should equal (Map("1" -> 1, "2" -> 2, "3" -> 3))
    }
  
  }
  
}