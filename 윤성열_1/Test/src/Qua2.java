class Qua2 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		
		// ��� ����� ��µ� �ʿ��� �ٱ����� ��
		int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket==0?0:1); 
		
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
	}
}