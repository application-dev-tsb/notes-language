package com.psicoder.scala.basics

object Blocks {

  def main(args: Array[String]): Unit = {
    val someResult = {
      val x = 1 + 2
      1 + x
    }

    println(s"The result is the last statement: $someResult")
  }
}
