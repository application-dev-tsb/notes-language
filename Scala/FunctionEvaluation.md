# Function Evaluation: Call by Name VS. Call by Value

Call by Value: Default, Evaluate the function's value first
```scala
object MyApp extends App {

  def f1(x: Int): Int = {
    println("side effect")
    return 1
  }

  def f2(x: Int) = {
    println("start f2")
    println("f2 run " + x)
    println("f2 run " + x)
  }

  f2(f1(1))
}

side effect
start f2
f2 run 1
f2 run 1
```

Call by Name: Delayed Evaluation
```scala
.
.
  def f2(x: => Int) = {
.
.
start f2
side effect
f2 run 1
side effect
f2 run 1
```
