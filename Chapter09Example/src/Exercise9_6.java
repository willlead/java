import java.util.Arrays;

public class Exercise9_6 {
	public static String fillZero(String src, int length) {
		// (1) fillZero�޼��带 �ۼ��Ͻÿ�.
		//1. src�� ���̰ų� src.length()�� length�� ������ src�� �״�� ��ȯ�Ѵ�.
		if(src == null || src.length() == length)
			return src;				
		//2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�.
		else if(length <= 0)
			return "";
		//3. src�� ���̰� length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�.
		else if(src.length() > length)
			return src.substring(0, length);
		//4. ���̰� length�� char�迭�� �����Ѵ�.
		char[] chArr = new char[length];
		//5. 4���� ������ char�迭�� '0'���� ä���.
		for(int i = 0; i< chArr.length; i++)
			chArr[i] = '0';				
		//6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
		System.arraycopy(src.toCharArray(), 0, chArr, 
				chArr.length - src.length(), src.length());
		//7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		return new String(chArr);
		
		
	}
	
	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
}
