import java.awt.Toolkit;

public class TookitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit tool = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					tool.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();

		// 메인도 하나의 스레드이다.
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
