# Enumerations
An enumeration defines a common type for a group of related values and enables you to work with those values in a type-safe way within your code.

```swift
//declaration
enum Choices {
    case A, B, C, D
}

//assignment
var x: Choices = .A
x = .C

var y = Choices.A
y = .C
```

## Matching Enumeration Values with a Switch Statement
```swift
x = .D
switch x {
case .A:
        println("A")
case .B:
        println("B")
case .C:
        println("C")
case .D:
        println("D")
}
```
