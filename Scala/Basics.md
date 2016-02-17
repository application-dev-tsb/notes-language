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
```
- standard input
```scala
var input: String = readLine
var intInput: Int = readLine.toInt
intInput = readInt //equivalent methods also exists for Long, Short, Double, Float, Char, Byte, Boolean
```
