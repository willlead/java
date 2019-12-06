
public class LogicOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		
		boolean result1 = (num1 == 10) && (num2 ==20);
		boolean result2 = (num1 <=12 ) || (num2 >=30);
		
		System.out.println("num1 ==10 그리고 num2 ==20 " + result1);
		System.out.println("num1 <=12 또는 num2 >=30 " + result2);
		
		if(!(num1== num2))
			System.out.println("num1고 num2 는 같지 않다.");
		else
			System.out.println("num1고 num2 는 같다.");
	}

}
