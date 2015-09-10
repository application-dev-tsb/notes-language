# Errors
Errors are an unavoidable part of any app’s lifecycle. If you need to request data from a remote web service, for example, there are a variety of potential problems that may arise, including:
- No network connectivity
- The remote web service may be inaccessible
- The remote web service may not be able to serve the information you request
- The data you receive may not match what you were expecting
Reference: [Errors](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/ErrorHandling/ErrorHandling.html)

## Domains and Codes
For largely historical reasons, errors codes in OS X are segregated into domains. For example, Carbon error codes, which are typed as OSStatus, have their origin in versions of the Macintosh operating system predating OS X. On the other hand, POSIX error codes derive from the various POSIX-conforming “flavors” of UNIX, such as BSD. The Foundation framework declares in NSError.h the following string constants for the four major error domains

[Error Domains and Codes](https://developer.apple.com/library/mac/documentation/Cocoa/Conceptual/ErrorHandlingCocoa/ErrorObjectsDomains/ErrorObjectsDomains.html)


