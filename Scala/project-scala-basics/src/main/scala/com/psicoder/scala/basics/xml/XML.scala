package com.psicoder.scala.basics.xml

/**
  * for some unknown reason(s) the
  * scala devs decided to make s
  */
object XML {
  def main(args: Array[String]): Unit = {
    val myXML = <foo><bar>Abc</bar></foo>

    println(s"XML: $myXML")
  }
}
