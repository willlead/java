import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("input id & pwd");
			System.out.println("id:");
			String id = s.nextLine().trim();
			System.out.println("pwd:");
			String pwd = s.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("no id re input id");
				continue;
			} else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("no math pwd");
				}else {
					System.out.println("math id & pwd");
					break;
				}
			}
			
		}

	}

}
