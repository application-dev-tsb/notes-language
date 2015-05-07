# Optionals

```swift
class Person {
    var residence: Residence?
}

class Residence {
    var numberOfRooms = 1
}

let residence = Residence()

let john = Person()
john.residence = residence

//force unwrapping: fails when residence is null
let room = john.residence!.numberOfRooms

//optional chaining: gracefully sets the property to nil
let roomOptional = john.residence?.numberOfRooms
```

Optional chaining is a process for querying and calling properties, methods, and subscripts on an optional that might currently be nil. If the optional contains a value, the property, method, or subscript call succeeds; if the optional is nil, the property, method, or subscript call returns nil. Multiple queries can be chained together, and the entire chain fails gracefully if any link in the chain is nil.
