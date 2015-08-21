# Categories
* adds method to existing classes


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
