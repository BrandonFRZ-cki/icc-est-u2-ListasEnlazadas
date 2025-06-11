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
        return contacts.findContactByValue(name);
    }
    public void deleteContactByName(String name) {
        contacts.deletByValue(name);
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
