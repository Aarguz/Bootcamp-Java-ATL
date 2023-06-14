package claseSeis;

import java.util.Scanner;

// Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

public class Aventura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int opcion;

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: \n" +
                "1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante\n" +
                "2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora\n");
        opcion = read.nextInt();

        if (opcion == 2) {
            System.out.println("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora.\n" +
                    "Dónde al llegar pierdes la memoria y comienzas de nuevo la historia!");
        } else {
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros\n" +
                    "brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala.\n" +
                    "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de\n" +
                    " emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo.\n" +
                    " ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
        }
    }
}
