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
    private List<MutableContact> contacts;

    /**
     * Default constructor
     */
    public ContactBookInList() {
        contacts = new LinkedList<>();
    }

    @Override
    public boolean hasContact(String name) {
        try {
            this.getMutableContact(name);
            return true;
        } catch (ContactDoesNotExistException e) {
            return false;
        }
    }

    @Override
    public int getNumberOfContacts() {
        return contacts.size();
    }

    @Override
    public void addContact(String name, int phone, String email) throws ContactAlreadyExistsException {
        if (hasContact(name)) {
            throw new ContactAlreadyExistsException();
        } else {
            contacts.add(new ContactClass(name, phone, email));
        }
    }

    @Override
    public void deleteContact(String name) throws ContactDoesNotExistException {
        contacts.remove(getMutableContact(name));
    }

    @Override
    public void setPhone(String name, int phone) throws ContactDoesNotExistException,NullPointerException {
        this.getMutableContact(name).setPhone(phone);
    }

    @Override
    public void setEmail(String name, String email) throws ContactDoesNotExistException, NullPointerException {
        this.getMutableContact(name).setEmail(email);
    }

    @Override
    public Iterator<Contact> listContacts() {
        @SuppressWarnings("unchecked")
        List<Contact> contacts = (List<Contact>)(List<?>) this.contacts;
        return contacts.iterator();
    }

    /**
     * @param name The contact name to lookup in the list
     * @return the <code>name</code> of the contact, if it exists,
     * otherwise <code>Throws ContactDoesNotExistException</code>
     */
    private MutableContact getMutableContact(String name) throws ContactDoesNotExistException {
        for (MutableContact c: contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        throw new ContactDoesNotExistException();
    }

    public Contact getContact(String name) throws ContactDoesNotExistException {
        return getMutableContact(name);
    }
}
