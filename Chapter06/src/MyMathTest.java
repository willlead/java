
public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath mm = new MyMath();
		
		System.out.printf("add(%d,%d) = %d", 1L,2L, mm.Add(1L, 2L));

		
	}

}


class MyMath
{
	long Add(long a, long b) { return a+b; }
	long Sub(long a, long b) {return a-b;}
}
