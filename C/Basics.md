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
* Main can also accept parameters
```
> ./program param1 param2 param3
```
```c
int main(int argc, char *argv[]) 
{
	for (int i=1; i<argc; i++) {
		printf("%i = %s\n", i, argv[i]);
	}
	return 0;
}
```
* Named options are also accepted
```
> ./program -a -n "El Awesomo" aaa bbb ccc
```
```c
//accepts options and normal params:
//-a = boolean to enable, no argument needed
//-n = your name, needs arguments
int main(int argc, char *argv[]) 
{

	char ch;
	while ((ch = getopt(argc, argv, "an:")) != EOF) {
		switch (ch) {
			case 'a':
				printf("Awesomeness enabled!\n");
				break;
			case 'n':
				printf("Name: %s\n", optarg); //no idea where this came from
				break;
			default:
				printf("Error: Unknown Parameter\n");
				return 1;
		}
	}

	//no idea where optind came from
	argc -= optind;
	argv += optind;

	//outputs the trailing arguments
	for (int i=0; i<argc; i++) {
		printf("%i = %s\n", i, argv[i]);
	}
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
