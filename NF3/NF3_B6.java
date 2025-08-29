package NF3;

import java.util.Scanner;

public class NF3_B6 {

	public static void main(String[] args) {

		/*Programa Java que ompli un array amb 10 nombres enters que es llegeixen per teclat. 
		A continuació digues quants noms negatius hi ha a l’array i quants positius*/
		
		
		//Abrimos un Scanner
		 Scanner teclat = new Scanner(System.in);
		 
		//Variables
	    int[] array = new int[10];
	    int i;
	    int numN = 0;
	    int numP = 0;
	    
		//Pedimos 10 numeros y lo guardamos en un vector
	    for (i=0;i<10;i++) {
	        System.out.println("Pon numeros " + (i + 1) + ":");
	        array[i] = teclat.nextInt();
	    }
	    
	    //Contamos los numeros negativos y positivos
	    for (i=0;i<10;i++) {
	        if (array[i] > 0) {
	            numP++;
	        } else {
	            numN++;
	        }
	    }
	    
	    //Hacemos un s.o.p para ver los numeros P y N
	    System.out.println("Hay " + numP + " numeros positivos y " + numN + " numeros negativos.");
	}

}
