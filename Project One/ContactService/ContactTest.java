package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.snhu.Contact;

class ContactTest {

	// Tests the instantiation of a new Contact Object
	@DisplayName("New Contact Test")
	@Test
	void testContact() {
		Contact contactClass = new Contact("12345", "John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		assertTrue(contactClass.getContactId().equals("12345"));
		assertTrue(contactClass.getFirstName().equals("John"));
		assertTrue(contactClass.getLastName().equals("Doe"));
		assertTrue(contactClass.getPhoneNumber().equals("0123456789"));
		assertTrue(contactClass.getAddress().equals("1600 Pennsylvania Avenue NW"));
	}

	// Tests if the length validation warning triggers when passing in a contactId
	// String exceeding 10 characters
	@DisplayName("Contact ID Length Validation")
	@Test
	void testContactIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("01234567890", "John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the length validation warning triggers when passing in a firstName
	// String exceeding 10 characters
	@DisplayName("First Name Length Validation")
	@Test
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John1234567", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the length validation warning triggers when passing in a lastName
	// String exceeding 10 characters
	@DisplayName("Last Name Length Validation")
	@Test
	void testLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe12345678", "01234567890", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the length validation warning triggers when passing in a phoneNumber
	// String that is not equal to 10 characters
	@DisplayName("PhoneNumber Length Validation")
	@Test
	void testPhoneNumberLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "01234567", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the length validation warning triggers when passing in a address
	// String exceeding 30 characters
	@DisplayName("Address Length Validation")
	@Test
	void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW, 12345678901234567890");
		});
	}

	// Tests if the null validation warning triggers when passing in a null value
	// for the contactId String
	@DisplayName("Contact ID Null Validation")
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the null validation warning triggers when passing in a null value
	// for the firstName String
	@DisplayName("First Name Null Validation")
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the null validation warning triggers when passing in a null value
	// for the lastName String
	@DisplayName("Last Name Null Validation")
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", null, "0123456789", "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the null validation warning triggers when passing in a null value
	// for the phoneNumber String
	@DisplayName("Phone Number Null Validation")
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", null, "1600 Pennsylvania Avenue NW");
		});
	}

	// Tests if the null validation warning triggers when passing in a null value
	// for the address String
	@DisplayName("Address Null Validation")
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "John", "Doe", "0123456789", null);
		});
	}

}
