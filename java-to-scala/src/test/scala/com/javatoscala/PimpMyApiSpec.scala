package com.javatoscala

import java.io.File
import org.scalatest.Matchers
import org.scalatest.FunSpec

class PimpMyApiSpec extends FunSpec with Matchers {
  
  it("finds stuff that's in my home dir") {
    new File("/Users/maty/devl")
      .findRecursively{ file => file.getAbsolutePath.endsWith(".txt") }
      .map { file => file.getAbsolutePath} should contain("/Users/maty/devl/build/apache-maven-3.3.9/lib/ext/README.txt")
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