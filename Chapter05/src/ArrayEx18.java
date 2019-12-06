import java.util.Arrays;

public class ArrayEx18 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] arr1 ,arr2;
		
		arr1 = new int[][] 
				{
			{10,20,30,40},
			{50,60,70,80},
			{90,10,20,30}};
			
			arr2 = new int[][] 
					{
				{10,20,30,40},
				{50,60,70,80},
				{90,10,20,30}};
			
		for(int i=0; i<arr1.length; i++)
		{
			for(int j =0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+" ,");				
			}
			System.out.println();
		}
			
		for(int[] array : arr2)
		{
			for(int num: array)
			{
				System.out.print(num+", ");				
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr1));
	}
	
}


