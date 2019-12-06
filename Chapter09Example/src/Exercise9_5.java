
public class Exercise9_5 {
	public static int count(String src, String target) {
		int count = 0; // ã�� Ƚ��
		int pos = 0; // ã�� ������ ��ġ
		
		/*
			(1) �ݺ����� ����ؼ� �Ʒ��� ������ �ݺ��Ѵ�.
			1. src���� target�� pos�� ��ġ���� ã�´�.
			2. ã���� count�� ���� 1 ���� ��Ű��,
			pos�� ���� target.length��ŭ ������Ų��.
			3. indexOf�� ����� -1�̸� �ݺ����� ���������� count�� ��ȯ�Ѵ�.
		*/
		
		while (true) 
		{
			pos = src.indexOf(target,pos);
			if(pos != -1)
				count++;
			else
				break;
			pos += target.length();					
		} 
		return count;		
	}
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
}
