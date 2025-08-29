package NF3;

import java.util.*;

public class NF3_B8 {

    public static void main(String[] args) {

        // Fes un programa que generi una matriu de 3x2 de nombres enters, demani els
        // valors a l'usuari i després determini la suma de cadascuna de les files i les
        // columnes:/

        // Abrimos un Scanner
        Scanner teclat = new Scanner(System.in);

        // Variables y matrizes
        int[][] matriu = new int[3][2];
        int f, c, suma, suma2;

        // Pedir los datos al usuario

        System.out.println("Introduce los datos de la matriz de 3 x 2: ");
        for (f = 0; f < matriu.length; f++) {
            for (c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = teclat.nextInt();
            }
        }

        // Determinar la suma de las filas y las columnas

        // Sumas las filas

        // Igualas suma a 0
        suma = 0;

        for (f = 0; f < matriu.length; f++) {
            // Igualas suma a 0 en el bucle
            suma = 0;
            for (c = 0; c < matriu[f].length; c++) {
                System.out.print(matriu[f][c] + " ");
                suma += matriu[f][c];
            }
            System.out.println("= " + suma);

        } // Cierra el primer for

        // Sumas las columnas

        // Igualas suma2 a 0
        suma2 = 0;
        System.out.println("= =");

        for (c = 0; c < matriu[c].length; c++) {
            for (f = 0; f < matriu.length; f++) {
                suma2 += matriu[f][c];
            }
            System.out.print(suma2 + " ");

            // Igualas suma2 a 0 en el bucle
            suma2 = 0;
        } // Cierra el primer for

        // Cierras el teclado
        teclat.close();

    }

}