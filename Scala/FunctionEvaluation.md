# Function Evaluation: Call by Name VS. Call by Value

```scala
object RunWithSideEffect extends App {

  def f1(x: Int): Int = {
    print("side effect -> ")
    return 1
  }

  def f2(x: Int) = {
    println("run f2")
  }

  f2(f1(1)) //side effect -> run f2
}
```
