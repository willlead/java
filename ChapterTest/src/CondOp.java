
public class CondOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =50, num2 = 100;
		int big, diff;
		
		big  = (num1>num2)?num1:num2;
		System.out.println(big);
		
		//diff = num1>num2 ? num1-num2 : num2 - num1;
		if(num1>num2)
			diff = num1 - num2;
		else
			diff = num2 - num1;
		
		System.out.println(diff);
	}
}
