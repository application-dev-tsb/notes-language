package com.psicoder.scala.implicits.utils

object PrintHelper {

  /**
    * Implicit classes wraps the value and provides additional methods
    * @param x
    */
  implicit class IntPrinter(x: Int) {
    def print: Unit = {
      println(s"Int Printing: ${this.x}")
    }
  }

  implicit class StringPrinter(s: String) {
    def print: Unit = {
      println(s"String Printing: ${this.s}")
    }
  }
}
