package claseSeis;

import java.util.Scanner;
// 1) Arma un buscador de países con Google Maps.
//primero, pidele al usuario que ingrese un país (Ej: Colombia).
//Después muestra en consola la concatenación de:
// “https://www.google.com/maps/search/” + pais
// Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.


public class BuscarPaises {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String pais;

        System.out.println("Ingrese el país que quiere buscar:");
        pais = read.nextLine();

        System.out.println("https://www.google.com/maps/search/" + pais);
    }
}
