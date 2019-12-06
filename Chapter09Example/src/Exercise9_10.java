
public class Exercise9_10 {
	
	static String format(String str, int length, int alignment)
	{
		//(1) format�޼��带 �ۼ��Ͻÿ�.
		//1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
		if(length < str.length())
			return str.substring(0, length);
	
		//2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.		
		char[] source = str.toCharArray();
		char[] result = new char[length];
		
		for(int i =0; i< result.length; i++)
		{
			result[i] = ' ';
		}
		
		//3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
		//(System.arraycopy()���)
		switch(alignment)
		{
		case 0:
			System.arraycopy(source, 0, result, 0, source.length);
			break;
		case 1:
			System.arraycopy(source, 0, result, 
					(result.length - source.length)/2, source.length);
			break;
		case 2:
			System.arraycopy(source, 0, result, 
					result.length - source.length, source.length);
			break;		
		}
		//4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
		return new String(result);
	
		
	}
	
	
	
	public static void main(String[] args) {
		String str = "������";
		
		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}
}
