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
