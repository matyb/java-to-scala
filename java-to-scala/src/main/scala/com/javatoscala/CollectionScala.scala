package com.javatoscala

object CollectionScala {
  
  def main(args: Array[String]): Unit = {
    var strings = List("1", "2", "3");
		// strings.add("4") this doesn't compile
		strings = strings :+ "4"
		
		var map = Map[String, Integer]("1" -> 1,  "2" -> 2);
		map = map + ("3" -> 3);
		
		System.out.println(strings);
		System.out.println(map);
  }
  
}