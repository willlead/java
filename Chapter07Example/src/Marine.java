
public class Marine extends Unit{

	public Marine(int x, int y) {
		super(x,y);
	}
	
	@Override
	void move() {
		System.out.println("���� �̵�");
	}
	
	@Override
	void stop() {
		System.out.println("���� ����");
	}
	
}
