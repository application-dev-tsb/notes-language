# Classes
A class describes the behavior and properties common to any particular type of object

## Interface
* defined in a **.h (header) file
* can inherit/subclass other classes
* can declare properties
* can delare methods
```objectivec
//file: Robot.h
#import <Foundation/Foundation.h>

@interface Robot : NSObject

@property NSString *name;
@property (readonly) int kills; //attributes

- (void)activate;
- (BOOL)scanIfTarget:(NSString *)human;
- (void)kill:(NSString *)human usingWeapon:(NSString *)weapon;

@end
```

## Implementation
```objectivec
//file: Robot.m
#import "Robot.h"

@implementation Robot

- (void)activate {
    NSLog(@"Activate");
}

- (BOOL)scanIfTarget:(NSString *)human {
    NSLog(@"Scanning: %@", human);
    if ([human isEqualToString:@"bieber"]) {
        return YES;
    }
    return NO;
}

- (void)killHuman:(NSString *)human usingWeapon:(NSString *)weapon {
    NSLog(@"%@ is attacking %@ using %@", self.name, human, weapon);
}

@end
```

## Class Usage
```objectivec
#import <Foundation/Foundation.h>
#import "Robot.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        // insert code here...
        Robot *robot = [[Robot alloc] init];
        robot.name = @"Terminator"; //accessing properties
        
        [robot activate]; //sending messages
        NSString *bieber = @"bieber";
        if ([robot scanIfTarget:bieber]) {
            [robot killHuman:bieber usingWeapon:@"Machine Gun"];
        }
    }
    return 0;
}
```


## Initializers
```objectivec
//Robot.h
- (id)init
- (id)initWithName:(NSString *)name;

//Robot.m
- (id)init {
    return self;
}

- (id)initWithName:(NSString *)name {
    if (name==nil || [name isEqualToString:@""]) {
        return nil;
    }
    self.name = name;
    return self;
}

//usage:

Robot *robot = [[Robot alloc] initWithName:@"Terminator"];
Robot *robot = [Robot new]; //init with no parameter

```

Reference:

[ObjectiveC Classes, Apple Inc.](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/DefiningClasses/DefiningClasses.html#//apple_ref/doc/uid/TP40011210-CH3-SW1)
