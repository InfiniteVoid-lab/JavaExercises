package NF3;

import java.util.Random;
import java.util.Scanner;

public class NF3_B13 {

	public static void main(String[] args) {
		
		/*Crear un vector d’enters de 20 posicions. 
		Fes un bucle per omplir el vector amb nums aleatoris entre 1 i 100 i ves mostrant els nums que guardes.*/

		/*a)Demanar nums a l’usuari fins que entri un 0. A cada número dir a quins posició 
		 * del vector està (si n’hi ha més d’un, dir només la primera posició; si no el troba que torni -1 i digui que no hi és).*/
		
		/*b)Demanar nums a l’usuari fins que entri un 0. A cada número dir a quants cops és al vector.*/
		
		Random rdm = new Random(System.currentTimeMillis());
		Scanner teclat = new Scanner(System.in);

		//declarar y iniciar vector
		int[] vNums= new int[20];
		int i;
		int num = 0;
		int cont = 0;
		
		//Haces un bucle para llenar los vectores con numeros aleatorios entre 1 i 100
		for(i=0;i<vNums.length;i++) {
			//Random de 100 numeros
			vNums[i] = rdm.nextInt(100)+1;
			//Enseña los 20 numeros guardados en el vector
			System.out.print(vNums[i]+" ");
		}
		//Parte a)
		//Pides numeros y dice en que posicion del vector esta, si pones 0 sales 		
		do {
			System.out.println("\nDime un numero");
			num=teclat.nextInt();
		    for(i=0;i<vNums.length;i++) {
		    	if(num == vNums[i]) {
		    		System.out.println(num+ " esta en la posicion " +i);	
		    		i=vNums.length; //Para salir del vector
		    	}
		    } 
		    if(i != vNums[i]) {
	    		System.out.println("No se ha encontrado el vector");
		    }
		}while(vNums[i] != 0);
			System.out.println("Has salido");
		
		//Parte b)
		//Pedir numeros al usuario hasta que entre un 0, en cada numero decir cuantas veces esta el vector.
		do {
			System.out.println("\nDime un numero");
			num=teclat.nextInt();
			for(i=0;i<vNums.length;i++) {
				if(vNums[i]==num) {
					cont++;
				}
			}
    		System.out.println(num+ " esta en la posicion " +i);	

		}while(vNums[i] != 0);
		System.out.println("Has salido");
		
		
		
		
	}
}
