package claseSeis;

import java.util.Scanner;

// 3) Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
// Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
// Después muestra en consola la concatenación de:
// “https://api.whatsapp.com/send?phone=” + telefono

public class LlamarPersona {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int llamar;

        System.out.println("Ingrese el número de la persona a quién quiere llamar:");
        llamar = read.nextInt();

        System.out.println("https://api.whatsapp.com/send?phone=" + llamar);
    }
}
