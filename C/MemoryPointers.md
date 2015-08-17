# Memory Pointers
```c
void go_south_east(int *lat, int *lon) 
{
	*lat = *lat - 1;
	*lon = *lon + 1;
}

int main()
{
	int lat = 32;
	int lon = 42;

	go_south_east(&lat, &lon);

	printf("%i,%i\n", lat, lon);

	return 0;
}
```

## Using Memory Pointers
* the '*' operator gets the value of the pointer
* the '&' operator gets the address of the pointer
```c
int main()
{
	int x = 4;
	
	//store the address
	int *address_of_x = &x;

	//get the value of the address
	int value_of_x = *address_of_x;

	//change the value in the address
	*address_of_x = 100 + value_of_x;

	printf("x = %i\n", x); //x = 104

	return 0;
}
```
