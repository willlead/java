
public class Exercise5_8 {

	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			/* (1) 알맞은 코드를 넣어 완성하시오. */
			//switch(answer[i])
			//{
			//case 1: counter[0]++; break;
			//case 2: counter[1]++; break;
			//case 3: counter[2]++; break;
			//case 4: counter[3]++; break;
			//}
			
			counter[answer[i]-1]++;
		}
		
		for(int i=0; i < counter.length;i++) {			
			System.out.print(counter[i]);
			for(int j =0; j<counter[i]; j++)				
				System.out.print("*");			
			System.out.println();			
		}
	}

}
