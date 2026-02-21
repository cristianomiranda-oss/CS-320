package edu.snhu;

import java.util.ArrayList;

public class ContactService {
    // Declares the ArrayList to hold all contacts
    private ArrayList<Contact> Contacts;

    // Declares an attribute to store the currentContactId value
    private int currentContactId = 0;

    public ContactService() {
        // Initializes the Array List upon first instantiating the object
        this.Contacts = new ArrayList<Contact>();
    }

    public Contact getContact(String contactId) {
        // Iterates through the contact array list
        for (int i = 0; i < Contacts.size(); i++) {
            // Pulls the contact object at the current array list index and stores it in a var
            Contact currentContact = Contacts.get(i);
            // Checks if the currentContact object has a matching contactId value to the one passed in 
            if (currentContact.getContactId().equals(contactId)) {
                // Returns the currentContact object
                return currentContact;
            }
        }
        
        // If no matching contact is found in the array list an error is thrown.
        throw new IllegalArgumentException("Contact ID Is Not In The List");
    }
    
    public void addContact(String firstName, String lastName, String phoneNumber, String address) {
        // Stores the value of currentContactId and then increments the attribute value
        String newContactId = Integer.toString(currentContactId++);

        // Instantiates a new contact object using the passed in values and the new contactId value
        Contact newContact = new Contact(newContactId, firstName, lastName, phoneNumber, address);
        // Appends the new contact to the Contact list
        Contacts.add(newContact);
    }
    
    public void removeContact(String contactId) {
        // Iterates through the contact array list
        for (int i = 0; i < Contacts.size(); i++) {
            // Pulls the contact object at the current array list index and stores it in a var
            Contact currentContact = Contacts.get(i);
            // Checks if the currentContact object has a matching contactId value to the one passed in 
            if (currentContact.getContactId().equals(contactId)) {
                // Removes the contact located at the current index
                Contacts.remove(i);
                // Exits the function
                return;
            }
        }
        
        // If no matching contact is found in the array list an error is thrown.
        throw new IllegalArgumentException("Contact ID Is Not In The List");
    }

    public void updateContactFirstName(String contactId, String firstName) {
        // Calls the method to retrieve the contact associated with the contactId in the contact array list
        Contact currentContact = getContact(contactId);
        // Calls the method to update the contact object's firstName attribute
        currentContact.setFirstName(firstName);
    }
    
    public void updateContactLastName(String contactId, String lastName) {
        // Calls the method to retrieve the contact associated with the contactId in the contact array list
        Contact currentContact = getContact(contactId);
        // Calls the method to update the contact object's lastName attribute
        currentContact.setLastName(lastName);
    }
    
    public void updateContactPhoneNumber(String contactId, String phoneNumber) {
        // Calls the method to retrieve the contact associated with the contactId in the contact array list
        Contact currentContact = getContact(contactId);
        // Calls the method to update the contact object's phoneNumber attribute
        currentContact.setPhoneNumber(phoneNumber);
    }
    
    public void updateContactAddress(String contactId, String address) {
        // Calls the method to retrieve the contact associated with the contactId in the contact array list
        Contact currentContact = getContact(contactId);
        // Calls the method to update the contact object's address attribute
        currentContact.setAddress(address);
    }
}
