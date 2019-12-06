
public class Rectangle extends Shape{

	double width;
	double height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if(width == height) 
			return true;
		return false;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}

}
