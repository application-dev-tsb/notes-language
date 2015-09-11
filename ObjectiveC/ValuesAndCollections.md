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

## Collections
```objectivec
//Arrays: Ordered Collection of Ojects
NSArray *myArray = [NSArray arrayWithObjects:@"A", @'B', nil];
myArray = @[@"A", @"B"];
        
NSString *b = [myArray objectAtIndex:1]; //B
NSString *a = myArray[0]; //A
NSLog(@"a=%@ b=%@", a, b);
        
//Sets: Unordered Collection of Distinct Objects
NSSet *mySet = [NSSet setWithObjects:@"A", @1, @'C', nil];

//Dictionary:
NSDictionary *myDict = @{@"A":@1, @"B":@2, @"C":@3};
NSLog(@"A=%@", myDict[@"A"]); //1
        
//order is: object, then key
myDict = [NSDictionary dictionaryWithObjectsAndKeys:@1, @"A", @2, @"B", @3, @"C", nil];
NSLog(@"C=%@", myDict[@"C"]); //3
```

## Collection Values cannot be nil
```objectivec
NSMutableDictionary *mutableDict = [NSMutableDictionary dictionaryWithObjectsAndKeys:@1, @"A", @2, @"B", @3, @"C", nil];
NSLog(@"C=%@", mutableDict[@"C"]); //3
        
mutableDict[@"C"] = [NSNull null];
NSLog(@"C=%@", mutableDict[@"C"]); //null
        
if (mutableDict[@"C"] == [NSNull null]) {
        NSLog(@"It is null!!!");
}
```

## Wrapping Structs with NSValue
It’s also possible to create NSValue objects to represent custom structures. If you have a particular need to use a C structure (rather than an Objective-C object) to store information, like this:
```objectivec
typedef struct MyStruct {
    int i;
    float f;
} MyStruct;

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        struct MyStruct myStruct;
        myStruct.i = 1;
        myStruct.f = 2.0;

        NSValue *structAsValue = [NSValue value:&myStruct withObjCType:@encode(MyStruct)];
        
        struct MyStruct extractedStruct;
        [structAsValue getValue:&extractedStruct];
        
        NSLog(@"i=%i, f=%f", extractedStruct.i, extractedStruct.f);
    }
    return 0;
}
```

## Enumeration
```objectivec
NSArray *arr = @[@"A", @"B", @"C", @"D"];
        
//fast enumeration
for (id val in arr) {
        NSLog(@"fast=%@", val);
}
        
//NSEnumerator
for (id val in [arr reverseObjectEnumerator]) {
        NSLog(@"a=%@", val);
}

id val;
NSEnumerator *enumerator = [arr reverseObjectEnumerator];
while (val = [enumerator nextObject]) {
        NSLog(@"b=%@", val);
}
```

**References:**
* [Apple: Values and Collections](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/FoundationTypesandCollections/FoundationTypesandCollections.html#//apple_ref/doc/uid/TP40011210-CH7-SW1)
