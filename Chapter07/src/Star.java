class Unit
{
	int x, y;
	void move(int x, int y)
	{
		System.out.println(getClass().getName()+" "+x+","+y+"�� �̵�");
	}
	void stop() {System.out.println("����");}
	
}

class Dropship extends Unit
{
	void load() {System.out.println("�¿�ϴ�.");	}
	void unload() {System.out.println("�����ϴ�.");	}
}

class Tank extends Unit
{
	void chageMode(){System.out.println("����/�̵� ���� ����");	}
}

class Marine extends Unit
{
	@Override
	void move(int x, int y) {
		
		
	}
	
	void stimPack() {System.out.println("������ �����ϴ�.");}
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
