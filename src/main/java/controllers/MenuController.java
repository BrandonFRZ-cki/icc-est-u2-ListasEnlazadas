package controllers;

import model.Contact;
import views.ConsoleView;

public class MenuController {
    private ControllerDao contactManager;
    private ConsoleView consoleView;
    private ControllerDao agenda;
    public MenuController(){
        this.agenda = new ControllerDao();
        this.consoleView = new ConsoleView();
    }
    public void showMenu(){
        String opcion;
        contactosIniciales();
        do {
            consoleView.displayMenu();
            opcion = consoleView.getInput("Opcion: ");
            if(opcion.equalsIgnoreCase("a"))
                addContact();
            if(opcion.equalsIgnoreCase("b"))
                findContact();
            if(opcion.equalsIgnoreCase("c"))
                deleteContact();
            if(opcion.equalsIgnoreCase("d"))
                printList();
        }while (!opcion.equals("e"));
        consoleView.showMessage("Chau");

    }
    protected void addContact(){
        String nombre = consoleView.getInput("Nombre: ");
        String phone = consoleView.getInput("Telefono: ");
        Contact contact = new Contact(nombre, phone);
        System.out.println("Contacto agendado" + contact);
        agenda.addContacta(contact);
    }
    protected void findContact(){
        String nombre = consoleView.getInput("Nombre: ");
        Contact encontrado = agenda.findContact(nombre);
        if (encontrado != null){
            consoleView.showMessage("Contacto encontrado" + encontrado);
        }else {
            consoleView.showMessage("No se encontro ningun contacto con ese nombre");
        }
    }
    protected void deleteContact(){
        String nombre = consoleView.getInput("Nombre: ");
        agenda.deleteContactByName(nombre);
        consoleView.showMessage("Contacto Eliminado");
    }
    protected void printList(){
        agenda.printList();
    }
    public void contactosIniciales(){
        agenda.contactosIniciales();
    }
}
