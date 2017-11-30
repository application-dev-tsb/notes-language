package com.psicoder.scala.basics.string

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    //processed string literal:
    val someValue = 1
    val anotherValue = "Value"

    println(s"Test $someValue $anotherValue")
  }
}
