import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 0; // �õ�Ƚ���� ���� ���� ����
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
				
			try {
				input = new Scanner(System.in).nextInt();	
			} catch (InputMismatchException e) {
				System.out.println("��ȿ���� �ʴ� ���Դϴ�. �ٽ� ���� �Է����ּ���");			
				continue;
			}
			
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break; // do-while���� �����
			}
		} while(true); // ���ѹݺ���
	}

}
