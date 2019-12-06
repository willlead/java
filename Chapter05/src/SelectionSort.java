import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,5,4};
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i< arr.length -1; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}

}
