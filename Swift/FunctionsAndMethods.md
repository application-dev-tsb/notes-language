# Functions
Functions are self-contained chunks of code that perform a specific task
```swift

//complete function:
func countAPersonsResidence(person:Person, residence: Residence?) -> Int {
    return person.residence!.numberOfRooms;
}

//TODO: ignore/variable values/default parameters
//TODO: Curried functions
//TODO: In-Out parameters
//TODO: Multiple return values
```

## External Parameter Names
Sometimes it’s useful to name each parameter when you call a function, to indicate the purpose of each argument you pass to the function
```swift
var a = 1
var b = 2

func sum(withAddend a1: Int, a2: Int) -> Int {
    return a1 + a2
}

//note: if you provide an external parameter name for a parameter, that external name must always be used when you call the function
println("sum:\(sum(withAddend: a,b))")

//shorthand: external and local parameter name are the same
func sum(#a1: Int, #a2: Int) -> Int {
    return a1 + a2
}
println("sum:\(sum(a1: a,a2: b))")
```

## Variadic Parameters
A variadic parameter accepts zero or more values of a specified type. You use a variadic parameter to specify that the parameter can be passed a varying number of input values when the function is called. Write variadic parameters by inserting three period characters (...) after the parameter’s type name
```swift
//note: the variadic parameter must be the last in the parameter list
func sumAll(a1: Int, a2: Double...) -> Double {
    var sum = 0.0
    sum += Double(a1)
    
    for d in a2 {
        sum += d
    }
    
    return sum
}

println("sum:\(sumAll(1, 2.0, 3.0, 5.0))") //11.0
```

Reference: [Functions, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Functions.html#//apple_ref/doc/uid/TP40014097-CH10-ID158)

# Methods
Methods are functions that are associated with a particular type

Reference: [Methods, Apple Inc.](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Methods.html#//apple_ref/doc/uid/TP40014097-CH15-ID234)

```swift
//TODO: demonstrate SELF
```

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
