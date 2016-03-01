package pragmatic.homework.Exceptions;

public class StudentFile {

	private int age;
	private String firstName;
	private String lastName;
	private String maleFemale;
	private boolean isMale;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws CustomException {
		this.age = age;
		if (age < 7 || age > 18) {
			throw new CustomException("Kid cannot be younger than 7 or older than 18");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws CustomException {
		this.firstName = firstName;
		if (this.firstName.length() >= 12 || this.firstName.length() <= 1) {
			throw new CustomException("First name cannot be longer than 12 Symbols or shorter than 1 !!");
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws CustomException {
		this.lastName = lastName;
		if (this.lastName.length() >= 20 || this.lastName.length() <= 1) {
			throw new CustomException("Last name cannot be longer than 20 Symbols or shorter than 1 !!");

		}
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
