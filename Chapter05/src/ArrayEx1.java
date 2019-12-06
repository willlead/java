import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args)
	{
		int[] num = {10, 20, 30,40,50};
		int[] tmp = new int[num.length*2];
		
		System.arraycopy(num, 0, tmp, 5, num.length);

		/*
		 * for(int i=0; i<num.length; i++) tmp[i] = num[i];
		 */		
		num = tmp;
		
		System.out.println(Arrays.toString(num));
		
	}
}
