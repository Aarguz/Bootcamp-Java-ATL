package claseSeis;

import java.util.Scanner;

// 6) Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.

public class MayorMenor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Ingrese tres números:");
        num1 = read.nextInt();
        num2 = read.nextInt();
        num3 = read.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + " es mayor.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es mayor.");
        } else {
            System.out.println("El número " + num3 + " es mayor.");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("El número " + num1 + " es menor.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El número " + num2 + " es menor.");
        } else {
            System.out.println("El número " + num3 + " es menor.");
        }
    }
}
