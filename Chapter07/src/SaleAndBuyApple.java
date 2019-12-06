
public class SaleAndBuyApple {

	public static void main(String[] args) {
		
		AppleSeller seller = new  AppleSeller();
		AppleBuyer buyer = new AppleBuyer();
		
		buyer.myMoney -= 3000;
		int money = 3000;
		int apple = seller.saleApple(money);
		buyer.setNumOfApple(apple);
		
		System.out.println(seller);
		System.out.println(buyer);
		
		

	}

}
