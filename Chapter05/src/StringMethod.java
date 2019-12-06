import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good Afternoon";
		
		System.out.println(str.charAt(5));
		System.out.println(str.length());
		System.out.println(str.substring(5,10));
		System.out.println(str.equals("Good Morning"));
		System.out.println(str.equals("Good Afternoon"));
		
		char[] strArray = str.toCharArray();
		System.out.println(Arrays.toString(strArray));
	}

}
