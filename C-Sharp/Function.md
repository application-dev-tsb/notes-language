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
##### Overriding with "override" Keyword
The runtime type takes over
```c#
class BaseClass
{
  public virtual void MethodA()
  {
    Console.WriteLine("BC: A");
  }
}

class DerivedClass : BaseClass
{
  public override void MethodA()
  {
    Console.WriteLine("DC: A");
  }
}

BaseClass bc = new BaseClass();
DerivedClass dc = new DerivedClass();
BaseClass bcdc = new DerivedClass();

bc.MethodA(); //BC: A
dc.MethodA(); //DC: A
bcdc.MethodA(); //DC: A
```

##### Overriding with "new" Keyword
The declared type gets to run, ignoring the derived class implementation
```c#
public new void MethodA()

bc.MethodA(); //BC: A
dc.MethodA(); //DC: A
bcdc.MethodA(); //DC: A
```


#### Resources:
[MSDN: Method Override](https://msdn.microsoft.com/en-us/library/ms173153.aspx)
