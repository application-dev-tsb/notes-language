# Automatic Reference Counting
Swift uses Automatic Reference Counting (ARC) to track and manage your app’s memory usage
```swift
class Person {
    let name: String
    init(name: String) {
        self.name = name
        print("\(name) is being initialized")
    }
    deinit {
        print("\(name) is being deinitialized")
    }
}

var reference1: Person? = Person(name: "John Appleseed") // prints "John Appleseed is being initialized"
reference1 = nil // prints "John Appleseed is being deinitialized"
```
