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

## Recursive Struct
```c
typedef struct island {
	char name[1000];
	long long position;
	struct island *next;
} island;
```

## Modifying a Struct from another Place
```c
void do_another_thing(human *h);

int main() {
	//creating a new struct
	human h = {"Test", 10, 12.4};
	do_another_thing(&h);
	do_another_thing(&h);
 	return 0;
}

//struct as param
void do_another_thing(human *h) 
{
	//accessing struct
	printf("Name: %s\nAge: %i\nWeight: %f\n", (*h).name, (*h).age, (*h).weight);

	//modifying a struct 
	(*h).age = (*h).age + 1;
}
```

## Alternative Syntax to (*_)
```c
void do_another_thing(human *h) 
{
	printf("Name: %s\nAge: %i\nWeight: %f\n", h->name, h->age, h->weight);
	h->age = h->age + 1;
}
```

# Unions
```c
 typedef union {
 	int grade;
 	float super_powers;
 } awesomeness;

 typedef struct 
 {
 	const char *name;
 	int age;
 	float weight;
 	awesomeness awe;
 } human;

void do_another_thing(human *h);


int main() {
	//creating a new struct
	human h = {"Test", 10, 12.4, .awe={.grade=100}};
	//alternative: human h = {"Test", 10, 12.4, .awe={100}}; <-only works if using first field in the union
	do_another_thing(&h);
	do_another_thing(&h);
 	return 0;
}

//struct as param
void do_another_thing(human *h) 
{
	printf("Name: %s\nAge: %i\nWeight: %f\n", h->name, h->age, h->weight);
	printf("Awesomeness: %i\n", h->awe.grade);
	h->age = h->age + 1;
}
```

## Bit Fields
You can create structures with integer members of nonstandard sizes, called bit fields. You do this by specifying an integer (int, char, long int, etc.) member as usual, and inserting a colon and the number of bits that the member should occupy in between the member's name and the semicolon.
```c
struct card
{
	unsigned int suit : 2;
    unsigned int face_value : 4;
};
```


#### Notes:
* structs are not pointers, when it is reassinged to another variable, A NEW COPY IS MADE
