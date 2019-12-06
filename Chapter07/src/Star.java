class Unit
{
	int x, y;
	void move(int x, int y)
	{
		System.out.println(getClass().getName()+" "+x+","+y+"로 이동");
	}
	void stop() {System.out.println("정지");}
	
}

class Dropship extends Unit
{
	void load() {System.out.println("태웁니다.");	}
	void unload() {System.out.println("내립니다.");	}
}

class Tank extends Unit
{
	void chageMode(){System.out.println("시즈/이동 모드로 변경");	}
}

class Marine extends Unit
{
	@Override
	void move(int x, int y) {
		
		
	}
	
	void stimPack() {System.out.println("정신이 나갑니다.");}
}



public class Star {

	public static void main(String[] args) {
		Marine marine = new Marine();
		//System.out.println(marine.getClass());
		marine.move(10, 20);
		marine.stop();
		marine.stimPack();
		
		Tank tank = new Tank();		
		tank.move(20, 20);
		tank.stop();
		tank.chageMode();
		
		Dropship dropship = new Dropship();
		dropship.move(30, 30);
		dropship.stop();
		dropship.load();
		dropship.unload();
		
	}

}
