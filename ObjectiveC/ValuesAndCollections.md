# Values and Collections
Although Objective-C is an object-oriented programming language, it is a superset of C, which means you can use any of the standard C scalar (non-object) types like int, float and char in Objective-C code. There are also additional scalar types available in Cocoa and Cocoa Touch applications, such as NSInteger, NSUInteger and CGFloat, which have different definitions depending on the target architecture.
```objectivec
//C primitives
char myChar = 'C';
short myShort = 9999;
int myInt = 999999999;
long myLong = 9999999999999999;
float myFloat = 1.0;
double myDouble = 1.0;
        
//BOOL
BOOL myBool = YES;
myBool = NO;
        
//NSString
NSString *myString = [NSString stringWithCString:"This is a C String" encoding:NSUTF8StringEncoding];
myString = @"NSString Literal";
        
//NSNumber: object to represent C char, short, int, long, float, double
NSNumber *myNumber = [NSNumber numberWithInt:myInt];
myNumber = @1;
myNumber = @'C';
        
int backToInt = [myNumber intValue]; //back to primitive
```

**References:**
* [Apple: Values and Collections](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/FoundationTypesandCollections/FoundationTypesandCollections.html#//apple_ref/doc/uid/TP40011210-CH7-SW1)