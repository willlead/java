package study;

public class hunkyungStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result; 
		
		// add �޼��忡 �Ķ���� x�� 10, y�� 20�� �Ѱܼ� result�� ���� ��ȯ�Ѵ�.
		result = add(10,20); 
		
		System.out.println("result: "+result);

	}
	
	//result = add(10,20);
	static int add( int x, int y)
	{
		int ret;
		
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		ret = x + y; //x�� y�� ���� ���� ret�� �����Ѵ�. 
		
		System.out.println("ret: "+ret); // ret ���
		return ret; //ret �� ��ȯ�Ѵ�. 
	
	}
	
	static float add(float x, int y)
	{
		return x+y;
		
		
	}
	


	
        		

}


