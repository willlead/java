
public class Exercise7_23 {
	
		static double sumArea(Shape[] arr)
		{
			double total = 0; 
			for(int i = 0; i< arr.length; i++)
			{
				total += arr[i].calcArea();
			}
			return total;
		}
	
		
		public static void main(String[] args)
		{
			Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
			System.out.println("������ ��:"+sumArea(arr));
		}
	

}
