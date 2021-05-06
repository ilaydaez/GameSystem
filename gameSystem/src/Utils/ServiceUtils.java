package Utils;

public class ServiceUtils {
	
	public static Result runChecks(Result... results) {
		for (Result result : results) {
			if(!result.isSuccess()) {
				return result;
			}
		}
		return new SuccessResult();
	}

}
