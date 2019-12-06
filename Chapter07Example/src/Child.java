
public class Child extends Parent {
	int x = 3000;
	
	public Child() {		
		this(1000);
		//System.out.println("Child()");
	}
	
	 Child(int x)
	 {
		 //System.out.println("Child(int x)");
		 this.x = x;
	 }
	
	void method() {
		System.out.println("Child Method");
	}
}
