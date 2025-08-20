package NF1;

import java.util.Scanner;

public class A1a_12 {

	// Escribe un programa que pida una cantidad en pesetas
	// y muestre su conversión a euros.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euros;
		int pesetas;
		
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Pesetas:  ");
		pesetas = teclat.nextInt();
		
		euros= pesetas / 166386;
		
		
		
		System.out.println("Euros: "+euros+"€");
		
	}

}