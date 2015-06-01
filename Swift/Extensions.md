# Extension

### Basic Synthax
```swift
extension SomeType {
  func myNewMethod() {
    ...
  }
}
```

### Make the Type Adopt a Protocol
```swift
extension SomeType: SomeProtocol, AnotherProtocol {
    // implementation of protocol requirements goes here
}
```

### Avoid Conflicts Using the Private Keyword
```swift
//only the file will see your extension
private extension SomeType {
  func myNewMethod() {
    ...
  }
}
```


Source: [Apple Inc.](https://developer.apple.com/library/prerelease/ios/documentation/Swift/Conceptual/Swift_Programming_Language/Extensions.html)
