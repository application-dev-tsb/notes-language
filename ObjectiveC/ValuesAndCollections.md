# Values and Collections
Although Objective-C is an object-oriented programming language, it is a superset of C, which means you can use any of the standard C scalar (non-object) types like int, float and char in Objective-C code. There are also additional scalar types available in Cocoa and Cocoa Touch applications, such as NSInteger, NSUInteger and CGFloat, which have different definitions depending on the target architecture.

Scalar types are used in situations where you just don’t need the benefits (or associated overheads) of using an object to represent a value. While strings of characters are usually represented as instances of the NSString class, numeric values are often stored in scalar local variables or properties.

It’s possible to declare a C-style array in Objective-C, but you’ll find that collections in Cocoa and Cocoa Touch applications are usually represented using instances of classes like NSArray or NSDictionary. These classes can only be used to collect Objective-C objects, which means that you’ll need to create instances of classes like NSValue, NSNumber or NSString in order to represent values before you can add them to a collection.

The previous chapters in this guide make frequent use of the NSString class and its initialization and class factory methods, as well as the Objective-C @"string" literal, which offers a concise syntax to create an NSString instance. This chapter explains how to create NSValue and NSNumber objects, using either method calls or through Objective-C value literal syntax.

**References:**
* [Apple: Values and Collections](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/FoundationTypesandCollections/FoundationTypesandCollections.html#//apple_ref/doc/uid/TP40011210-CH7-SW1)
