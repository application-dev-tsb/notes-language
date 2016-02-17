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

#### Variable/Constant Declaration
- variable
```scala
var myVariable: Int = 1
var myVariable = 1 //data type is optional, it can be infered from assignment
```
- constant
```scala
val myVariable = 1 
myVariable = 2 //ERROR: reassignment to val
```

#### Package/Namespace
```scala
package p1 {
  object test extends Application {
    println("p1.test")
  }
}

package p2 {
  object test extends Application {
    println("p2.test")
  }
}
```

#### Import Libraries
```scala
import com.a.{b, c, d} //members b, c, and d
import com.a._ //all members of a
import com.a.MyClass //MyClass
import p1._, p2._ //multiple imports
import p.{x => a} //the member x renamed as a

import scala._ //automatically imported
```


##### Resources:
- [Scala: Tour/Introduction](http://docs.scala-lang.org/tutorials/tour/tour-of-scala)
- [Scala: String Interpolation](http://docs.scala-lang.org/overviews/core/string-interpolation.html)
- [Scala: Naming Conventions](http://docs.scala-lang.org/style/naming-conventions.html)
