package Entity;


public class Player extends User {
	
	private String firstName;
	private String lastName;
	private String identityNumber;
	private int birthYear;
	
	
	public Player(int id, String firstName, String lastName, String identityNumber, int birthYear) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setBirthDate(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}
