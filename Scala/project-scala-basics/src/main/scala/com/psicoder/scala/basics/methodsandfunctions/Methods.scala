package com.psicoder.scala.basics.methodsandfunctions

object Methods {
  def main(args: Array[String]): Unit = {
    println(s"Add then Multiply: ${addThenMultiply(1,2)(3)} ")

    println(s"No Params Method: ${noParamsMethod}")
  }

  //methods are similar to functions
  //but:
  // - defined by the "def" keyword
  // - has a return type after the parameter list
  def completeMethod(x: Int, y: Int): Int = {
    x + y
  }

  // - can have multiple parameter list
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

  // - may not have a parameter list
  def noParamsMethod: Int = 1 + 1
}
