
public class Exercise8_9 {

	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.",100);
	}

}

class UnsupportedFunctionException extends RuntimeException
{
	final private int ERROR_CODE;
	final private String msg;
	public UnsupportedFunctionException(String msg, int errCode) {
		super(msg);
		ERROR_CODE = errCode;
		this.msg = msg;
	}
	
	public int getErrorCode()
	{
		return ERROR_CODE;
	}	
	
	public String getMessage() {
		// TODO Auto-generated method stub
		//System.out.print("["+errCode+"]");
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}
