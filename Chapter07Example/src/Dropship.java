
public class Dropship extends Unit{

	public Dropship(int x, int y) {
		super(x, y);
	}
	
	@Override
	void move() {
		System.out.println("����� �̵�");
	}
	
	@Override
	void stop() {
		System.out.println("����� ����");
	}
	
	void load() {System.out.println("���� �¿�");}
	void unload() {System.out.println("���� ����");}
}
