

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product�迭 cart�� ���� index
	
	void buy(Product p) {
		/*
			(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
			1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
			1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		*/
		
		if(money < p.price)
		{
			System.out.println("���� �����մϴ�.");
		}
		else			
		{
			money -= p.price;			
			add(p);
		}
			
		
	}
	
	void add(Product p) {
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
			1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�.
			1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�.
			1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
			1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
		*/
		
		if(i >= cart.length)
		{
			Product[] cart = new Product[this.cart.length*2];
			for(int i = 0; i< this.cart.length; i++)
				cart[i] = this.cart[i];
			this.cart = cart;
		}		
		this.cart[i] = p;
		i++;		
		
	} // add(Product p)
	
	void summary() {
		/*
			(3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
			1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
			1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		*/
		int total =0;
		for(int i = 0; i< cart.length; i++)
		{
			if(cart[i] != null)
			{
				System.out.print(""+cart[i]+",");
				total += cart[i].price;				
			}
			else
				break;						
		}	
		System.out.println();
		System.out.println("����� �ݾ�: "+total);
		System.out.println("���� �ݾ�: "+ money);
		System.out.println(this.cart.length);
		
		
	} // summary()
}
