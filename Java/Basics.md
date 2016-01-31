
Compiling and running a simple java program:
```java
//Test1\test1\MyClass1.java
package test1;

public class MyClass1 {
	
	public void test1() {
		System.out.println("Test 1");
	}
}

//Test2\test2\MyClass2.java
package test2;

import test1.MyClass1;

public class MyClass2 {
	
	public static void main(String... args) {
		MyClass1 c1 = new MyClass1();
		c1.test1();
		System.out.println("Exe 2");
	}
}
```


```cmd
javac Test1\test1\MyClass1.java
javac Test2\test2\MyClass2.java -cp C:\Users\secre\Desktop\Test1
java -classpath C:\Users\secre\Desktop\Test1;C:\Users\secre\Desktop\Test2 test2.MyClass2 
```
