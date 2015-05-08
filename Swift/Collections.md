# Collections

## Arrays

## Dictionaries

## Sets

## Notes on Collections
- assigning collections to a "var" will make it mutable, and "let" to make it immutable
```swift
var mutableIntArray = [Int]()

mutableIntArray.append(1)
mutableIntArray.append(2)

let nonMutableArray = [1, 2, 3, 4]

nonMutableArray.append(5) //ERROR: array is immutable
```

Source: [Apple Inc.] (https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/CollectionTypes.html#//apple_ref/doc/uid/TP40014097-CH8-ID105)

