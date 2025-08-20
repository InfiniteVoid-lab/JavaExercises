package NF1;

import java.util.Scanner;

public class A1a_8 {

	// Escribe un programa que lea dos números enteros 
	// y calcule y muestre su suma, resta y producto, 
	// cada resultado en su línea.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		int suma;	
		int resta;
		int producto;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Inserte Numero:  ");
		numero1 = teclat.nextInt();
		
		System.out.println("Inserte Numero : ");
		numero2 = teclat.nextInt();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		producto = numero1 * numero2;
		
		System.out.println("Suma: "+suma+" ");
		
		
		System.out.println("Resta:"+resta+" ");
		
		
		System.out.println("Producto: "+producto+"");
		
		
		
	}

}