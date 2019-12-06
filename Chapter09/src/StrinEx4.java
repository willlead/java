import java.util.StringJoiner;

public class StrinEx4 {
	
	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		for(int i =0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String join = String.join(",", arr);
		System.out.println(join);
		
		StringJoiner sj = new StringJoiner("/","[","]");
		
		System.out.println(sj);
		for(String s : arr)
		{
			sj.add(s);
			System.out.println(sj);
		}
		
		
	}
}
