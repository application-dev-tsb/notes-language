# Strings And Characters
A string is an ordered collection of characters, such as "hello, world" or "albatross". Swift strings are represented by the String type, which in turn represents a collection of values of Character type.

Swift’s String and Character types provide a fast, Unicode-compliant way to work with text in your code. The syntax for string creation and manipulation is lightweight and readable, with a string literal syntax that is similar to C. String concatenation is as simple as adding together two strings with the + operator, and string mutability is managed by choosing between a constant or a variable, just like any other value in Swift.

Despite this simplicity of syntax, Swift’s String type is a fast, modern string implementation. Every string is composed of encoding-independent Unicode characters, and provides support for accessing those characters in various Unicode representations.

You can also use strings to insert constants, variables, literals, and expressions into longer strings, in a process known as string interpolation. This makes it easy to create custom string values for display, storage, and printing.

- String Literals
```swift
var myString = "test"
//create an empty string
var myString = ""
var myString = String()
```

- String Interpolation
```swift

var otherObject = ...
var myInterpolatedString = "The object description is: \(otherObject)"

```

- Strings are value types (passed as copy to parameters - a built-in safety precaution)

## Extended Grapheme Cluster
Extended grapheme clusters are a flexible way to represent many complex script characters as a single Character value. For example, Hangul syllables from the Korean alphabet can be represented as either a precomposed or decomposed sequence.
```swift
var usFlag: Character = "\u{1F1FA}\u{1F1F8}"
```

More Info: [Extended Grapheme Cluster](https://developer.apple.com/library/ios/documentation/Swift/Conceptual/Swift_Programming_Language/StringsAndCharacters.html#//apple_ref/doc/uid/TP40014097-CH7-ID296)
