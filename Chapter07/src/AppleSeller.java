
public class AppleSeller {
	
	final int APPLE_PRICE = 1000;
	private int numOfApple = 100;
	private int myMoney = 0;
	
	public int saleApple(int money)	
	{
		int apple = money/APPLE_PRICE;
		numOfApple -= apple;
		myMoney += money;
		return apple;
	}

	@Override
	public String toString() {
		return "AppleSeller [numOfApple=" + numOfApple + ", myMoney=" + myMoney + "]";
	}
	

}
