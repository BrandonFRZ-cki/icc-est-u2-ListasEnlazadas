package controllers;

import views.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;
    public MenuController(){}
    public void showMenu(){
        ConsoleView consoleView = new ConsoleView();
        String opcion;
        do {
            consoleView.displayMenu();
            opcion = consoleView.getInput("Opcion: ");
            if(opcion.equalsIgnoreCase("a"))
                addContact();
            if(opcion.equalsIgnoreCase("b"))
                findContact();
            if(opcion.equalsIgnoreCase("c"))
                deleteContact();
        }while (!opcion.equals("d"));
        consoleView.showMessage("Chau");
        printList();
    }
    protected void addContact(){}
    protected void findContact(){}
    protected void deleteContact(){}
    protected void printList(){}

}
