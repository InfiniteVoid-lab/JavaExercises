package NF1;

import java.util.Scanner;
import java.text.DecimalFormat;


public class A1b_2 {

	// Escribe un programa que calcule el coste de un trayecto en coche.
	// El usuario debe introducir:
	// - El precio de la gasolina (€/litro)
	// - El consumo del coche (litros/100 km)
	// - La distancia del trayecto (km)
	// El programa calculará y mostrará el coste total del viaje.

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		float numero1;
		float gasolina=(float) 2;
		float kilometros;
		float Operacion;
		
		
		DecimalFormat forma = new DecimalFormat("00.00");

		Scanner teclat = new Scanner(System.in);

		System.out.println("Precio de la gasolina");
        gasolina = teclat.nextFloat();
		
        System.out.println("Consumo del coche cada 100 km");
        numero1 = teclat.nextFloat();
        
        System.out.println("Trayecto");
        kilometros = teclat.nextFloat();       
		
        Operacion=kilometros/(numero1*gasolina);
        
        System.out.println("Precio del gas trayecto= : "+Operacion);

	}

}
