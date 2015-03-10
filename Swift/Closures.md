#Closures

##Syntax

```swift
//inline closure
{ (<params>) -> (<return type>) in
<statements>
}

//as params or data type:
(<params> -> <return>)
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

var closureAsVar:((String,String)->String) = { (p1,p2) in
  return "xx"
}

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
