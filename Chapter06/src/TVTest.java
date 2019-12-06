class Tv
{
	String color;
	boolean power;
	int channel;
	
	Tv(){
		
	}
	
	void Power() {power = !power;}
	void ChannelUp() {++channel;}
	void ChannelDown() {--channel;}
	
	
}

public class TVTest {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel  = 7;
		t.ChannelDown();
		System.out.print(t.channel);

	}

}
