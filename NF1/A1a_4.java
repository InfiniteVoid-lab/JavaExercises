package NF1;
import java.util.Scanner;
public class A1a_4 {

	// Escribe un programa que pida cuatro palabras (cadenas de texto) 
	// y muestre la concatenación de todas ellas en el mismo orden de entrada.


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra1;
		String palabra2;
		String palabra3;
		String palabra4;
		
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Ingresa el palabra que desee : ");
		palabra1 = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		palabra2 = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		palabra3 = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		palabra4 = teclat.nextLine();
		
		System.out.println("La palabra és : "+palabra1 +palabra2 +palabra3 +palabra4);
		
	}

}
