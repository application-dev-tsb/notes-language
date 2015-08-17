# Functions

## Useful Functions
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
