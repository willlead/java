class Qua10
{
	public static void main(String[] args) throws Exception
	{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
}


class UnsupportedFuctionException extends Exception
{
	final private int ERROR_CODE;
	final private String msg;
	public UnsupportedFuctionException(String msg, int errCode) {
		super(msg);
		ERROR_CODE = errCode;
		this.msg = msg;
	}
	
	int getErrorCode()
	{
		return ERROR_CODE;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		//System.out.print("["+errCode+"]");
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}

