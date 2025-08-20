package NF1;

import java.util.Scanner;

public class A1a_11 {

	// Escribe un programa que lea un número de días 
	// y lo convierta en años, meses y días aproximados. 
	// Después debe mostrar el resultado por pantalla.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dies;
		int hores;
		int minuts;
		int segons;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Dias:  ");
		dies = teclat.nextInt();
		
		hores = dies * 24;
		minuts = hores * 60;
		segons = minuts *60;
		
		System.out.println(dies+" dies son: "+hores+" hores, "+minuts+" minuts, "+segons+" segons");
		
	}

}