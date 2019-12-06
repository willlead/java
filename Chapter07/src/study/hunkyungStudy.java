package study;

public class hunkyungStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result; 
		
		// add 메서드에 파라미터 x에 10, y에 20을 넘겨서 result에 값을 반환한다.
		result = add(10,20); 
		
		System.out.println("result: "+result);

	}
	
	//result = add(10,20);
	static int add( int x, int y)
	{
		int ret;
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		ret = x + y; //x와 y를 더한 값을 ret에 대입한다. 
		
		System.out.println("ret: "+ret); // ret 출력
		return ret; //ret 을 반환한다. 
	
	}
	
	static float add(float x, int y)
	{
		return x+y;
		
		
	}
	


	
        		

}


