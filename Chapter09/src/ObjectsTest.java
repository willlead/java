import java.util.Objects;

public class ObjectsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ETest e1 = new ETest(1, 1.0);
		ETest e2 = new ETest(1, 2.0);
		
		//System.out.println(e1.equals(e2));
		System.out.println(Objects.deepEquals(e1, e2));
	}

}

class ETest
{
	int num1;
	double num2;
	
	public ETest(int num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}