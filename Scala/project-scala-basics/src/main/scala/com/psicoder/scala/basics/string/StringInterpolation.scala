package com.psicoder.scala.basics.string

object StringInterpolation {
  def main(args: Array[String]): Unit = {
    //processed string literal:
    val someValue = 1
    val anotherValue = "Value"

    println(s"Integer: $someValue, String: $anotherValue, Expression: ${someValue + 2}")

    //formatted string literals
    //for reference:
    //https://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#detail
    val someDouble = 210.0002

    println("=================================")
    println(f"Formatted: $someDouble%5.2f")

    //raw string: escape characters are not processed
    val ordinaryString = "a\nb\nc"
    println(s"Ordinary String with Escape: $ordinaryString")

    val rawString = raw"a\nb\bc"
    println(s"Raw String with Escape: $rawString")
  }
}
