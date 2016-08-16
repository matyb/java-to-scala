package com.javatoscala

import java.io.File

object PimpMyApiScala {
  
  def main(args: Array[String]): Unit = {
    new File("/Users/maty/devl")
      .findRecursively{ file => file.getAbsolutePath.endsWith(".txt") }
      .foreach { x => println(x.getAbsolutePath)}
  }
  
  implicit def fileWithRecursiveFilter(file: File): FileRecursive = new FileRecursive(file)
  
  class FileRecursive(file: File) {
    def findRecursively(filter: File => Boolean): List[File] = {
      file.listFiles match {
        case null => Nil
        case files => files.toList.filter(filter) ::: files.toList.filter(_.isDirectory).flatMap(_.findRecursively(filter))
      }
    }
  }
  
}