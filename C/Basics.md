# C Basics

Steps to Run a C Program:
* Code (hello.c)
```c
/*
 * every C file should start with a comment explaining
 * what the code this
 */
#include <stdio.h>

//this is a one-liner comment
int main()
{
	puts("Hello World C-Style");
	return 0;
}
```
* Compile
```
> gcc hello.c -o hello
```
* Run
```
> ./hello

//combine compile and run:
> gcc hello.c -o hello && gcc hello.c -o hello
```

## The "main" function
* C programs start with the main() function
* It returns an int, 0 if successful, otherwise it failed
```c
int main() {
	return 0;
}
```


