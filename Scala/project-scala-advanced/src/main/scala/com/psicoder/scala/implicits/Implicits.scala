package com.psicoder.scala.implicits

object Implicits {
  def main(args: Array[String]): Unit = {

    //for implicit classes to work
    //1.) it must be in scope
    //2.) unambiguous
    import com.psicoder.scala.implicits.utils.PrintHelper._

    //Int Printing: 100
    100 print

    //String Printing: mystring
    "mystring" print
  }
}
