package NF1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1b_4 {

	// Escribe un programa que calcule el perímetro de un rectángulo.
	// El usuario debe introducir la base (ancho) y la altura.
	// El programa calculará y mostrará el perímetro con dos decimales.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float weight;
		float height;
		float perimetro;
		
		DecimalFormat forma = new DecimalFormat("00.00");

		Scanner teclat = new Scanner(System.in);

		System.out.println("Weight del rectangulo");
        weight = teclat.nextFloat();
		
        System.out.println("Height del rectangulo");
        height = teclat.nextFloat();
              
        perimetro= weight * height;
        
        System.out.println("Su perimetro= : "+perimetro);
	}

}
