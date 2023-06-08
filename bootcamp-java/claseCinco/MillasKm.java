package claseCinco;

import java.util.Scanner;

// 2) Conversor de millas a kilómetros:
// Pídele al usuario que ingrese una distancia en millas.
// Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
// Muestra la distancia en kilómetros al usuario.


public class MillasKm {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double distanciaMillas, distanciaKm;
        final double KM = 1.60934;

        System.out.println("Ingrese una distancia en millas:");
        distanciaMillas = read.nextFloat();

        distanciaKm = distanciaMillas * KM;

        System.out.println("la distancia en Kilómetros es " + distanciaKm);
    }
}
