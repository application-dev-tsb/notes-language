# Lambda Expression

* Can be used in place of a functional interface
* an anonymous function/method

## Functional Interface
* an Interface with EXACTLY one abstract method
* use @FunctionalInterface annotation for good measures
```java
@FunctionalInterface //optional, but good practice
public interface MyFunctionalInterface {
	String convertMe(String myObject);
}
```

## Usage
```java
public class Main {

	public static void main(String[] args) {
		Main m = new  Main();
		
		//single line
		String prod = m.convertList("aaaaa", (String s) -> String.format("muhaha %s", s));
		System.out.println(prod);
		
		//multiline
		prod = m.convertList("aaaaa", (String s) -> {
			String pre = String.format("muhaha %s", s);
			return pre + " xxxxx";
		});
		System.out.println(prod);
	}
	
	public String convertList(String orig, MyFunctionalInterface myInterface) {
		return myInterface.convertMe(orig);
	}

}
```
