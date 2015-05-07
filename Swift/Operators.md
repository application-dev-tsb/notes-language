# Operators

## Asignment
```swift

//asignment operator
var a = 1
var b = 3

//decomposing a tuple:
var myTuple = (1, 2, 3, 4)

var (x, _, y, _) = myTuple

//equivalent:
var x = myTuple.0
var y = myTuple.2

//NOTE: use _ for things you dont care about
```

## Arithmetic
```swift
var sum = 1 + 1
var concatenatedString = "Test" + "AnotherTest"
5 - 3 //2
2 * 3 //6
10.0 / 2.51 //4
5 % 2 //1
-5 % 2 //-1

//-1 the sign for the value of B is always ignored so -A % -B will yield similar results to -A % B
-5 % -2

//0.5 swift's modulo operator can return floating-point result
8 % 2.5
```

## Increment/Decrement
```swift
var i = 9

//post = 9, since i was returned before incrementing
let post = i++

//pre = 11, incremented before returning the value
let pre = ++i

var f = 15.5
f++ //16.5 increment also works with floating types
```