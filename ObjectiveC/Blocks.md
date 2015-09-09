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

## Parameter and Return Type
```objectivec

int (^addTwoInt)(int,int) = ^ (int a, int b) {
        return a + b;
};
        
int result = addTwoInt(1, 2);
```

## Capturing Variables
```objectivec
int main(int argc, const char * argv[]) {
    @autoreleasepool {
    
        int x = 1;
        
        void (^alterValue)(void) = ^ {
             NSLog(@"captured x=%i", x); //still 1
        };
        
        x = 2;
        
        alterValue();
        
        NSLog(@"x=%i", x); //2
    }
    return 0;
}
```

## __block variables are in a Shared Storage
```objectivec
int main(int argc, const char * argv[]) {
    @autoreleasepool {
    
        __block int x = 1;
        
        void (^alterValue)(void) = ^ {
            NSLog(@"captured x=%i", x); //captured as 1
            x = x + 5;
        };
        
        alterValue();
        
        NSLog(@"x=%i", x); //6
    }
    return 0;
}
```

## Functions  can Accept Block Parameters
```objectivec
int main(int argc, const char * argv[]) {
    @autoreleasepool {
    
        int (^myAdder)(int,int) = ^ (int a, int b) {
            return 10;
        };
        
        runAdder(myAdder);
    }
    return 0;
}


//function
void runAdder(int (^adder)(int, int)) {
    int result = adder(500, 600);
    NSLog(@"Result=%i", result); //10
}
```

## Methods can Accept Block Parameters
```objectivec
//methods
//AddedExecutor.h
@interface AddedExecutor : NSObject

- (void)performAdder:(int (^)(int,int))adder;
                      
@end

//AddedExecutor.m
@implementation AddedExecutor

- (void)performAdder:(int (^)(int,int))adder {
    int result = adder(2, 5);
    NSLog(@"result=%i", result);
}

@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        AddedExecutor *a = [AddedExecutor new];
    
        int (^myAdder)(int,int) = ^ (int a, int b) {
            return 10;
        };
        
        [a performAdder:myAdder];
    }
    return 0;
}
```

## Blocks can be Properties
```objectivec
@property (copy) int (^adder)(int,int); 
```
