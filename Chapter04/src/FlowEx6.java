import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("����ΰ���?> ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month)
		{
		
		case 3: case 4: case 5: 
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default :
			System.out.println("�ܿ�");
			System.out.printf("%d", month);
		}
		

		scanner.close();
	}

}
