import java.util.Scanner;

public class Chapter4Test {

	public static void main(String[] args) {
		
		Test15();

	}
	
	static void Test15()
	{
		int number = 12323;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0)
		{				 
			 result = result*10 + tmp%10;			 
			 tmp/=10;
		}
		
		System.out.printf("number: %d, result: %d 회문수: %b",number, result,number == result);
		System.out.println();
	}
	
	static void Test14()
	{
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new Scanner(System.in);
		
		do
		{
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = s.nextInt();
			
			if(input == answer)
			{
				System.out.printf("정답입니다. %n시도횟수는 %d번입니다.",answer);
				break;
				
			}
			else if(answer < input)
				System.out.println("작습니다.");
			else
				System.out.println("큽니다.");			
		}while(true);
		
	}
	
	static void Test13()
	{
		String value = "12230p34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i< value.length(); i++)
		{
			ch = value.charAt(i);
			
			if(!('0' <= ch && ch<='9'))
			{
				isNumber = false;
				break;
			}
			
		}
		
		System.out.println(isNumber);
	}
	
	static void Test12()
	{		
		int cnt = 0;
		for(int i = 2; i < 10; i++)
		{
			for(int j = 1; j<4; j++)
			{
				System.out.printf("%d * %d = %d \t", i,j,i*j);
			}
			cnt++;
			if(cnt%3 == 0)
				System.out.println();
		}
	}
	
	static void Test11()
	{
		
		int num1 = 1 , num2 = 1;
		int num3 = 0;
		System.out.printf("%d,%d",num1, num2);
				
		for(int i = 0; i< 8; i++)
		{
			num3 = num1 + num2;			
			System.out.printf(",%d", num3);
			num1 = num2;
			num2 = num3;
			
		}
		
	}
		
	static void Test10()
	{
		int num = 12345;
		int sum = 0;
		
		while(num > 0)
		{
			sum += num % 10;
			num /=10;
		}
		System.out.println(sum);
	}
	
	static void Test9()
	{
		String str = "12345";
		int sum = 0;
		
		for(int i =0; i<str.length(); i++)
		{
			sum += str.charAt(i)-'0';
			System.out.println(sum);
		}
//		System.out.println(sum);
	}
	
	static void Test8()
	{
		
		for(int x = 0; x<=10; x++)
		{
			for(int y = 0; y<=10; y++)
			{
				if(2*x+4*y == 10)
				{
					System.out.printf("x= %d, y= %d %n",x,y);
				}
			}
		}
	}
	
	static void Test7()
	{
		int value = (int)( Math.random()* 6 + 1);
		System.out.println("value: "+value);
	}
	
	static void Test6()
	{
		for(int i = 1; i<=6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				if(i+j == 6)
					System.out.printf(" %d, %d %n",i ,j);
			}
		}
	}
	
	static void Test1()
	{
		int x ;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if(10< x && x < 20)
		{
			
		}
		
		char ch1;
		ch1 = scanner.next().charAt(0);
		if(ch1 == ' ' || ch1 == '\t')
		{
			
		}
		
		char ch2 = 'z';
		if(ch2 == 'z' || ch2 == 'Z')
		{
			
		}
		
		char ch3 = '0';
		if('0' <= ch3 && ch3<= '9')
		{
			
		}
		
		
	}

	
	static void Test2()
	{
		int result =0;
		for(int i = 1; i<=20; i++)
		{
			if(i%2!=0 && i%3 != 0)
				result+=i;
		}
		System.out.println(result);
	}
	
	static void Test3()
	{
		int result = 0;
		for(int i = 1; i<=10; i++)
		{
			for(int j = i; j>0; j--)
				{
					result += j;
					System.out.print(j+ "+");
				}
			System.out.println(
					);
		}
		
		System.out.println(result);
	}
	
	static void Test4()
	{
		int i = 0;
		int result = 0;
		
		while(result < 100)
		{
			i++;
			if(i %2 == 0)
				result -= i;
			else
				result += i;
			
					
		}
		
		System.out.println(i);
	}
	
	static void Test5()	
	{
		int i  = 0;
		while(i<=10)
		{
			int j=0;
			while (j<=i)
			{
				System.out.print("*");
				j++;
			}
			
			i++;
			System.out.println();
		}
	}

}













