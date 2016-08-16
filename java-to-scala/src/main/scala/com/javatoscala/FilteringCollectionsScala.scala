package com.javatoscala

object FilteringCollectionsScala {
  
  def main(args: Array[String]): Unit = {
    val numbers = List(0, 1,2,3,4,5,6,7,8,9)
    println(s"even: ${numbers.filter(_ % 2 == 0)}")
    println(s"odd: ${numbers.filter(_ % 2 == 1)}")
  }
  
}