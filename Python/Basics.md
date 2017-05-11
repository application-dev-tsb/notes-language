# Python: Basics

## Hello World
```python
print 'Hello World'
```

## Comments
```python
# this is a comments
```

## Console Read/Write
```
user_input = input("Please Enter Something:")
print "You Have Entered:", user_input
```

## Variable Declaration
```python
x = 1
y = 0.1
z = 'A Text'
```
## Modules (Package)
Python file names are the module names

## Import Modules (Libraries)
```python
# import the entire module
import modulename
modulename.method1(xx)

# import specific methods to use them directly without
# refering to the module
from modulename import method1, method2
method2(xx)

# frowned upon by most developers
# conflict-prone
from filename import *
method2(xx)
method1(xx)
```
