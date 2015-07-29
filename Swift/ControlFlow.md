# Control Flow

## For Loops
```swift
//traditional for loop
//performs a set of statements until a specific condition is met, typically by incrementing a counter each time the loop ends
for var index = 0; index < 3; ++index {
    println("index is \(index)")
}

//for-in
//loop performs a set of statements for each item in a sequence.
for n in 1...5 {
  println(n) //prints 1 2 3 4 5
}
```

## While Loops
```swift
//TODO: insert code here
```

## Do While
```swift
//TODO: insert code here
```

## Conditional Statements
```swift
//TODO: insert code here
```
## Switch 
```swift
//simple switch with range of values
var count = 1000
switch count {
case Int.min..<0:
    println("wooops")
case 0:
    println("boooo")
case 1...10:
    println("nice...")
case 10...100:
    println("so much...")
default:
    println("much wow doge...")
}

//switching to match multiple values
var point = (1, 0)
switch point {
case (0, 0):
    println("origin")
case (0, _):
    println("y axis")
case (_, 0):
    println("x axis")
default:
    println("not cool")
}
```

## Control Transfer
* continue
* break
* fallthrough
* return

## Labeled Statements
```swift
//TODO: insert code here
```

Reference: [Control Flow, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/ControlFlow.html#//apple_ref/doc/uid/TP40014097-CH9-ID120)
