
public class Product {
	int price; // ��ǰ�� ����
	int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
	
	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
}
