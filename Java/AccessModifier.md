# Access Modifier

## Public

## Protected
```java
package com.demo.access.pack1;

public class BaseClass {

	protected String val = "val-base";
	
	protected String protectedMethod() {
		return "method-base";
	}
}

package com.demo.access.pack2;

import com.demo.access.pack1.BaseClass;

public class DerivedClass extends BaseClass {

	public void accessProtectedMembers() {
		//THIS IS OK
		this.val = "";
		this.accessProtectedMembers();
		
		//THIS WONT WORK
		//BaseClass bs = new BaseClass();
		//bs.val;
		//bs.accessProtectedMembers();
		
		//THIS WILL ALSO WORK
		DerivedClass dc = new DerivedClass();
		dc.val = "dasdsa";
		dc.accessProtectedMembers();
	}
}

```

## Default

## Private
