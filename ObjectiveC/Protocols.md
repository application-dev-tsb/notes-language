# Protocols
```objectivec
//file: DecisionDatasourc.h
#import <Foundation/Foundation.h>

@protocol DecisionDatasource
@property NSString *propertyConformance;
- (void)doSomeRequiredThing;
@end
```
- heres how youy declare it as a property
```objectivec
@interface ProtocolClient : NSObject
@property id <DecisionDatasource> datasource;
@end
```
- you can specify if the property or method is required or optional
```objectivec
@protocol DecisionDatasource

@property NSString *propertyConformance; //required

- (void)doSomeRequiredThing; //required
- (void)doMe; //required

@optional
@property NSString *propNotRequired; //not required
- (void)notRequiredToImplement; //not required
- (void)alsoNotRequired; //not required

@required
- (void)requiredToImplement; //required

@end
```

## Check for Optional Methods at Runtime
```objectivec
- (void)doSomething {
    NSLog(@"Attempting");
    if ([self.datasource respondsToSelector:@selector(notRequiredToImplement)]) {
        [self.datasource notRequiredToImplement];
    }
}
```

## Conforming
```objectivec
//CoolDecisionDatasource.h
@interface CoolDecisionDatasource : NSObject <DecisionDatasource, Protocol2, Protocol3> // <-- you can adopt multiple protocols

@property NSString *propertyConformance;

- (void)doSomeRequiredThing;
- (void)doMe;
- (void)notRequiredToImplement;
- (void)requiredToImplement;

@end
//CoolDecisionDatasource.m
@implementation CoolDecisionDatasource
- (void)doSomeRequiredThing {
}

- (void)doMe {
}

- (void)notRequiredToImplement {
    NSLog(@"Im Not Required But I Implemented Crap Anyway");
}

- (void)requiredToImplement {
}
@end
```

## Protocols can Inherit from Multiple Protocols
```objectivec
@protocol Protocol2 <NSObject, DecisionDatasource>

@end
```
