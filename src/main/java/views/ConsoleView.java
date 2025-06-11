package views;

import java.util.Scanner;

public class ConsoleView {
    public void displayMenu(){
        System.out.println("\n**** Menu Principal ***\n");
        System.out.println("a. Crear Contacto");
        System.out.println("b. Buscar Contacto por Nombre");
        System.out.println("c. Eliminar Contacto");
        System.out.println("d. Imprimir Contactos");
        System.out.println("e. Salir");
    }
    public String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n---\n"+prompt +" → ");
        return scanner.next();
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}
