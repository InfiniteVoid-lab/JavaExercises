package NF1;

import java.util.Scanner;

public class A1a_17		 {

	// Escribe un programa que lea el precio de un producto 
	// y calcule su precio con el 21% de IVA. 
	// Debe mostrar el precio original, el importe del IVA y el precio final.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int producto;
		int cantidad;
		float op1;
		float op2 = (float) 1.21;
		int producto2;
		int cantidad2;
		int producto3;
		int cantidad3;
		float SumaTotal;
		float IVA;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Precio del producto y cantidad");
		producto = teclat.nextInt();
		cantidad = teclat.nextInt();
		System.out.println("Precio del producto y cantidad (sin IVA)"+(producto*cantidad));
		System.out.println("Precio del producto y cantidad (IVA)"+(producto*cantidad)*op2);
		
		System.out.println("Precio del producto y cantidad");
		producto2 = teclat.nextInt();
		cantidad2 = teclat.nextInt();
		System.out.println("Precio del producto y cantidad (sin IVA)"+(producto2*cantidad2));
		System.out.println("Precio del producto y cantidad (IVA)"+(producto2*cantidad2)*op2);
		
		System.out.println("Precio del producto y cantidad");
		producto3 = teclat.nextInt();
		cantidad3 = teclat.nextInt();
		System.out.println("Precio del producto y cantidad (sin IVA)"+(producto3*cantidad3));
		System.out.println("Precio del producto y cantidad (IVA)"+(producto3*cantidad3)*op2);
		
		SumaTotal = (producto*cantidad) + (producto2*cantidad2) + (producto3*cantidad3);
		IVA = SumaTotal*op2;
		
		System.out.println("Precio total IVA: "+IVA);
		System.out.println("Precio total IVA: "+SumaTotal);
		
	}

}

