#Closures

##Syntax

```swift
{ (<params>) -> (<return type>) in
<statements>
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
