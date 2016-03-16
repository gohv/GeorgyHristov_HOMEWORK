package pragmatic.javaIO.homework;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	private int accountNumber;
	private int id;
	private int phone;
	private String emailAddress;
	private String address;

	public Client(int accountNumber, int id, int phone, String email, String address) {
		super();
		this.accountNumber = accountNumber;
		this.id = id;
		this.phone = phone;
		this.emailAddress = email;
		this.address = address;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getId() {
		return id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Number " + accountNumber  + " / " + "ID: " + id;
	}
}
