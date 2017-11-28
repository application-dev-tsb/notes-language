package com.psicoder.scala.basics

object ValAndVar {
  def main(args: Array[String]): Unit = {
    val cannotBeReassigned = 1
    var canBeReassigned = 2

    //ok: vars are mutable
    canBeReassigned = 3

    //error: val cannot be set to another value
    //cannotBeReassigned = 9

    println(s"val= $cannotBeReassigned, var= $canBeReassigned")
  }
}
