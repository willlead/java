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

		// ���ε� �ϳ��� �������̴�.
		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
