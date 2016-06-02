# Function
```c#
  static void Main(string[] args)
  {
    //executing a function
    executeSomething();
    Console.ReadLine();
  }

  //declaring a function
  static void executeSomething()
  {
    Console.WriteLine("Hello World");
  }
```

## Parameters

## Overloading

## Overriding
```c#
class BaseClass
{
  public virtual void MethodA()
  {
    Console.WriteLine("BC");
  }
}

class DerivedClass : BaseClass
{
  public <new or override> void MethodA()
  {
    Console.WriteLine("DC");
  }
}

BaseClass bc = new BaseClass();
DerivedClass dc = new DerivedClass();
BaseClass bcdc = new DerivedClass();
```
##### Overriding with "override" Keyword
The runtime type takes over
```c#
public override void MethodA()

bc.MethodA(); //BC
dc.MethodA(); //DC
bcdc.MethodA(); //DC
```

##### Overriding with "new" Keyword
The declared type gets to run, ignoring the derived class implementation
Methods from the Base class will not see the "new" method.
```c#
public new void MethodA()

bc.MethodA(); //BC
dc.MethodA(); //DC
bcdc.MethodA(); //BC
```


#### Resources:
[MSDN: Method Override](https://msdn.microsoft.com/en-us/library/ms173153.aspx)
