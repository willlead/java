
public class Exercise5_6 {

	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			int qty = money/coinUnit[i];
			System.out.printf("%d��: %d%n",coinUnit[i],qty);			
			money = money % coinUnit[i];
		}
	}

}
