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

## Associated Values
You can define Swift enumerations to store associated values of any given type, and the value types can be different for each member of the enumeration if needed. Enumerations similar to these are known as discriminated unions, tagged unions, or variants in other programming languages.

```swift
enum Barcode {
    case UPCA(Int, Int, Int, Int)
    case QRCode(String)
}

var productBarcode = Barcode.UPCA(1, 1, 2, 3)

switch productBarcode {
case .UPCA(let numberSystem, let manufacturer, let product, let check):
    println("UPC-A: \(numberSystem), \(manufacturer), \(product), \(check).")
case .QRCode(let productCode):
    println("QR code: \(productCode).")
}

//alternative syntax for brevity: if you use "let" for all the associated values
switch productBarcode {
case let .UPCA(numberSystem, manufacturer, product, check):
    println("UPC-A: \(numberSystem), \(manufacturer), \(product), \(check).")
case let .QRCode(productCode):
    println("QR code: \(productCode).")
}
```

# Raw Values
Raw values can be strings, characters, or any of the integer or floating-point number types. Each raw value must be unique within its enumeration declaration. When integers are used for raw values, they auto-increment if no value is specified for some of the enumeration members.

```swift
enum TRaw: Int {
    case One = 1
    case Two = 2
}

if let tRaw = TRaw(rawValue: 1) {
    switch tRaw {
    case .One:
        println("T1")
    case .Two:
        println("T2")
    }
} else { //Raw value enum initializers are FAILABLE
    println("nil")
}
```

Reference: [Enumerations, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Enumerations.html#//apple_ref/doc/uid/TP40014097-CH12-ID145)
