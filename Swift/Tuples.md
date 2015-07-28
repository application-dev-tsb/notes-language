# Tuples
Tuples group multiple values into a single compound value. The values within a tuple can be of any type and do not have to be of the same type as each other
```swift
//simple declaration
let http404Error = (404, "Not found")
println("Error:\(http404Error.1)") //Error:Not found

//function that returns a tuple
func tupturn() -> (Int, String) {
    return (200, "OK")
}
```

## Decomposing
```swift
//extract the values from the tuple
let (statusCode, statusMessage) = http404Error
println("The status code is \(statusCode)")

//you can ignore other values
let (justTheStatusCode, _) = http404Error
println("The status code is \(justTheStatusCode)")
```

## Naming Tuple Values
```swift
let http200 = (statusCode: 200, message: "OK")

func tupturn() -> (statusCode: Int, message: String) {
    return (message: "Boo", statusCode: 1) //order no longer matters when values are mapped to names
}
````
