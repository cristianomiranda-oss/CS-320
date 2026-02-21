package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.snhu.Contact;
import edu.snhu.ContactService;

class ContactServiceTest {

	// Tests the adding of a new contact
	@DisplayName("Adding New Contacts")
	@Test
	void testAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		Contact createdContact = contactService.getContact("0");

		assertTrue(createdContact.getContactId().equals("0"));
		assertTrue(createdContact.getFirstName().equals("John"));
		assertTrue(createdContact.getLastName().equals("Doe"));
		assertTrue(createdContact.getPhoneNumber().equals("0123456789"));
		assertTrue(createdContact.getAddress().equals("1600 Pennsylvania Avenue NW"));
	}

	// Tests the removing of a contact
	@DisplayName("Removing Contact")
	@Test
	void testRemoveContact() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		contactService.removeContact("0");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.getContact("0");
		});
	}

	// Tests the removing of a contact not present in the list
	@DisplayName("Removing Null Contact")
	@Test
	void testRemoveNullContact() {
		ContactService contactService = new ContactService();

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.removeContact("0");
		});
	}

	// Tests the updating of the firstName attribute for contacts within the list
	@DisplayName("Update Contact First Name")
	@Test
	void testUpdateFirstName() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		contactService.updateContactFirstName("0", "John123");
		Contact createdContact = contactService.getContact("0");

		assertTrue(createdContact.getFirstName().equals("John123"));
	}

	// Tests the updating of the lastName attribute for contacts within the list
	@DisplayName("Update Contact Last Name")
	@Test
	void testUpdateLastName() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		contactService.updateContactLastName("0", "Doe123");
		Contact createdContact = contactService.getContact("0");

		assertTrue(createdContact.getLastName().equals("Doe123"));
	}

	// Tests the updating of the phoneNumber attribute for contacts within the list
	@DisplayName("Update Contact Phone Number")
	@Test
	void testUpdatePhoneNumber() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		contactService.updateContactPhoneNumber("0", "9876543210");
		Contact createdContact = contactService.getContact("0");

		assertTrue(createdContact.getPhoneNumber().equals("9876543210"));
	}

	// Tests the updating of the address attribute for contacts within the list
	@DisplayName("Update Contact Address")
	@Test
	void testUpdateAddress() {
		ContactService contactService = new ContactService();
		contactService.addContact("John", "Doe", "0123456789", "1600 Pennsylvania Avenue NW");
		contactService.updateContactAddress("0", "124 Conch Street");
		Contact createdContact = contactService.getContact("0");

		assertTrue(createdContact.getAddress().equals("124 Conch Street"));
	}

}
