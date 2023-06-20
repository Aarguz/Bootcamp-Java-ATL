package claseDiez.ejUno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    String id, nombre, fechaNacimiento, dni;
    int edad;

        System.out.println("Ingrese su número de ID:");
        id = read.nextLine();

        System.out.println("Ingrese su nombre:");
        nombre = read.nextLine();

        System.out.println("Ingrese su edad:");
        edad = read.nextInt();
        read.nextLine();

        System.out.println("Ingrese su fecha de nacimiento:");
        fechaNacimiento = read.nextLine();

        System.out.println("Ingrese su número de DNI:");
        dni = read.nextLine();

        System.out.println();

        Persona personaX = new Persona(id, nombre, edad, fechaNacimiento, dni);

        personaX.mostrar();
    }
}
