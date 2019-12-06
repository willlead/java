
public class NewExceptionTest {

	public static void main(String[] args) {
		try {
			startInstalll();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("�����޽���: "+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}catch (MemoryException me) {
			System.out.println("�����޽���: "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �����ϼ���.");
		}finally {
			deleteTempFiles();
			
		}
	}
	
	static void startInstalll() throws SpaceException, MemoryException
	{
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles()	{	}
	static void deleteTempFiles() {}
	static boolean enoughSpace()
	{
		return false;
	}
	
	static boolean enoughMemory()
	{
		return true;
	}

}

class SpaceException extends Exception
{
	
	public SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception
{
	public MemoryException(String msg) {
		super(msg);
	}
}
