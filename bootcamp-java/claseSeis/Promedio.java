package claseSeis;

import java.util.Scanner;

// 5) Armar un programa que permita cargar 3 números y mostrar cual es el número promedio

public class Promedio {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeros, sumaNumeros = 0, promedio;

        System.out.println("Ingrese tres números:");

        for (int i = 0; i < 3; i++) {
            numeros = read.nextInt();
            sumaNumeros = sumaNumeros + numeros;
        }

            promedio = sumaNumeros / 100;

        System.out.println("El número promedio es " + promedio);
    }
}
