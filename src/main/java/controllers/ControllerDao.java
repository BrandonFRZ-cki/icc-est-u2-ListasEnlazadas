package controllers;

import model.Contact;
import model.LinkedList;

public class ControllerDao {
    private LinkedList contacts;
    public ControllerDao(){
        this.contacts = new LinkedList<>();
    }

    public void addContacta(Contact contact) {
        contacts.appendToTail(contact);
    }
    public Contact findContact(String name) {
        if (contacts != null){
            return contacts.findContactByValue(name);
        }
        return null;
    }
    public void deleteContactByName(String name) {
        Contact tempContact = new Contact(name);
        contacts.deletByValue(tempContact);
    }
    public void printList() {
        contacts.print();
    }
    public void contactosIniciales() {
        contacts.appendToTail(new Contact("Erick", "25254"));
        contacts.appendToTail(new Contact("John", "4545"));
        contacts.appendToTail(new Contact("Brandon", "25254"));
    }
}
