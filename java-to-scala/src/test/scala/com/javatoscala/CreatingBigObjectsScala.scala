package com.javatoscala

import java.util.Date
import java.text.SimpleDateFormat

object CreatingBigObjectsScala {
  
  val format = new SimpleDateFormat("MM/dd/yyyy").parse(_ : String)
  
  case class Employee(hireDate: Date, termDate: Date = format("12/31/9999"), dob: Date, firstName: String, 
      lastName: String, middleName: String, department: String, salaryPennies: Long)
  
  def main(args: Array[String]): Unit = {
    println(Employee(hireDate = format("1/13/2000"),
                     dob = format("12/15/1980"),
                     firstName = "first",
                     lastName = "last",
                     middleName = "middle",
                     department = "Shoe Counter",
                     salaryPennies = 3100000L))
  }
}