package NF1;

import java.util.Scanner;

import java.text.DecimalFormat;
public class A1b_1 {

	// Escribe un programa que pida dos números decimales, 
	// calcule su suma, resta, multiplicación y división 
	// y muestre los resultados con dos decimales.


	public static void main(String[] args) {
		// TODO Auto-generated method stub	        
		float numero1;
		float numero2=(float) 1.21;
		float porcentaje;
		
		DecimalFormat forma = new DecimalFormat("00.00");

		Scanner teclat = new Scanner(System.in);

        System.out.println("Producto");
        numero1 = teclat.nextFloat();
        
        System.out.println( +numero1+ "");
		
		System.out.println(forma.format(numero1));
		
        porcentaje = numero1*numero2;
        
        System.out.println("El IVA es = : "+porcentaje);

	}

}
