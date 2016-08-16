package com.javatoscala

object MappingCollectionsInScala {

  def main(args: Array[String]): Unit = {
    val numbers = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    println(numbers.map { number =>
      s"$number is ${if (number % 2 == 0) "even" else "odd"}\n"
    })
  }

}