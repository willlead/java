
public class Dropship extends Unit{

	public Dropship(int x, int y) {
		super(x, y);
	}
	
	@Override
	void move() {
		System.out.println("드랍쉽 이동");
	}
	
	@Override
	void stop() {
		System.out.println("드랍쉽 멈춤");
	}
	
	void load() {System.out.println("유닛 태움");}
	void unload() {System.out.println("유닛 내림");}
}
