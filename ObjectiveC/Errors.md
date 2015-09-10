# Errors
Errors are an unavoidable part of any app’s lifecycle. If you need to request data from a remote web service, for example, there are a variety of potential problems that may arise, including:
- No network connectivity
- The remote web service may be inaccessible
- The remote web service may not be able to serve the information you request
- The data you receive may not match what you were expecting

## Domains and Codes
For largely historical reasons, errors codes in OS X are segregated into domains. For example, Carbon error codes, which are typed as OSStatus, have their origin in versions of the Macintosh operating system predating OS X. On the other hand, POSIX error codes derive from the various POSIX-conforming “flavors” of UNIX, such as BSD. The Foundation framework declares in NSError.h the following string constants for the four major error domains

```objectivec
//ErrorMaker.h
@protocol ErrorMakingDelegate <NSObject>
- (void)errorDidHappen: (NSError *)error;
@end

@interface ErrorMaker : NSObject

@property (weak, nonatomic) id <ErrorMakingDelegate> errorDelegate;

- (void)doSomethingThatThrowsAnError:(NSError **)error;
- (void)dosomethingToTriggerTheDelegate;

@end
//ErrorMaker.m
@interface ErrorMaker ()
- (NSError *)createAnError;
@end

@implementation ErrorMaker

- (void)doSomethingThatThrowsAnError:(NSError **)error {
    *error = [self createAnError];
}

- (void)dosomethingToTriggerTheDelegate {
    [self.errorDelegate errorDidHappen:[self createAnError]];
}

- (NSError *)createAnError {
    NSString *domain = @"com.hoac.DemoApp.ErrorMakerDomain";
    NSString *desc = @"Something bad happened";
    
    NSDictionary *userInfo = @{NSLocalizedDescriptionKey: desc};
    
    return [NSError errorWithDomain:domain code:101 userInfo:userInfo];
}

@end
```
```objectivec
@interface MyDelegateHandler : NSObject <ErrorMakingDelegate>
@end

@implementation MyDelegateHandler
- (void)errorDidHappen: (NSError *)error {
    NSLog(@"Caught an Error as Parameter: %@", error);
}
@end

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        MyDelegateHandler *del = [MyDelegateHandler new];
        
        ErrorMaker *errorMaker = [ErrorMaker new];
        errorMaker.errorDelegate = del;
        
        //two ways to get an error:
        //1.) a passed by reference
        NSError *error;
        [errorMaker doSomethingThatThrowsAnError:&error];
        
        if (error) {
            NSLog(@"Error Passed by Reference: %@\n", error);
        }
        
        //2.) as a delegate parameter
        [errorMaker dosomethingToTriggerTheDelegate];
        
    }
    return 0;
}
```


**References:**
* [Notes: Internationalization and Localization](https://github.com/hack-of-all-codes/NotesIOS/blob/master/InternationalizationAndLocalization.md)
* [Apple: Errors](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/ErrorHandling/ErrorHandling.html)
* [Apple: Error Domains and Codes](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ErrorHandlingCocoa/ErrorObjectsDomains/ErrorObjectsDomains.html)


