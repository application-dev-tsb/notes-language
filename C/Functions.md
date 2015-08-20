# Functions
You can write functions to separate parts of your program into distinct subprocedures. To write a function, you must at least create a function definition. It is a good idea also to have an explicit function declaration; you don't have to, but if you leave it out, then the default implicit declaration might not match the function itself, and you will get some compile-time warnings
```c
//declaration:
return-type function-name (parameter-list);

//definition:
return-type
function-name (parameter-list)
{
  function-body
}
```

## Variadic Parameter Functions
```c
#include <stdarg.h> //this library is required

void variadic(int i, ...);

int main() {

	variadic(3, "aws", "block", "catch");
	
 	return 0;
}

void variadic(int size, ...) {

	va_list params;

	//params: 
	//1 - tha va_list
	//2 - the last argument before the va_list
	va_start(params, size);

	for (int i=0; i<size; i++) {
		//get the value of the var args
		char *val = va_arg(params, char*);
		
		printf("%s\n", val);
	}

	va_end(params);
}
```

## Static Functions
You can define a function to be static if you want it to be callable only within the source file where it is defined:
```c
static int foo (int x)
{
	return x + 42;
}
```


Resources:

[Gnu C Manual](http://www.gnu.org/software/gnu-c-manual/gnu-c-manual.html#Functions)

## Useful Functions
[Tutorials Point - Standard Library Reference](http://www.tutorialspoint.com/c_standard_library/index.htm)

* sizeof
```c
//technically an operator
sizeof(array);
sizeof(pointer); //4 or 8 (bytes) depending on the OS address size
```
* scanf
```c
char name[40];
scanf("%39s", &name); //the last character is the terminator for strings
```
* fgets
```c
//same as scanf with a limit on input size and only works with one variable
fgets(name, sizeof(name), stdin); 
```
* printf
```c
printf("%s\n", "The message gets printed to the standard output");
```
* fprintf
```c
//replace stdout with stderr if you want to output on the error channel
fprintf(stdout, "%s\n", "Error Message Here");
```

## String Functions
* strstr
```c
	char *str1 = "testament";
	char *str2 = "test";

	//questionable usefulness
	int x = strstr(str1, str2); //memory address of the first 't'
```
* strchr
```c
//returns a pointer to the first occurence of the character param
printf("%s", strchr(str1, 'a')); //"testament" -> "ament"
```
* strcmp
* strcpy
* strlen
```c
int x = strlen(str1); //length of the string
```
* strcat
