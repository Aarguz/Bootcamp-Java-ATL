package claseSiete;

import java.util.Scanner;

// 1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
// 2) Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
// 3) Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
// ya que el usuario agregó 5 números.

public class cargarNumeros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int numIngresado, numMenor = 0, numMayor = 0, suma = 0, promedio;

        int[] numGuardados = new int[5];

        System.out.println("Ingrese cinco números:");

        // guardo los números ingresados por el usuario en un array.

        for (int i = 0; i < numGuardados.length; i++) {
            numIngresado = read.nextInt();

            numGuardados[i] = numIngresado;
        }

        System.out.println();

        // acá muestro el contenido del array.

        System.out.println("Números ingresados:");

        for (int i = 0; i < numGuardados.length; i++) {
            System.out.println(numGuardados[i]);
        }

        // acá obtenemos el número mayor.

        for (int i = 0; i < numGuardados.length; i++) {
            if (numGuardados[i] > numMayor) {
                numMayor = numGuardados[i];
            }
        }

        // acá obtenemos el número menor.

        numMenor = numMayor;

        for (int i = 0; i < numGuardados.length; i++) {
            if (numGuardados[i] < numMenor) {
                numMenor = numGuardados[i];
            }
        }

        // acá cálculo la suma de los números para posteriormente calcular el promedio.

        for (int i = 0; i < numGuardados.length; i++) {
            suma = suma + numGuardados[i];
        }

        promedio = suma / 5;

        System.out.println();

        System.out.println("El número menor es: " + numMenor +"\n" +
                "El número mayor es: " + numMayor +"\n" + "El promedio es: " + promedio);
    }
}
