
public class Exercise8_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(6);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(7);
		}

	}
	
	static void method1() throws Exception
	{
		try {
			method2();
			System.out.println(1);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(2);
			throw e;
		} catch (Exception e) {
			System.out.println(3);
			// TODO: handle exception
		}finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
	
	static void method2()
	{
		throw new NullPointerException();
	}

}
