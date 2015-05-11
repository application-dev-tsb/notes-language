# Collections

## Arrays
```swift
//array initialization:
var myArray = Array<Int>()
var myArray = [Int]()
var myArray = [1, 2, 3, 4, 5]
var myArray = [Double](count: 10, repeatedValue: 10.5) //initialize an array with repeated values

//common array functions:

//append:
array.append("A")

//replace:
var shoppingList = ["0", "1", "2", "3", "4", "5", "6", "7", "8"]
shoppingList[3...5] = ["X", "X", "X", "X"] //["0", "1", "2", "X", "X", "X", "X", "6", "7", "8"]
shoppingList[1] = "XXXXX" // ["0", "XXX", "2"....XXXXX]

//add:
shoppingList += ["X", "Y", "Z"] //["0", "1", "2", "X", "X", "X", "X", "6", "7", "8", "X", "Y", "Z"]

//insert at index: add (not replace)
shoppingList.insert("INSERTED", atIndex: 1] 

//remove:
shoppingList.removeAtIndex(1)
shoppingList.removeLast()
```

## Dictionaries

## Sets
```swift
//set initialization
var mySet: Set<String> = Set<String>()
var mySet: Set<String> = ["A", "B", "C", "B"] //A,B,C
var mySet: Set = ["A", "B", "C"] //data type of elements can be infered

//insert
mySet.insert("A")

//remove
mySet.remove("A")

//contains
mySet.contains("A")

//iterating
for letter in mySet {
    println("Letter \(letter)")
}

//operations create new sets:
var setA: Set = ["A", "B", "C", "D"]
var setB: Set = ["C", "D", "E", "F"]

setA.union(setB) //ABCDEF
setA.intersect(setB) //CD
setA.exclusiveOr(setB) //ABFE
setA.subtract(setB) //AB
```

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

