package NF2;
import java.util.Scanner;
public class AA3_4 {

	// Escribe un programa que lea un número entero y determine si es múltiplo de 2, de 5, de ambos o de ninguno.
	// Debe mostrar mensajes distintos para: múltiplo de 2, múltiplo de 5, múltiplo de 2 y 5, o ninguno.

	public static void main(String[] args) {
		
		int num1;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Numero");
		num1 = teclat.nextInt();
		

		 if (num1%2==0){
			System.out.println("Es multiplo de 2");
			
		}else if((num1%2==0)&&(num1%5==0)){
		    System.out.println("Es multiplo de 2 y 5");
		    
		}else if(num1%5==0){
		 	System.out.println("Es multiplo de 5");
		}
		else {
			System.out.println("No es multiplo ni de 2 ni de 5");
		}
		teclat.close();

	}

}
