package Lab5.src.cBook;

import Lab5.src.exceptions.ContactAlreadyExistsException;
import Lab5.src.exceptions.ContactDoesNotExistException;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactBookInList implements ContactBook {
    /**
     * A collection of contacts.
     */
    private List<Contact> contacts;

    /**
     * Default constructor
     */
    public ContactBookInList() {
        contacts = new LinkedList<>();
    }

    @Override
    public boolean has_Contact(String name) {
        return this.getContact(name) != null;
    }

    @Override
    public int getNumberOfContacts() {
        return contacts.size();
    }

    @Override
    public void addContact(String name, int phone, String email) throws ContactAlreadyExistsException {
        if (has_Contact(name))
            throw new ContactAlreadyExistsException();
        else
            contacts.add(new ContactClass(name, phone, email));
    }

    @Override
    public void deleteContact(String name) throws ContactDoesNotExistException {
        if (has_Contact(name))
            contacts.remove(new ContactClass(name));
        else
            throw new ContactDoesNotExistException();
    }

    @Override
    public int getPhone(String name) throws ContactDoesNotExistException, NullPointerException {
        if (has_Contact(name)) {
            Contact contact = this.getContact(name);
            if(contact == null) {
                throw new NullPointerException();
            }else
                return contact.getPhone();
        } else
            throw new ContactDoesNotExistException();
    }

    @Override
    public String getEmail(String name) throws ContactDoesNotExistException, NullPointerException {
        if (has_Contact(name)) {
            Contact contact = this.getContact(name);
            if (contact == null) {
                throw new NullPointerException();
            } else
                return contact.getEmail();
        }else
            throw new ContactDoesNotExistException();
    }

    @Override
    public void setPhone(String name, int phone) throws ContactDoesNotExistException,NullPointerException {
        if (has_Contact(name)) {
            Contact contact = this.getContact(name);
            if (contact == null) {
                throw new NullPointerException();
            } else
                contact.setPhone(phone);
        }else
            throw new ContactDoesNotExistException();
    }

    @Override
    public void setEmail(String name, String email) throws ContactDoesNotExistException, NullPointerException {
        if (has_Contact(name)) {
            Contact contact = this.getContact(name);
            if (contact == null) {
                throw new NullPointerException();
            } else
                contact.setEmail(email);
        }else
            throw new ContactDoesNotExistException();
    }

    @Override
    public Iterator<Contact> listContacts() {
        return contacts.iterator();
    }

    /**
     * @param name The contact name to lookup in the list
     * @return the <code>name</code> of the contact, if it exists,
     * otherwise <code>null</code>
     */
    private Contact getContact(String name) {
        for (Contact c: contacts)
            if (c.getName().equals(name))
                return c;
        return null;
    }
}
