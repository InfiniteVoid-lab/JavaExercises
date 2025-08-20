package NF1;
import java.util.Scanner;
public class A1a_1 {

	// Escribe un programa que solicite tres números enteros por teclado 
	// y muestre su suma.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1; 
		int numero2;
		int numero3;
		
		 Scanner teclat = new Scanner(System.in);
				 
		 System.out.println("Ingresa el digito que desee : ");
			numero1 = teclat.nextInt();		
			
		 System.out.println("Ingresa el digito que desee : ");
			numero2 = teclat.nextInt();	
			
		 System.out.println("Ingresa el digito que desee : ");
			numero3 = teclat.nextInt();
			
			System.out.println("La suma es : "+numero1 +numero2 +numero3);
		
	}
}