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
//Integers
let binaryInteger = 0b10001       // 17 in binary notation
let octalInteger = 0o21           // 17 in octal notation
let hexadecimalInteger = 0x11

let doubleExponent: Double = 1.25e2 //1.25 x 10^2
let doubleNegativeExponent: Double = 1.25e-2 //1.25 / 10^2
let doubleHex: Double = 0xCe2 //16 x 10^2

//heres how sane people write readable numbers:
let decimalUsingUnderScores = 17_000_000

//Floating Point
let decimalDouble = 12.1875
let exponentDouble = 1.21875e1
let hexadecimalDouble = 0xC.3p0
```

Source: [Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/TheBasics.html)
