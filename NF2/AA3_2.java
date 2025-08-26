package NF2;
import java.util.Scanner;
public class AA3_2 {

	// Escribe un programa que pida dos números enteros y muestre cuál es mayor y cuál es menor.
	// Debe imprimir ambos valores identificando el más grande y el más pequeño.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Numero");
		numero1 = teclat.nextInt();
		
		System.out.println("Numero");
		numero2 = teclat.nextInt();
		
		if (numero1>=numero2) {
			System.out.println("Es mes gran "+numero1+" y este es el mas pequeño "+numero2+"");
			
		}else {
		    System.out.println("El petit es "+numero1+" el mas grande es "+numero2+"");
		}
		
		teclat.close();

	}
	
}

