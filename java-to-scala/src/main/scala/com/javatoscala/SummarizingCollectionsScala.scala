package com.javatoscala

object SummarizingCollectionsScala {
  
  def main(args: Array[String]): Unit = {
    val numbers = List(1,2,3,4,5,6,7,8,9,0)
    println(numbers.foldLeft(0)(_ + _))
    // or
    println(numbers.foldLeft(0){ (result, num) => num + result})
    // or
    val sum = (result : Int, num : Int) => num + result
    println(numbers.foldLeft(0)(sum))
  }
  
}