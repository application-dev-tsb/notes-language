package com.psicoder.scala.basics.collection

object GenericCollections {
  def main(args: Array[String]): Unit = {
    val list = List("a", "b", "c")

    println(s"List: ${list.mkString("-")}")

    val map = Map("a" -> "Awe", "b" -> "Boo")

    println(s"Map Item Found ${map get "c" getOrElse "Not Found"}")

    traverse
  }

  //traversing collections (Traversible = Base collection)
  def traverse = {
    val list = List("a", "b", "c", "d", "e")

    list.foreach(println)
  }

}
