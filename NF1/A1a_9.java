package NF1;

import java.util.Scanner;

public class A1a_9 {
	
	// Escribe un programa que pida dividendo y divisor (enteros), 
	// calcule el cociente entero y el residuo de la división, 
	// y los muestre por pantalla.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int divident;
		int divisor;
		int Quocient;	
		int residu;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Inserte Numero:  ");
		divident = teclat.nextInt();
		
		System.out.println("Inserte Numero : ");
		divisor = teclat.nextInt();
		
		Quocient = divident / divisor;
		
		residu  = divident - (Quocient*divisor);

		
		System.out.println("Quocient: "+Quocient+" ");
		
		System.out.println("Residu: "+residu+" ");	
		
		
		
		
	}

}