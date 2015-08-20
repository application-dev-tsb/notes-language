# Heap Allocation
* locally allocated memory by default, goes to the STACK
* allocating into the heap guarantees a longer lifetime than the method that created it
```c
#include <stdio.h>
#include <stdlib.h> //this is required for malloc and free

typedef struct island {
	char *name;
	struct island *next;
} island;

int main() {
	//allocate X bytes of memory to my_island
	//sizeof is mostly used in conjuction with malloc()
	island *my_island = malloc(sizeof(island));
	my_island->name = "Boom";
	
	printf("My island is: %s\n", my_island->name);

	//deallocate memory for my_island
	free(my_island);
	
 	return 0;
}
```

Resources:

[Gribble Lab - Memory: Stack VS Heap](http://gribblelab.org/CBootcamp/7_Memory_Stack_vs_Heap.html)
