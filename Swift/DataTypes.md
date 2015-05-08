# Swift Data Types

## Constants and Variables

```swift
//this is a variable
var myVar: Int = 1

//this is a constant
let myConst: Int = 1

//error: you cant reasign a constant
//one of swift's safety feature
myConst = 2
```

## Type Inference
```swift
//the type declaration is optional
var myInt = 1
var myObject = Person() //this is the prefered way, its concise but still readable

//equivalent to:
var myInt: Int = 1
var myObject: Person = Person()
```

## Type Conversion
```swift
//int
let twoThousand: UInt16 = 2_000
```

## Basic Types
```swift
Int
UInt
Float
Double
Bool

var myInt: Int
```

Type   | Description
------ | -----------------------------------------------------------------------------------------------
IntX   | 32 or 64-bit Signed Integer depending on the platform (variants are Int8, Int16, Int32, Int64)
UIntX  | 32 or 64-bit Unsigned Integer
Float  | 32-bit floating point number (typealias Float32)
Double | 64-bit floating point number (typealias Float64)

## Type Aliasing
```swift
//good for readibility without needing to extend or create another type
typealias Awesomeness = Int

let me: Awesomeness = 100
```

## Numeric Literals: Decimal, Binary, Hex, and Octal
```swift
let binaryInteger = 0b10001       // 17 in binary notation
let octalInteger = 0o21           // 17 in octal notation
let hexadecimalInteger = 0x11

//heres how normal people do it:
let decimalInteger = 17
let decimalUsingUnderScores = 17_000_000 //underscores help with readability

```

## Sources:
* [Apple Documentation: Data Types](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/TheBasics.html)
