package claseOcho;

import java.util.Scanner;

// 2) Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área
// de un triángulo.

public class Triangulo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        float ladoTriangulo, areaTriangulo;

        System.out.println("Ingrese la medida de uno de los lados del cuadrado:");
        ladoTriangulo = read.nextFloat();

        areaTriangulo = calcularAreaTriangulo(ladoTriangulo);

        System.out.println("El área del triángulo es: " + areaTriangulo);
    }

    public static float calcularAreaTriangulo(float ladoTriangulo) {
        return ladoTriangulo * 3;
    }
}
