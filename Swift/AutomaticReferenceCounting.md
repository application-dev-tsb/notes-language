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

//as long as a single STRONG (default) reference holds the memory
//it will never be deallocated
//nil, John, John
println("\(reference1), \(reference2), \(reference3)")
```

## Weak Reference
A weak reference is a reference that does not keep a strong hold on the instance it refers to, and so does not stop ARC from disposing of the referenced instance
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

## Unowned Reference
Like weak references, an unowned reference does not keep a strong hold on the instance it refers to. Unlike a weak reference, however, an unowned reference is assumed to always have a value
```swift
var reference1: Person? = Person(name: "John")
unowned var reference2: Person = reference1!
unowned var reference3: Person = reference1!

reference1 = nil

println("Reference 1:\(reference2)") //ERROR
```
