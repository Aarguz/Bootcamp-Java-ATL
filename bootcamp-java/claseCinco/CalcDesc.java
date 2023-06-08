package claseCinco;

import java.util.Scanner;

//3) Calculadora de descuento:
//Pídele al usuario que ingrese el precio original de un producto.
//Pídele al usuario que ingrese el porcentaje de descuento.
//Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
//Muestra el precio final al usuario.

public class CalcDesc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float preciOriginal, porcentajeDesc, precioFinal;

        System.out.println("Ingrese el precio del producto:");
        preciOriginal = read.nextFloat();

        System.out.println("Ingrese el porcentaje de descuento:");
        porcentajeDesc = read.nextFloat();

        precioFinal = preciOriginal - (preciOriginal * porcentajeDesc / 100);

        System.out.println("El precio final es: " + precioFinal);
    }
}
