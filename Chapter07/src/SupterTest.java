
public class SupterTest {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Child c = new Child(20); c.method();
		 */
		Point3D p3 = new Point3D();
		System.out.println("p3.x= "+p3.x);
		System.out.println("p3.y= "+p3.y);
		System.out.println("p3.z= "+p3.z);
	}

}

class Point3D extends Point
{
	int z = 30;
	public Point3D() {
		this(100, 200, 300);
	}
	
	public Point3D(int x, int y, int z) 
	{
		super(x,y);
		this.z= z;		
	}
}

class Point
{
	int x = 10;
	int y = 20;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
	

class Parent{
	int x = 10;	
	
	
	public Parent(int x) {
		this.x = x;
	}
}



class Child extends Parent
{	
	int x;
	
	public Child(int x) {
		super(x);
		this.x = x;
	}
	
	void method()
	{
		System.out.println(x);
	}
}