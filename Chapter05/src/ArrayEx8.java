import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ball = new int[45];
		
		for(int i = 0; i< ball.length; i++)
			ball[i] = i+1;
		int temp = 0;
		int j = 0;
		System.out.println(Arrays.toString(ball));
		
		for(int i =0; i < 6; i++)
		{
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0; i< 6; i++)
			System.out.printf("ball[%d]=%d%n",i,ball[i]);

		System.out.println(Arrays.toString(ball));
	}

}
