package Abstract;


import Utils.Result;

public interface IdentityValidationService {

	Result CheckIfRealPerson (String identityNumber, String firstName, String lastName, int birthYear);

}
