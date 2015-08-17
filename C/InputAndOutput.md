# Input and Output
```c
//p1.c
#include <stdio.h>


int main()
{
	for (int n = 0; n < 3; n++) {
		printf("number %i\n", n);
	}

	return 0;
}

//p2.c
int main()
{
	char input[100];
	
	while(scanf("%s", input) == 1) {
		printf("He entered %s\n", input);
	}

	return 0;
}
```

## Pipe 
* feeds the output of p1 to p2
```ssh
./p1 | ./p2
```

## Redirect 
```
input.txt:
test 1
test 2
test 3
```
* feeds input.txt to p2:
```
./p2 < input.txt
```
* writes the output into a file:
```
./p2 > output.txt
```


