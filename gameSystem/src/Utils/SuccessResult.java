package Utils;

public class SuccessResult implements Result {
	
	private boolean success;
	private String message;
	
	
	
	public SuccessResult() {
		this.success = true;
	}
	
	public SuccessResult(String message) {
		this();
		this.message = message;
	}

	@Override
	public boolean isSuccess() {
		return success;
	}

	@Override
	public String message() {
		return message;
	}

}
