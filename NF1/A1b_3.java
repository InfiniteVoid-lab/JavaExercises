package NF1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1b_3 {

	// Escribe un programa que calcule el área de un triángulo.
	// El usuario debe introducir la base y la altura en cm.
	// El programa mostrará el área con dos decimales.

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float base;
		float alt;
		float area;
		
		DecimalFormat forma = new DecimalFormat("00.00");

		Scanner teclat = new Scanner(System.in);

		System.out.println("Base del triangulo");
        base = teclat.nextFloat();
		
        System.out.println("Altura del triangulo");
        alt = teclat.nextFloat();
              
        area=(base*alt)/2;
        
        System.out.println("Su area= : "+area);

	}

}
