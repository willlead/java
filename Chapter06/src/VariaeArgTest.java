
public class VariaeArgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4,5));
		System.out.println(add(1,2,3,4,5,6,7,8,9,10));
	}
	
	static int add(int... arr) {
		int sum =0;
		
		/*
		 * for(int num: arr) sum+= num;
		 */
		
		for(int i = 0; i<arr.length; i++)
			sum+= arr[i];
		
		return sum;
	}
}
