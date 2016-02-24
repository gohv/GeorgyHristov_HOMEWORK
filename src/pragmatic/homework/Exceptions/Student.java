package pragmatic.homework.Exceptions;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private boolean exception = true;	
	private int age;
	private String firstName;
	private String lastName;
	private String maleFemale;
	private boolean isMale;
	private Scanner keyboard = new Scanner(System.in);

	// To be noted here that I studied hard to fix this.
	public void studentAge() throws CustomException {
		do {
			try {
				out.print("What is the age of the student: ");
				this.age = keyboard.nextInt();
				if (age < 7 || age > 18) {
					throw new CustomException("Kid cannot be younger than 7 or older than 18");
				}
				exception = false;
			} catch (InputMismatchException ime) {
				out.println("This needs to be a number");
				keyboard.nextLine();
			}

		} while (exception);
	}

	public void firstNameStudent() throws CustomException {

		out.print("What is the first name of the student: ");
		this.firstName = keyboard.next();
		if (this.firstName.length() >= 12) {
			throw new CustomException("First name cannot be longer than 12 Symbols!!");
		}

	}

	public void lastNameStudent() throws CustomException {

		out.print("What is the last name of the student: ");
		this.firstName = keyboard.next();
		if (this.firstName.length() >= 20) {
			throw new CustomException("Last name cannot be longer than 20 Symbols!!");
		}
	}
// I do not know how to catch an exception here.
	// The program just terminates if the input is not male or female
	public void sexOfStudent() {

		out.print("Is the student male or female?: ");
		this.maleFemale = keyboard.next();

		if (!maleFemale.equalsIgnoreCase("female")) {
			out.println("Sex was set to Female");
			this.isMale = false;
			exception = false;
		} else if (maleFemale.equalsIgnoreCase("male")) {
			out.println("Sex was set to Male");
			this.isMale = true;
		}

	}

	public void printInfo() {
		out.println(age + firstName + lastName);
		if (isMale) {
			out.println(firstName + " is Male ");
		} else {
			out.println(firstName + " is female ");
		}
	}

}
