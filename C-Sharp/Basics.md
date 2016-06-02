# C# Basics

## Hello World
```c#
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Basics
{
    class Program
    {
        static void Main(string[] args)
        {
            string world = "World";
            Console.WriteLine("Hello {0}", world);
            Console.ReadLine();
        }
    }
}

```

## Variable
```c#
int x = 1;
int y = 2;
int sum = x + y;
```

## Type Inference
```c#
var world = "World"; //this is a "string"
```

## Single-Line Comment
```c#
//this is a single-line comment
```

## Multi-Line Comment
```c#
   /**
    * this is a 
    * multiline comment
    */
```

## Type Resolution
```c#
// Assume that Car inherits from Vehicle
Car car = new Car();
Vehicle vehicle = new Vehicle();
Vehicle carVehicle = new Car();

//is => "is a" or inherited from
//evaluates the runtime type
Console.WriteLine("car is Car:{0}", car is Car); //True
Console.WriteLine("car is Vehicle:{0}", car is Vehicle); //True
Console.WriteLine("vehicle is Car:{0}", vehicle is Car); //False
Console.WriteLine("vehicle is Vehicle:{0}", vehicle is Vehicle); //True
Console.WriteLine("carVehicle is Vehicle:{0}", carVehicle is Vehicle); //True
Console.WriteLine("carVehicle is Car:{0}", carVehicle is Car); //True
```
