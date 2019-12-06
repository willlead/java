
public class Test {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.length());
		
		
		int i = "aaa".compareTo("aaa");
		System.out.println(i); //0이 나오면 같다.
		
		// == i랑 i2는 같은 형태로 보는거야 다만 String 을 하나 int i 변수를 하나 추가해서 비교값을 저장해서 출력하느냐 차이라고  
		
		String i2 = "aaa";
		System.out.println(i2.compareTo("aaa")); //0이 나오면 같다.

		
		//두개가 같은거야 
		

	}

}
