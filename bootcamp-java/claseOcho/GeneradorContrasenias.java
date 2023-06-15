package claseOcho;

// 3) Crear una función que sea un generador de contraseñas.
// Al llamarla debe devolver una contraseña (por ejemplo, puedes utilizar Math.random() para
// devolver un número aleatorio que podría ser una contraseña.


public class GeneradorContrasenias {
    public static void main(String[] args) {
        String contrasenia = crearContrasenia();

        System.out.println(contrasenia);
    }

    public static String crearContrasenia() {
        int parteNumerica = (int) (Math.random() * 10000);

        String parteLetra = "hwhe";

        return parteLetra + parteNumerica;
    }
}
