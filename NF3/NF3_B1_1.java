package NF3;

import java.util.Scanner;

public class NF3_B1_1 {

	// Escribe un programa que cree un vector de 10 posiciones inicializado a 0,
	// muestre su contenido y después pida al usuario que introduzca 10 números para almacenarlos en el vector. 
	// Finalmente, el programa mostrará por pantalla el contenido final del vector con los valores introducidos.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner teclat = new Scanner(System.in);

		
		//declarar y iniciar vector
		int i;
		int[] vNums2= new int[10];
		
		//Pones el vector a 0
		for(i=0;i<vNums2.length;i++) {
	        vNums2[i]=0;
		}
		//Muestras el contenido del vector
		for(i=0;i<vNums2.length;i++) {
	        System.out.print(vNums2[i] +" ");
		}
		//Pide al usuario  10 valores y lo guarda al vector
		for(i=0;i<vNums2.length;i++) {
			System.out.print("Dime diez numeros");
			vNums2[i] = teclat.nextInt();
		}
	}
}
