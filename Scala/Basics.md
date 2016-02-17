# Scala Basics

#### Hello World
```scala
object Main {
  def main(args: Array[String]) {
    println("Hello World")
  }
}
```

#### Comments
- Single Line
```scala
//this is a comment
```
- Multiline
```scala
/*
 * multiline comment
 */
```

#### Console Read/Write
- standard output
```scala
println("Output")

val name = "Test"
val age = 3
val weight = 10.013432423432

//Hello Test
println(s"Hello $name") 

//I can do computations like 4 and weight 10.01
println(f"I can do computations like ${age + 1} and weight $weight%.2f")
```
- standard input
```scala
var input: String = readLine
var intInput: Int = readLine.toInt
intInput = readInt //equivalent methods also exists for Long, Short, Double, Float, Char, Byte, Boolean
```

#### Import Libraries
```scala
import scala.io.StdIn.{readLine, readInt} //static member import: do this to avoid the deprecation warning
import scala.math._
import scala.collection.mutable.ArrayBuffer
```

##### Resources:
- [Scala: String Interpolation](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
