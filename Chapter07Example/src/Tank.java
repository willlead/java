
public class Tank extends Unit{
	public Tank(int x, int y) {
		super(x, y);
	}
	
	@Override
	void move() {
		System.out.println("��ũ �̵�");
	}
	
	@Override
	void stop() {
		System.out.println("��ũ ����");
	}
	
	void changemode()
	{
		System.out.println("����/ �̵� ��� ����");
	}
}
