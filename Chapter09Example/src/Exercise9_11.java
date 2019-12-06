
public class Exercise9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2)
		{
			System.out.println("시작과 끝 단 2개의 정수를 입력해주세요");
			System.out.println("Usage: 구구단 Test 3 5");
			System.exit(0);
		}
		
		int from = Integer.parseInt(args[0]);
		int to = Integer.parseInt(args[1]); 
		
		if(!(2 <= from && from <= 9 && 2<= to && to <=9))
		{
			System.out.println("단의 범위는 2와 9 사이여야 합니다.");
			System.out.println("Usage: 구구단 Test 3 5");
			System.exit(0);
		}
		
		for(int i = from; i<= to; i++)
		{
			for(int j =2; j<10; j++)
			{
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
			System.out.println();
		}
	}

}
