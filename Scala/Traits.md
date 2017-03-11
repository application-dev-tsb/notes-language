# Traits
Equivalent to Java Interfaces

## Declaration
```scala
trait IsAwesome {
  def isAwesome(x: Any): Boolean
  def isNotAwesome(x: Any): Boolean = !isAwesome(x)
}
```

## Usage
```scala
object Lyndon extends IsAwesome {
  override def isAwesome(x: Any) = true
}
```
