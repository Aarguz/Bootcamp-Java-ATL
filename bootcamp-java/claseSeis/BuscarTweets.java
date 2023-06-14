package claseSeis;

import java.util.Scanner;

//Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
//Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
//Después muestra en consola la concatenación de:
//“https://twitter.com/search?q=” + palabra

public class BuscarTweets {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String buscadorTweet;

        System.out.println("Ingrese el nombre de una celebridad:");
        buscadorTweet = read.nextLine();

        System.out.println("https://twitter.com/search?q=" + buscadorTweet);
    }
}
