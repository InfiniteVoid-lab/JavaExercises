package NF1;
import java.util.Scanner;
public class A1a_0 {

	// Escribe un programa que pida por teclado la edad (entero) del usuario 
	// y muestre por pantalla el mensaje: 
	// "Tienes esta edad <edad>"
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables 
		int edad;
		//Para guardar lo que escribes
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Cuantos años tienes??");
		
		edad=teclat.nextInt();
		
		System.out.println("Tienes esta edad "+edad);
		
	}

}