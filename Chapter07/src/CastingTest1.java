
public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 10;
//		long l = 100;
//		l = x;
//		x = (int)l;
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine) car;
		fe2.water();
		
		
	}

}

