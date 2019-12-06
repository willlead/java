
public class AppleBuyer {
	
	private  int numOfApple = 0;
	int myMoney = 10000;	
	
	public void setNumOfApple(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
	@Override
	public String toString() {
		return "AppleBuyer [numOfApple=" + numOfApple + ", myMoney=" + myMoney + "]";
	}
	
	
	
	
}
