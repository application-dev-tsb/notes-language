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

//unwrapping an Optional type, will crash if no value
println("int:\(myInt!)")
```

## Optional Binding
Optional binding can be used with if and while statements to check for a value inside an optional, and to extract that value into a constant or variable, as part of a single action
```swift
var myInt: Int? = opFunc("123")

if var unwrappedInt = myInt {
    println("int:\(myInt!)")
} else {
    println("no value unwrapped")
}
```
