# Structures
```c
 struct human
 {
 	const char *name;
 	int age;
 	float weight;
 };

 void do_another_thing(struct human h);


int main() {
	//creating a new struct
	struct human h = {"Test", 10, 12.4};
	do_another_thing(h);
 	return 0;
}

//struct as param
void do_another_thing(struct human h) 
{
	//accessing struct
	printf("Name: %s\nAge: %i\nWeight: %f\n", h.name, h.age, h.weight);
}
```

## Shorthand with typedef
```c
 typedef struct 
 {
 	const char *name;
 	int age;
 	float weight;
 } human;

 void do_another_thing(human h);


int main() {
	//creating a new struct
	human h = {"Test", 10, 12.4};
	do_another_thing(h);
 	return 0;
}

//struct as param
void do_another_thing(human h) 
{
	//accessing struct
	printf("Name: %s\nAge: %i\nWeight: %f\n", h.name, h.age, h.weight);
}
```

#### Notes:
* structs are not pointers, when it is reassinged to another variable, A NEW COPY IS MADE
