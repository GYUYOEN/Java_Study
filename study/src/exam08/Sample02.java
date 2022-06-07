package exam08;

public class Sample02 {
	public static void main(String[] args) {
			throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}

}

class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String s, int num) {
		super(s);
		ERR_CODE = num;
	}
	
	UnsupportedFuctionException(String s) {
		this(s, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}
