# Initialization
nitialization is the process of preparing an instance of a class, structure, or enumeration for use. This process involves setting an initial value for each stored property on that instance and performing any other setup or initialization that is required before the new instance is ready for use
```swift
//default initializer for structs: property-wise initializer
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
    
struct Fahrenheit {
    
    var temperature: Double = 69.0
    
    init() {
        temperature = 32.0
    }
    
    //with param, external name is default for all parameters
    //NOTE: default values are not allowed for initializer params
    init(temperature: Double) {
        self.temperature = temperature
    }
    
    //overloaded initializer with different method name
    init(fromKelvin kelvin: Double) {
        temperature = (kelvin * 9 / 5) - 459.67
    }
    
    init(fromCelsius celsius: Double) {
        temperature = ......
    }
    
    //initializer delegation
    init(multipliedBy multiplier: Int, temperature: Double) {
        self.init(temperature: temperature * Double(multiplier))
        //init should be called BEFORE any call to self
        self.temperature = 100.0
    }
}

//multiple initializers are allowed, as long as all properties
//are set to their allowed values before init ends
var f = Fahrenheit(temperature: 20)
f = Fahrenheit(fromKelvin: 2000)
```

Reference: [Apple Inc., Initialization](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Initialization.html#//apple_ref/doc/uid/TP40014097-CH18-ID203)

# Deinitialization
