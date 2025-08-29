package NF3;

import java.util.Scanner;

public class NF3_B5 {

	public static void main(String[] args) {

		 /*Programa Java que llegeixi 10 números sencers per teclat i els guardi en un array. 
		 * Calcula i mostra la mitjana dels nombres que estiguin en les posicions parelles del array. 
		 * Considera la primera posició de l'array (posició 0) com a parell.*/
		
		 //Abrimos un Scanner
		 Scanner teclat = new Scanner(System.in);
			
		 //Variables
		 int[] array = new int[10];
		 double suma = 0;
		 int cont = 0;
		 int i;
		 double media;
		    
		 //Pedimos 10 numeros y lo guardamos en un vector
		 for (i=0;i<10;i++) {
		     System.out.println("Pon el numero " + (i + 1) + ":");
		     array[i] = teclat.nextInt();
		 }
		    
		 //Calculam la mitjana dels nombres en les posicions parelles
		 for (i=0;i<10;i++) {
		     suma = suma + array[i];
		     cont++;
		 }
		 
		 //Dividimos la suma y el contador para hacer la media
		 media = suma / cont;
		 System.out.println("La mediana de los numeros es: " + media);
	}

}
