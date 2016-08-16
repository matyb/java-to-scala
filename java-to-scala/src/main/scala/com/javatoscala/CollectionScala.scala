package com.javatoscala

object CollectionScala {
  
  def main(args: Array[String]): Unit = {
    val strings = List("1", "2", "3");
		
		val map = Map[String, Integer]("1" -> 1,  "2" -> 2);
		
		System.out.println(strings :+ "4");
		System.out.println(map + ("3" -> 3));
  }
  
}