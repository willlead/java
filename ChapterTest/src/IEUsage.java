
public class IEUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		if(num >0)
			System.out.println("num은 0보다 크다.");
		
		if((num%2) == 0)
			System.out.println("num은 짝수");
		else
			System.out.println("num은 홀수");
		
		int num1 = 70;
		if(num1 < 0)
			System.out.println("num1은 0미만");
		else if(num1 < 100)
			System.out.println("num1은 0이상 100미만");
		else
			System.out.println("num1은 100이상");
		
	}

}
