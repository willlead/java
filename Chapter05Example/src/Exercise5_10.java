
public class Exercise5_10 {

	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/
			if('a' <= ch && ch<= 'z')
			{
				int index = ch-'a';
				result  +=  abcCode[index];
			}			
			else if( '0' <= ch && ch <= '9')
			{
				int index = ch-'0';
				result  +=  numCode[index];
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		
		String decode ="";
		for(int i=0; i < result.length();i++) {
			char ch = result.charAt(i);
			/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/			
			for(int m=0; m<abcCode.length; m++)
				if(ch == abcCode[m])
					decode += (char)('a'+m);
			
			for(int n =0; n<numCode.length; n++)
				if(ch == numCode[n])
					decode += (char)('0'+n);			
		}
		System.out.println("decode: "+decode);
	}

}
