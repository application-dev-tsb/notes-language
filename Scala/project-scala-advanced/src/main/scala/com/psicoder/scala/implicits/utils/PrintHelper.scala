package com.psicoder.scala.implicits.utils

/**
  * Implicit Class Restrictions:
  *
  * 1.) they can only be declared inside another trait/class/object
  * 2.) they may only take one non-implicit argument in their constructor
  * 3.) methods, members, or objects cannot be the same name as the implicit class
  * 4.) case classes cannot be implicit classes
  */
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
