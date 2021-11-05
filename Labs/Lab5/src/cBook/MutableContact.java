package Lab5.src.cBook;

interface MutableContact extends Contact {

    /**
     * Changes the phone number of this contact
     * @param phone the phone number
     */
    void setPhone(int phone);

    /**
     * Updates the contact email
     * @param email new email address
     */
    void setEmail(String email);
}