# Categories
* adds method to existing classes which you dont have the source code for
```objectivec
//file:Robot+Humanity.h
#import "Robot.h"

@interface Robot (Humanity)

- (void)feel:(NSString *)feeling;

@end
```

```objectivec
//file:Robot+Humanity.m
#import "Robot+Humanity.h"

@implementation Robot (Humanity)

- (void)feel:(NSString *)feeling {
    NSLog(@"Robot felt %@", feeling);
}

@end
```

# Class Extensions
* adds methods to class implementation which you have the source code available for compilation
```c
//file: Robot.m
@interface Robot ()

@property int secretNumber;

@end
```
