package NF1;

import java.util.Scanner;

public class A1a_13 {

	// Escribe un programa que pida una cantidad en dólares 
	// y muestre su conversión aproximada a euros.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dolars;
		double euro;
		double suma;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Cuants dolars val 1 euro:  ");
		dolars = teclat.nextDouble();
		
		
		
		System.out.println("Euros: ");
		euro = teclat.nextDouble();
		
		suma = euro/dolars;
		
		System.out.println("Un euro a dolar es: " +suma );
		
		
		
		
	}

}