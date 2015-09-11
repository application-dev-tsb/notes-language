# Properties

- By Default, a Property stores the value in the variable automatically synthesized by the compiler:
```objectivec
@interface Robot ()
@property NSString *codeName;
@end

//example:
 _codeName = @"Test";
```
- Properties can be accessed through accessors, dot-syntax, and directyly through the variable it is stored
```objectivec
_codeName = @"Test";
[self setCodeName:@"Test"];
self.codeName = @"Test";
```
- You can define (synthesize) custom variable for storing properties
```
@implementation Robot
@synthesize codeName = _codeNameStorage;
@end

//access:
_codeNameStorage = @"Test";
```
- You can define instance variables without using properties
```objectivec
@implementation Robot
NSString *_mySecretCode;
@end
```
- You can implement custom accessor
```objectivec
@property (readonly) int secretNumber;

- (int)secretNumber {
    return 1;
}
```

## ARC (Strong, Weak, Unsafe_Unretained, Retain, Copy)
- variable and property references can be specified
```objectivec

//properties:
@property (strong) NSString *codeName; //DEFAULT: as long as one strong pointer is left, the object will never be dereferenced
@property (weak) NSString *codeName; //reference count does not increase here
@property (unsafe_unretained) NSString *codeName; //for older classes that does not support ARC

//copy - creates a copy (via the copy method) and creates a strong reference to that object
//retain - 

//variables:
NSObject __strong *someUnsafeRef;
NSObject __weak *someUnsafeRef;
NSObject __unsafe_unretained *someUnsafeRef;
```
- unsafe_unretained is just like a weak pointer, its for legacy objects that cant support weak
- ***strong*** is the default, but conventions dictate that we still specify it in property declaration
