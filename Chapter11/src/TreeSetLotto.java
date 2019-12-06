import java.util.*;
public class TreeSetLotto {

	public static void main(String[] args) {
				
		Set set = new TreeSet();
		for(int j =0; j<6; j++)
		{
		for(int i=0; set.size()< 6; i++)
		{
			int num = (int)(Math.random()*45)+1;
			//System.out.print(num+",");
			set.add(num);
		}
		System.out.println();	
		System.out.println(set);
		set.clear();
		}

	}

}
