package com.javatoscala

import org.scalatest.Matchers
import org.scalatest.FunSpec

class IfHeavyLogicSpec extends FunSpec with Matchers {
  
  case class Food(name: String, weight: String)
  
  private def shouldIEat(food: Food): String = {
    food match {
      case Food("pizza", size) if (size == "huge") => "Cowabunga dude"
      case Food("pizza", _)  => "EAT MORE PIZZA - The Ninja Turtles"
      case Food(_, "teeny tiny") => "Be careful"
      case Food("tacos", size) if (size == "huge") => "Ah dios mio!"
      case Food("bananas", _) => "Not cheap for long"
      case Food("rice", _) => "Carbs were good for you in the 90's"
      case _ => "Could be poisenous"
    }
  }
  
  it("should make a lot of if statements reasonable"){
    val foods = List(Food("tacos", "huge"), 
                     Food("pizza", "huge"), 
                     Food("rice", "small"),
                     Food("brussel sprouts", "teeny tiny"), 
                     Food("fingernails", "huge"))
    foods.map(shouldIEat(_)) should equal(List("Ah dios mio!",
                                               "Cowabunga dude",
                                               "Carbs were good for you in the 90's",
                                               "Be careful",
                                               "Could be poisenous"))
  }
  
}