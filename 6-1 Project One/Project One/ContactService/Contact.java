package edu.snhu;

public class Contact {
	// Declares the various attributes for the contact class
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
		// Checks if the passed in contactId parameter is null or longer than 10
		// characters
		if (contactId == null || contactId.length() > 10) {
			// Throws an error and associates it with the contactId
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		// Checks if the passed in firstName parameter is null or longer than 10
		// characters
		if (firstName == null || firstName.length() > 10) {
			// Throws an error and associates it with the firstName
			throw new IllegalArgumentException("Invalid First Name");
		}
		// Checks if the passed in lastName parameter is null or longer than 10
		// characters
		if (lastName == null || lastName.length() > 10) {
			// Throws an error and associates it with the lastName
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// Checks if the passed in phoneNumber parameter is null or not equal to 10
		// characters
		if (phoneNumber == null || phoneNumber.length() != 10) {
			// Throws an error and associates it with the phoneNumber
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		// Checks if the passed in address parameter is null or longer than 30
		// characters
		if (address == null || address.length() > 30) {
			// Throws an error and associates it with the address
			throw new IllegalArgumentException("Invalid Address");
		}

		// Assigns all attributes with their respective parameter values
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getContactId() {
		// Returns the contactId attribute
		return contactId;
	}

	public void setFirstName(String name) {
		// Checks if the passed in firstName parameter is null or longer than 10
		// characters
		if (name == null || name.length() > 10) {
			// Throws an error and associates it with the firstName
			throw new IllegalArgumentException("Invalid First Name");
		}

		// Sets the firstName attribute to the passed in parameter value
		this.firstName = name;
	}

	public String getFirstName() {
		// Returns the firstName attribute
		return firstName;
	}

	public void setLastName(String name) {
		// Checks if the passed in lastName parameter is null or longer than 10
		// characters
		if (name == null || name.length() > 10) {
			// Throws an error and associates it with the lastName
			throw new IllegalArgumentException("Invalid Last Name");
		}

		// Sets the lastName attribute to the passed in parameter value
		this.lastName = name;
	}

	public String getLastName() {
		// Returns the lastName attribute
		return lastName;
	}

	public void setPhoneNumber(String number) {
		// Checks if the passed in phoneNumber parameter is null or not equal to 10
		// characters
		if (number == null || number.length() != 10) {
			// Throws an error and associates it with the phoneNumber
			throw new IllegalArgumentException("Invalid Phone Number");
		}

		// Sets the phoneNumber attribute to the passed in parameter value
		this.phoneNumber = number;
	}

	public String getPhoneNumber() {
		// Returns the phoneNumber attribute
		return phoneNumber;
	}

	public void setAddress(String address) {
		// Checks if the passed in address parameter is null or longer than 30
		// characters
		if (address == null || address.length() > 30) {
			// Throws an error and associates it with the address
			throw new IllegalArgumentException("Invalid Address");
		}

		// Sets the address attribute to the passed in parameter value
		this.address = address;
	}

	public String getAddress() {
		// Returns the address attribute
		return address;
	}
}
