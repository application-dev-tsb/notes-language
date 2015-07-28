# Optionals
You use optionals in situations where a value may be absent. An optional says:
* There is a value, and it equals x or
* There isn’t a value at all
```swift
//optional variable
var opInt: Int? = 400

//Int (without the ?) cannot be assigned to nil
//nil is "no value" for optionals
opInt = nil 

//optional return type for functions
func opFunc(t: String) -> Int? {
    return t.toInt();
}

var myInt = opFunc("123")

//unwrapping an Optional type
println("int:\(myInt!)")
```
