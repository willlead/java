package shape;

public class Circle {
	int rad;

	public Circle(int rad) {
		super();
		this.rad = rad;
	}
	
	public double Area()
	{
		return rad * rad * Math.PI;
	}
}
