# C Basics

## Steps to Run a C Program:
* Code
```c
/*
 * filename: hello.c
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

## Basic I/O
```c
int main()
{
	//basic output
	puts("Enter a Positive Number:\n");

	int number;

	//basic input
	scanf("%i", &number);

	if (number < 0) {
		puts("This is not a valid number");
		return -1; //program failed
	}

	//formatted output
	printf("%i is an awesome number\n", number);
	return 0;
}
```

### References:
[Gnu C Language Reference](http://www.gnu.org/software/gnu-c-manual/gnu-c-manual.html)
