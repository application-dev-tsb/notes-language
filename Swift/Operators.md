# Operators

## Asignment
```swift

//asignment operator
var a = 1
var b = 3

//decomposing a tuple:
var myTuple = (1, 2, 3, 4)

var (x, _, y, _) = myTuple

//equivalent:
var x = myTuple.0
var y = myTuple.2

//NOTE: use _ for things you dont care about
```

## Arithmetic
```swift
var sum = 1 + 1
var concatenatedString = "Test" + "AnotherTest"
5 - 3 //2
2 * 3 //6
10.0 / 2.51 //4
5 % 2 //1
-5 % 2 //-1

//-1 the sign for the value of B is always ignored so -A % -B will yield similar results to -A % B
-5 % -2

//0.5 swift's modulo operator can return floating-point result
8 % 2.5
```

## Increment/Decrement
```swift
var i = 9

//post = 9, since i was returned before incrementing
let post = i++

//pre = 11, incremented before returning the value
let pre = ++i

var f = 15.5
f++ //16.5 increment also works with floating types
```

## Unary Plus/Minus Operator
```swift
var n = 3

n = -n //-3 negated
n = +n //-3 does nothing
println(n) //-3

var m = -3

m = -m //3 negated
m = +m //3 does nothing
println(m) //3
```

## Ternary Conditional Operator
```swift
var question = 1 > 2
var answer = question ? "True" : "False"
```

## Nil Coalescent Operator
The nil coalescing operator (a ?? b) unwraps an optional a if it contains a value, or returns a default value b if a is nil. The expression a is always of an optional type. The expression b must match the type that is stored inside a.
```swift
var a: String? = "A"
var b = "B"

//equivalent to:
//a != nil ? a! : b
let result: String = a ?? b 

println("result=\(result)")
```

## Identity Operator
```swift
var c1 = PersonClass()
var c2 = c1

if c1 === c2 {
    println("Identical")
} else {
    println("Not Identical")
}
```

## Equatable Operators
```swift
//operands should implement:
protocol Equatable {
    func ==(lhs: Self, rhs: Self) -> Bool
}

//sample:
class PersonClass {
    var name = "Test"
    var age = 1
}

extension PersonClass: Equatable {}

//weird huh?
func == (lhs: PersonClass, rhs: PersonClass) -> Bool {
    return true
}

var c1 = PersonClass()
var c2 = PersonClass()

if c1 == c2 {
    println("Equal")
} else {
    println("Not Equal")
}
```

## Comparable Operator
```swift
//operands should implement:
protocol Comparable : _Comparable, Equatable {
    func <=(lhs: Self, rhs: Self) -> Bool
    func >=(lhs: Self, rhs: Self) -> Bool
    func >(lhs: Self, rhs: Self) -> Bool
}
```

Reference: [Basic Operators, Apple Inc.] (https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/BasicOperators.html#//apple_ref/doc/uid/TP40014097-CH6-ID60)

# Advance Operators
```swift
let someBits: UInt8 = 0b10110010
let moreBits: UInt8 = 0b01011110
let combinedbits = someBits | moreBits  // equals 11111110
```

Reference: [Advance Operators, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/AdvancedOperators.html#//apple_ref/doc/uid/TP40014097-CH27-ID28)

