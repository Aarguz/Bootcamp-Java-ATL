package claseOcho;

import java.util.Scanner;

// 1) Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del
// cuadrado.

public class CalcularAreaCuadrado {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float ladoCuadrado, areaCuadrado;

        System.out.println("Ingrese la medida de uno de los lados del cuadrado:");
        ladoCuadrado = read.nextFloat();

        areaCuadrado = calcularArea(ladoCuadrado);

        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }

    public static float calcularArea(float lado) {
        return lado * lado;
    }
}
