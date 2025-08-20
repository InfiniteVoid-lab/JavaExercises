package NF1;

import java.util.Scanner;

public class rep_1 {

	// Escribe un programa que calcule el área y el volumen de una esfera.
	// El usuario debe introducir el radio y el programa mostrará:
	// - El área de la superficie
	// - El volumen de la esfera

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float radi;
		float area;
		float volum;
		float pi=(float) 3.1416;

		Scanner teclat = new Scanner(System.in);

		System.out.println("Radio de la circunferencia= ");
        radi = teclat.nextFloat();	
        
        area = pi * (radi*radi);
        
        System.out.println("El Radio de la circunferencia= : "+area);

        volum = 4 * pi * (radi*radi*radi)/3;
        
        System.out.println("El Volumen de la circunferencia= : "+volum);

	}

}