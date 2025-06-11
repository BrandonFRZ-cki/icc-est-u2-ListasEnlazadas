package controllers;

import views.ConsoleView;

public class MenuController {
    private ControllerDao contactManager;
    private ConsoleView consoleView;
    private ControllerDao agenda;
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
    protected void addContact(){

    }
    protected void findContact(){}
    protected void deleteContact(){}
    protected void printList(){}

}
