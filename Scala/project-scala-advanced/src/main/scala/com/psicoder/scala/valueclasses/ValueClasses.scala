package com.psicoder.scala.valueclasses

/**
  * Value Classes:
  */
object ValueClasses {

  //1.) extends "AnyVal"
  //2.) only has one constructor parameter
  class MyValueClass(val actualValue: Int) extends AnyVal {}

  //3.) usually combined with implicit classes
  //allocation-free wrapper
  implicit class BetterInt(val self: Int) extends AnyVal {
    def toAwesomeString: String = s"This makes me awesome: $self"
  }

  //4.) for cleaner syntax
  class Meter(val value: Double) extends AnyVal {
    def +(another: Meter): Meter = new Meter(value + another.value)
  }

  def main(args: Array[String]): Unit = {
    val x = 1 //no heap allocation
    val s = "sss" //objects allocated in heap

    //value classes are allocated in stack
    val myValueClass = new MyValueClass(100)

    //allocation-free wrapper
    println(10 toAwesomeString)

    val a = new Meter(10)
    val b = new Meter(20.1)
    println(s"Sum: ${(a + b) value}")

    val y = 10
  }
}
