package Utils;

public class ErrorResult implements Result{

	private final boolean success;
	private String message;
	
	
	
	public ErrorResult() {
		this.success = false;
	}
	
	public ErrorResult(String message) {
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
