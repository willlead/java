
public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass tc = new TestClass();
		tc.test();
	}

}

class TestClass
{
	int num = 0;
	
	void test()
	{
		int num = 10;
		num++;
		System.out.println(num);
	}
}
