# Protocols
A protocol defines a blueprint of methods, properties, and other requirements that suit a particular task or piece of functionality
```swift
protocol Killable {
    var hp: Int { get set }
    func kill()
}

class Human: Killable {
    
    var hp: Int = 1
    
    func kill() {
        
    }
}
```
