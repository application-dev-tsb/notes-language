# Enumerations
```c
enum colors {RED, GREEN, BLUE};

void do_something(enum colors color) {
	switch (color) {
		case RED:
			printf("Red!!!\n");
			break;
		case GREEN:
			printf("Green!!!\n");
			break;
		case BLUE:
			printf("Blue!!!\n");
			break;
	}
}

int main() {
	enum colors color = BLUE;
	do_something(color);
 	return 0;
}
```
