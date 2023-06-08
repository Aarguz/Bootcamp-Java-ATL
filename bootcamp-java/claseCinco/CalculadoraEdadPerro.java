package claseCinco;

import java.util.Scanner;

// 1) Calculadora de edad de perros:
// Pídele al usuario que ingrese la edad de su perro.
// Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).


public class CalculadoraEdadPerro {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int aniosPerro, edadHumano;
        final int EQUIVALENTE_ANIOS_PERRO = 7;

        System.out.println("Ingrese su edad:");
        edadHumano = read.nextInt();

        aniosPerro = EQUIVALENTE_ANIOS_PERRO * edadHumano;

        System.out.println("Su edad en años perro es " + aniosPerro);
    }
}
