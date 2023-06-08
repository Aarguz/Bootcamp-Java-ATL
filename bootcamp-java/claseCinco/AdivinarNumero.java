package claseCinco;

import java.util.Scanner;

// 5) Juego de adivinar el número:
// Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 101), numX;

        System.out.println("¡Adivine el número!");
        numX = read.nextInt();

        if (numX < 1 || numX > 100) {
            System.out.println("El valor debía ser entre 1 y 100");
        } else if (numX == numAleatorio) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto!");

    }
        read.close();
    }
}
