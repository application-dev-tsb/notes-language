# Generics
Generic code enables you to write flexible, reusable functions and types that can work with any type, subject to requirements that you define. You can write code that avoids duplication and expresses its intent in a clear, abstracted manner
```swift
//generic functions
func swapTwoItems<T>(inout item1: T, inout item2: T) {
    var temp = item1
    item1 = item2
    item2 = temp
}


var i1 = 1
var i2 = 2

swapTwoItems(&i1, &i2)

println("test:\(i1) \(i2)")

//generic Types

class Genclass<T> {
    func doSomething(t: T) -> T {
        return t
    }
}

struct Genstruct<T> {
    func doMe(t: T) -> T {
        return t
    }
}


var g = Genclass<Int>()
var gs = Genstruct<String>()

var x = g.doSomething(2)
var y = gs.doMe("2")
```
