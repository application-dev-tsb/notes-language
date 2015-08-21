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
@property int kills;

- (void)activate;
- (BOOL)scanIfTarget:(NSString*)human;
- (void)kill:(NSString*)human usingWeapon:(NSString*)weapon;

@end
```

## Implementation

## Objective-C Classes Are also Objects

Reference:

[ObjectiveC Classes, Apple Inc.](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/DefiningClasses/DefiningClasses.html#//apple_ref/doc/uid/TP40011210-CH3-SW1)
