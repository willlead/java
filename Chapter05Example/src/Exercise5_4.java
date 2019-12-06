class Exercise5_4
{
	public static void main(String[] args)
	{
		int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		int cnt = 0;
		
		 for(int[] a: arr) 
		 { 
			 for(int n: a) 
			 { 
				 total+=n; 
			 }
			 cnt += a.length; 
		 }
		
		
		/*
		 * for(int i = 0; i< arr.length; i++) { for(int j = 0; j<arr[i].length; j++) {
		 * total += arr[i][j]; //cnt++; } cnt+=arr[i].length; }
		 */
		average = (float)total/cnt;
		
		System.out.println("total="+total);
		System.out.println("average="+average);
	} // end of main
} // end of class