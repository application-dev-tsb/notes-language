# Functions
Functions are self-contained chunks of code that perform a specific task

```swift

//complete function:
func countAPersonsResidence(person:Person, residence: Residence?) -> Int {
    return person.residence!.numberOfRooms;
}
```

Reference: [Functions, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Functions.html#//apple_ref/doc/uid/TP40014097-CH10-ID158)

# Methods
Methods are functions that are associated with a particular type

Reference: [Methods, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Methods.html#//apple_ref/doc/uid/TP40014097-CH15-ID234)

# Subscripts
Subscripts enable you to query instances of a type by writing one or more values in square brackets after the instance name

```swift
subscript(index: Int) -> Int {
    get {
        // return an appropriate subscript value here
    }
    set(newValue) {
        // perform a suitable setting action here
    }
}
```
Reference: [Subscripts, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Subscripts.html#//apple_ref/doc/uid/TP40014097-CH16-ID305)
