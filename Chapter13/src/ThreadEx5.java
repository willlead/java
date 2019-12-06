
public class ThreadEx5 {

	public static long starttTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		starttTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("-"));
		System.out.println("소요시간1:"+(System.currentTimeMillis()- ThreadEx5.starttTime));

	}

}

class ThreadEx5_1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0; i<300; i++)
			System.out.printf("%s",new String("|"));
		System.out.println("소요시간2:"+(System.currentTimeMillis()-ThreadEx5.starttTime));
	}
}
