#Properties

##Stored VS Computed
```swift

class MyClass {

  //stored
  var myVar: OtherClass = OtherClass()
  
  //computed
  var myComputerVar: Int {
    get {
    
    }
    set {
      //use "newValue" param
    }
  }
  
  //read-only computed
  var myRO: Int {
    return 1
  }
  
  
}


```

## Lazy Stored Properties
```swift
class LazyObject {
    init() {
        println("Init called")
    }
}

struct LazyClass {
    //lazy var should always be a variable
    //because constants need to have a value
    //before init completes
    lazy var lazyVar = LazyObject()
}

var l = LazyClass()
l.lazyVar //LazyObject initialize at this point only
```

## Property Observers
gets called before and after a property is set
```swift
class MyOtherClass {

  var myVar: Int = 1 {
    willSet {
      //use "newValue"
    }
    didSet {
      //use "oldValue"
    }
  }
}
```

##Type/Class Properties
```swift
enum SomeEnumeration {
    static var storedTypeProperty = "Some value."
    static var computedTypeProperty: Int {
        // return an Int value here
    }
}

//usage:
SomeEnumeration.storedTypeProperty
```

## Stored Properties of Constant Structure Instances
```swift
struct TestStruct {
    var x = 1
}

class TestClass {
    var x = 1
}

let ts = TestStruct(x: 2)
let tc = TestClass()

tc.x = 2
ts.x = 2 //ERROR: properties of constant structs cannot be modified
```
