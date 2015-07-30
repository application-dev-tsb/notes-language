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
var x = 0

//while: evaluate first before executing code block
while x < 10 {
    println("running...")
    x++
}

//do-while: execute first
do {
    println("running...")
    x++
} while x < 20
```

## Conditional Statements
```swift
if x > 2 {
    println("x is greater than 2")
} else if x > 1 {
    println("x is greater than 1")
} else {
    println("IDK what x is")
}
```
## Switch 
A switch statement considers a value and compares it against several possible matching patterns. It then executes an appropriate block of code, based on the first pattern that matches successfully. A switch statement provides an alternative to the if statement for responding to multiple potential states

In contrast with switch statements in C and Objective-C, switch statements in Swift do not fall through the bottom of each case and into the next one by default. Instead, the entire switch statement finishes its execution as soon as the first matching switch case is completed, without requiring an explicit break statement. This makes the switch statement safer and easier to use than in C, and avoids executing more than one switch case by mistake
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

//value bindings
var point: (Int, Int) = (1,2)
switch point {
case (0, 0):
    println("origin")
case (0, let y):
    println("y axis:\(y)")
case (let x, 0):
    println("x axis:\(x)")
case let (x,y):
    println("on x:\(x) y:\(y)")
}

//value bindings and where statements
//for additional matching
var point: (Int, Int) = (2,-3)
switch point {
case (0, 0):
    println("origin")
case (0, let y):
    println("y axis:\(y)")
case (let x, 0):
    println("x axis:\(x)")
case let (x,y) where x == y:
    println("x==y")
case let (x,y) where x == -y:
    println("x is the opposite of y")
case let (x,y):
    println("on x:\(x) y:\(y)")
}

//switch using optionals
//optionals is also an enum
//with .Somo if it has value
var myInt: Int? = 1

switch myInt {
case .Some(1):
    println("has value one")
case .Some(2):
    println("has value 2")
default:
    println("no value")
}
```

## Control Transfer
### continue
```swift
//TODO: write code here
```

### break
```swift
//TODO: write code here
```

### fallthrough
The fallthrough keyword does not check the case conditions for the switch case that it causes execution to fall into. The fallthrough keyword simply causes code execution to move directly to the statements inside the next case (or default case) block, as in C’s standard switch statement behavior.
```swift
switch x {
case 1...100:
    println("x is within 1 to 100") //executed
    fallthrough
case 101...1_000:
    println("x is within 1 to 1,000") //executed
    fallthrough
case 1_001...10_000:
    println("x is within 1 to 10,000") //executed
    fallthrough
default:
    println("IDK what x is") //executed
}
```

### return
```swift
//TODO: write code here
```

## Labeled Statements
You can nest loops and switch statements inside other loops and switch statements in Swift to create complex control flow structures. However, loops and switch statements can both use the break statement to end their execution prematurely. Therefore, it is sometimes useful to be explicit about which loop or switch statement you want a break statement to terminate
```swift
class Decider {
    func decide(number: Int = 1) -> Bool {
        return false
    }
}

var decider = Decider()

mainLoop: while decider.decide() {
    innerLoop: while decider.decide() {
        if decider.decide(number: 100) {
            break mainLoop
        }
        continue mainLoop
    }
    break
}
```

Reference: [Control Flow, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/ControlFlow.html#//apple_ref/doc/uid/TP40014097-CH9-ID120)
