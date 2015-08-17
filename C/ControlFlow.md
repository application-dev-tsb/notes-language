# Control Flow

## If Else
```c
int main()
{
	char card_array[12] = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'K', 'Q', 'J'};
	int location = 9;
	int value;

	if (card_array[location] == 'A') {
		value = 1;
	} else if (card_array[location] == 'K') {
		value = 3;
	} else if (card_array[location] == 'Q') {
		value = 3;
	} else if (card_array[location] == 'J') {
		value = 3;
	} else {
		value = 2;
	}

	printf("value is %i\n", value);

	return 0;
}
```

# Switch
* useful for reusing similar codeblocks, due to the default fallthrough behaviour
```c
int main()
{
	char card_array[12] = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'K', 'Q', 'J'};
	int location = 9;
	int value;

	switch (card_array[location]) {
		case 'K':
		case 'Q':
		case 'J':
			value = 3;
			break;
		case 'A':
			value = 1;
			break;
		default:
			value = 2;
			break;
	}

	printf("value is %i\n", value);

	return 0;
}
```
