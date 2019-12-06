
public class MethodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Adder(4,5);
		System.out.println("4와 의 합: " + result);
		System.out.println("3.5의 제곱: "+ Square(3.5));
		
		System.out.println("7".concat("7"));
		
	}
	
	public static int Adder (int num1, int num2)
	{
		int addResult = num1 + num2;
		return addResult;
	}

	public static double Square(double num)
	{
		return num*num;
	}
}
