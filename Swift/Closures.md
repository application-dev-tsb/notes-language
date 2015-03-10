#Closures

##Syntax

```swift
{ (<params>) -> (<return type>) in
<statements>
}
```

### Method with Closure as a parameter
```swift

//this function accepts a closure that has two string params
//and returns a string
func runClosure(myClosure:(String,String->String)) {
  var myString = myClosure("Test","Test2")
}

runClosure({ (s1: String, s2: String) -> String in
  return "\(s1) \(s2)"
})

```

### Complete
```swift
{ (param1: String, param2: String) -> String in
  return "test\(param1) \(param2)"
}
```

### Optional Types
```swift
{ (param1, param2) in
  return "test\(param1) \(param2)"
}
```

### Implicit Return
```swift
{ (param1, param2) in "test\(param1) \(param2)" }
```

### Shorthand Argument Names
```swift
{ "test\($0) \($1)" }
```

### Trailing Closure
