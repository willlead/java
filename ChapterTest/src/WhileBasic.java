import java.util.Scanner;

public class WhileBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner kb = new Scanner(System.in);
		int con;
		/*
		 * do { System.out.println("I like Java "+num); num++;
		 * System.out.print("��� �ұ��?(��:1/�ƴϿ�:0)");; con = kb.nextInt(); }while(con!=0);
		 */
		
		for(int i=0; i<5; i++)
			System.out.println("I like Java "+i);
	}

}
