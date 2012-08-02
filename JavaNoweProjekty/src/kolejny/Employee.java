package kolejny;

public abstract class Employee implements Payable{

	private String firstName;
	private String lastName;
	private String socialSecurityNum;

	public Employee(String first, String last, String sNumber) {
		firstName = first;
		lastName = last;
		socialSecurityNum = sNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNum() {
		return socialSecurityNum;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSocialSecurityNum(String socialSecurityNum) {
		this.socialSecurityNum = socialSecurityNum;
	}

	@Override
	public String toString() {
		return String.format("%s %s\n social security number : %s",
				getFirstName(), getLastName(), getSocialSecurityNum());
	}

	public abstract double earnings();

}
