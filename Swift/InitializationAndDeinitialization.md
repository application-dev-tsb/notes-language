# Initialiation
nitialization is the process of preparing an instance of a class, structure, or enumeration for use. This process involves setting an initial value for each stored property on that instance and performing any other setup or initialization that is required before the new instance is ready for use
```swift
//default initializer for strucst: property-wise initializer
struct Fahrenheit {
    var temperature: Double
}
var f = Fahrenheit(temperature: 1.25)

//custom initializer
struct Fahrenheit {
    
    var temperature: Double
    
    init() {
        temperature = 32.0
    }
}
var f = Fahrenheit()
```

Reference: [Apple Inc., Initialization](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Initialization.html#//apple_ref/doc/uid/TP40014097-CH18-ID203)

# Deinitialization
