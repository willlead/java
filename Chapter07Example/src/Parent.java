
public class Parent {
	int x = 100;
	
	public Parent() {
		this(200);
		//System.out.println("Parent()");
	}
	
	Parent(int x)
	{
		this.x = x;
		//System.out.println("Parent(int x)");
	}
	
	int getX()
	{
		return x;
	}
	
	void method() {
		System.out.println("Parent Method");
	}
}
