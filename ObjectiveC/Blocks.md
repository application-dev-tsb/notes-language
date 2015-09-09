# Blocks
An Objective-C class defines an object that combines data with related behavior. Sometimes, it makes sense just to represent a single task or unit of behavior, rather than a collection of methods.

Blocks are a language-level feature added to C, Objective-C and C++, which allow you to create distinct segments of code that can be passed around to methods or functions as if they were values. Blocks are Objective-C objects, which means they can be added to collections like NSArray or NSDictionary. They also have the ability to capture values from the enclosing scope, making them similar to closures or lambdas in other programming languages.

```objectivec
//block declaration
void (^myblock)(void);
        
//assign
myblock = ^{
  NSLog(@"A void block");
};
        
//invoke: will crash if nil
myblock();
```

## Blocks with Parameter and Return Type
```objectivec

int (^addTwoInt)(int,int) = ^ (int a, int b) {
        return a + b;
};
        
int result = addTwoInt(1, 2);
```
