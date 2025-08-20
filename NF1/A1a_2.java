package NF1;
import java.util.Scanner;
public class A1a_2 {

	// Escribe un programa que pida tres números enteros, 
	// calcule la suma total en una variable 
	// y la muestre por pantalla.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int numero3;
		int Sumatotal;
		
		Scanner teclat = new Scanner(System.in);
			System.out.println("Ingresa el digito que desee sumar: ");
			numero1 = teclat.nextInt();		
			
			System.out.println("Ingresa el digito que desee sumar: ");
			numero2 = teclat.nextInt();	
			
			System.out.println("Ingresa el digito que desee sumar: ");
			numero3 = teclat.nextInt();
		
		
		Sumatotal = numero1 + numero2 + numero3;
		
		System.out.println("La suma es : "+Sumatotal);
	}
}
