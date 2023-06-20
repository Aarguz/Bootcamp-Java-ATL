package claseDiez.ejDos;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        String titular;
        float saldo;

        System.out.println("Ingrese el nombre del titular de la cuenta:");
        titular = read.nextLine();

        System.out.println("Ingrese el saldo de la cuenta:");
        saldo = read.nextFloat();

        Cuenta cuentaX = new Cuenta(titular, saldo);

        cuentaX.mostrarDatos();
        cuentaX.ingresarSaldo(read.nextFloat());
        cuentaX.retirarSaldo(read.nextFloat());
    }
}
