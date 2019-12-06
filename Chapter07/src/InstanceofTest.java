
public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		if(fe  instanceof FireEngine)
			System.out.println("This is fire");
		
		if(fe instanceof Car)
			System.out.println("This is Car");
		
		if(fe instanceof Object)
			System.out.println("This is Object");
		
		System.out.println(fe.getClass().getName());

	}

}


