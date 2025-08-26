package NF2;
import java.util.Scanner;
public class AA3_1 {

	// Escribe un programa que lea un número entero y diga si es par o impar.
	// Debe mostrar "El numero es parell" si es par y "El número es imparell" si es impar.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Numero");
		numero1 = teclat.nextInt();
		
		if (numero1%2==0) {
			System.out.println("El numero es parell");
		}else {
		    System.out.println("El número es imparell");
		}
		
		teclat.close();

	}

}
