# Classes and Structures
Classes and structures are general-purpose, flexible constructs that become the building blocks of your program’s code. You define properties and methods to add functionality to your classes and structures by using exactly the same syntax as for constants, variables, and functions.

```swift
struct Resolution {
    var width = 0
    var height = 0
}

class VideoMode {
    var resolution = Resolution()
    var interlaced = false
    var frameRate = 0.0
    var name: String?
}
```

## Comparison
| Feature | Class | Structure |
| ------- | ----- | --------- |
| Properties | YES | YES |
| Methods | YES | YES |
| Subscripts | YES | YES |
| Initializers | YES | YES |
| Extensions Allowed | YES | YES |
| Implements Protocol | YES | YES |
| Allows Inheritance | YES | NO |
| Type Casting | YES | NO |
| Reference | YES |  NO (Values are Copied) |
| Memberwise Initializers | NO | YES |



Reference: [Classes And Structures, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/ClassesAndStructures.html#//apple_ref/doc/uid/TP40014097-CH13-ID82)
