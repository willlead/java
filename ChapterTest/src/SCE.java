
public class SCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0;
			
		boolean result1;
		
		result1 = (num1 +=10) < 0 && (num2 +=10)>0; 
		System.out.println("result=" + result1);
		System.out.println("num1="+num1+", num2="+num2);
		
		result1 = (num1 +=10) > 0 || (num2 +=10)>0; 
		System.out.println("result=" + result1);
		System.out.println("num1="+num1+", num2="+num2);
	}

}
