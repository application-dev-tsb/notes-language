#Operators

## Bitwise
```java
public class BinaryExperiment {
	
	public static void main(String[] args) {
		int NONE = 0;
		int MELEE = 1 << 1;
		int RANGE = 1 << 2;
		int MAGIC = 1 << 3;
		
		int magicAndRange = setFlag(MAGIC, RANGE);
		int magicAndMelee = setFlag(MAGIC, MELEE);
		int magicMeleeAndRange = setFlag(magicAndMelee, RANGE);
		
		System.out.println("isMagic:" + (hasFlag(magicAndRange, MAGIC)));
		System.out.println("isMelee:" + (hasFlag(magicAndRange, MELEE)));
		System.out.println("isMagic:" + (hasFlag(magicMeleeAndRange, MAGIC)));
		System.out.println("isMelee:" + (hasFlag(magicMeleeAndRange, MELEE)));
		System.out.println("isRange:" + (hasFlag(magicMeleeAndRange, RANGE)));
		System.out.println("isNone:" + (hasFlag(magicMeleeAndRange, NONE)));
	}
	
	static int setFlag(int flag1, int flag2) {
		return flag1 | flag2;
	}
	
	static boolean hasFlag(int flag1, int flag2) {
		return (flag1 & flag2) == flag2;
	}

}
```
