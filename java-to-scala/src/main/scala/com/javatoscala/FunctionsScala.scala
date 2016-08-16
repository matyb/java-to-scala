package com.javatoscala

import java.util.Collections
import java.util.Comparator

object FunctionsScala {
  
  def main(args: Array[String]): Unit = {
    val strings = List("1", "2", "3", "42", "43", "45", "44", "46", "100", "99", "33")
    val sorted = strings.sortBy { x => (x.length(), x.toInt % 3) }
		println(sorted)
  }
  
}