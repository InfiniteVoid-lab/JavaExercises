package NF1;
import java.util.Scanner;
public class rep_2 {

	// Escribe un programa que calcule el área y el volumen de un cilindro.
	// El usuario debe introducir el radio y la altura.
	// El programa mostrará el área total y el volumen del cilindro.

	public static void main(String[] args) {
		
		float radi;
		float alt;
		float costat;
		float area;
		float volum;
		float pi=(float) 3.1416;
		
		Scanner teclat = new Scanner(System.in);

		System.out.println("Radi: ");
        radi = teclat.nextFloat();	
        
        System.out.println("Alt: ");
        alt = teclat.nextFloat();	
        
        System.out.println("Costat: ");
        costat = teclat.nextFloat();	
        
        area =(pi*radi*costat)+(pi*(radi*radi));
        
        System.out.println("Area: "+area);
       
        volum = pi * ((radi*radi) * alt) /3;
        
        System.out.println("Volum: "+volum);

	}

}