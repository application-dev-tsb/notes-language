# Automatic Reference Counting
Swift uses Automatic Reference Counting (ARC) to track and manage your app’s memory usage
```swift
class Person {
    let name: String
    init(name: String) {
        self.name = name
        println("\(name) is being initialized")
    }
    deinit {
        println("\(name) is being deinitialized")
    }
}

var reference1: Person?
var reference2: Person?
var reference3: Person?

reference1 = Person(name: "John")
reference2 = reference1
reference3 = reference1

reference1 = nil


//nil, John, John
println("\(reference1), \(reference2), \(reference3)")
```

## Weak Reference
```swift
//change the reference to weak
var reference1: Person?
weak var reference2: Person?
weak var reference3: Person?
.
.
.
reference1 = nil

//nil, nil, nil
println("\(reference1), \(reference2), \(reference3)")
```
