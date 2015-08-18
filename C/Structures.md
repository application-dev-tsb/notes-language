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
