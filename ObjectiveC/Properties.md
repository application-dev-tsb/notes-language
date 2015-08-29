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
