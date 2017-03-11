# Traits
Equivalent to Java Interfaces

## Declaration
```scala
trait IsAwesome {
  def isAwesome(x: Any): Boolean
  
  //traits can also have default implementations
  def isNotAwesome(x: Any): Boolean = !isAwesome(x)
}
```

## Usage
```scala
object Lyndon extends IsAwesome {
  override def isAwesome(x: Any) = true
}
```
