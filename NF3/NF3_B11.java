package NF3;

import java.util.Random;
import java.util.Scanner;

public class NF3_B11 {

	public static void main(String[] args) {
		
		/*Donada una matriu 4x4 de nombres enters, que s'ha d'emplenar amb nombres aleatoris entre -9 i 9, calcula la suma dels nombres del seu perímetre.*/
		
		//Abrimos un Scanner
		
		Scanner teclat = new Scanner(System.in);
		Random rdm = new Random(System.currentTimeMillis());
		 
		//Declares variables y matrius
		
		int f,c,suma,sumap = 0;
        int[][] matriu = new int[4][4];

		//Recorres la matriz con el numero random      
        
		for (f=0;f<matriu.length; f++) {
            for (c=0;c<matriu[f].length; c++){
            	matriu[f][c]=rdm.nextInt(19)-9;
            }
        }//Cierras el primer for
		
		//Enseñas la matriz
		
		for (f = 0,suma=0; f < matriu.length; f++) {
            for (c = 0; c < matriu[f].length; c++){
                System.out.print(matriu[f][c]+" ");
            }
            System.out.println();
        }
				
		//Sumar las filas, la primera y la ultima
		
		for (f=0;f<matriu.length;f++) {
			sumap += matriu[f][0];
			sumap += matriu[f][matriu[f].length-1];
		}
		
		//Sumar las columnas, la primera y la ultima pones el length a -1 para no repetir el numero
		
		for (c=1;c<matriu.length-1;c++) {
			sumap += matriu[0][c];
			sumap += matriu[matriu[c].length-1][c];
		}
		 
		System.out.println("\nLa suma del perimetro es: " + sumap);	
		
		
		//versió 2
		for (f = 0,suma=0; f < matriu.length; f++) {
            for (c = 0; c < matriu[f].length; c++){
                if (f==0 || c==0 || f==matriu.length-1 || c==matriu[f].length-1) {
                	sumap += matriu[f][c];
                }
            }
       
        }
		System.out.println("\nLa suma del perimetro es: " + sumap);		
		//Cierras el teclado
		teclat.close();
		
	}

}
