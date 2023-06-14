package claseSeis;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numAleatorio = (int) (Math.random() * 3);
        String eleccionPc, eleccionJugador;

        System.out.println("Elija: ¿Piedra, papel o tijera?");
        eleccionJugador = read.nextLine();

        if (numAleatorio == 1) {
            eleccionPc = "Piedra";
        } else if (numAleatorio == 2) {
            eleccionPc = "Papel";
        } else {
            eleccionPc = "Tijera";
        }

        System.out.println("PC: " + eleccionPc + " vs " + eleccionJugador);
    }
}
