import shape.Circle;
import shape.Rectang;

public class ShapeTest {

	public static void main(String[] args) {
		Rectang rec = new Rectang(10,20);
		Circle cir = new Circle(10);
		
		System.out.println(rec.Area());
		System.out.println(cir.Area());

	}

}
