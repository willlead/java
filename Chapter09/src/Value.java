
public class Value {
	int value;
	
	public Value(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value)
			return value == ((Value)obj).value;
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1 == v2");
		else
			System.out.println("v1 != v2");
		v2 = v1;
		
		if(v1.equals(v2))
			System.out.println("v1 == v2");
		else
			System.out.println("v1 != v2");
		

	}

}
