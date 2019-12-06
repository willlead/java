
public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();

	}
	

}

class ThreadEx1_1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i =0; i<1000; i++)
			System.out.print(getName());
	}
}

class ThreadEx1_2 implements Runnable
{
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i =0; i< 5; i++)
		System.out.println(
				Thread.currentThread().getName());
	
}
}