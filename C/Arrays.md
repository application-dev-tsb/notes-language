# Arrays
```c
#include <stdio.h>

int main() {

	int array[10] = {1, 2, 3, 4, 5};
	int array2[] = {1, 2, 3, 4, 5};

	//prints the length of the array
	printf("size of the array %lu\n", sizeof(array) / sizeof(int));

	//accessing elements
	int value = array2[2]; //3

	//updating elements
	array[0] = value;

	printf("new value of the first element in array: %i\n", array[0]);
	
 	return 0;
}
```
