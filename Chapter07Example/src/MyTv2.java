
public class MyTv2 {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	/*(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.*/
	
	public void gotoPrevChannel()
	{
		int tmp; 
		tmp = channel;
		channel = prevChannel;
		prevChannel = tmp;
	}
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
}