package NF3;

import java.util.Scanner;

public class NF3_B4 {

	public static void main(String[] args) {
		
		/*Crear un vector amb els noms dels alumnes d’una classe. Demanar a l’usuari la nota de cada alumne/a (double), 
		calcular i mostrar la nota mitjana del grup i després mostrar els noms i la nota dels/les alumnes amb nota superior a la mitjana.*/
		
		//Abrimos un Scanner
		Scanner teclat = new Scanner(System.in);

		//Variables
		String[] vNombres= {"hugo","tesi","feison","toni","joan"};
		double[] vNotas= {1.1,2.2,3.3,4.4,5.5};
		int i;
		double notas = 0;		
		double media = 0;
		
		//Haces un bucle para saber la nota de cada estudiante
		for(i=0;i<vNombres.length;i++) {			
			System.out.println("Dime la nota del alumno " + vNombres[i] );
			vNotas[i]=teclat.nextInt();		
		}	
		//Calcula el avg de las notas
		for (i=0;i<vNombres.length;i++) {
		    notas = notas + vNotas[i];
		}
		
		media = notas / vNombres.length;
		
		//Hacemos el for y el if para saber cual es las 2 mejores notas
		System.out.println("Los siguientes estudiantes tienen la mejor media :");
		for (i=0;i<vNombres.length;i++) {
		    if (vNotas[i] > media) {
		        System.out.println(vNombres[i] + " : " + vNotas[i]);
		    }
		}
	}
}