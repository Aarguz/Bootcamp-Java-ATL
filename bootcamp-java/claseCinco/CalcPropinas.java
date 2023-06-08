package claseCinco;

import java.util.Scanner;

// 4) Calculadora de propinas:
//Pídele al usuario que ingrese el total de la cuenta en un restaurante.
//Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
//Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

public class CalcPropinas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float totalCuenta, porcentajePropina, montoPropina;

        System.out.println("Ingrese el total de la cuenta:");
        totalCuenta = read.nextFloat();

        System.out.println("Ingrese el porcentaje de propina que quiere dejar:");
        porcentajePropina = read.nextFloat();

        montoPropina = totalCuenta * (porcentajePropina / 100);

        System.out.println("La propina es de " + montoPropina);
    }
}
