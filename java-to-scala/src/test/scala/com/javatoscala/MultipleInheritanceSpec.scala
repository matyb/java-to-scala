package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class MultipleInheritanceSpec extends FunSpec with Matchers {
  
  it("can inherit from multiple traits") {
    val instance = ShoutHiInstance
    instance.shout(instance.sayHi("er i mean hai")) should equal("hi er i mean hai!")
  }
  
  object ShoutHiInstance extends Shout with SayHi
  
  trait Shout {
    def shout(something: String) = {
      something + "!"
    }
  }
  
  trait SayHi {
    def sayHi(something: String) = {
      s"hi $something"
    }
  }
  
}