package NF1;

import java.util.Scanner;

public class A1a_6 {

	// Escribe un programa que pida el nombre y la edad del usuario 
	// y muestre el mensaje de felicitación:
	// "Moooltes felicitats <nombre> !!!! <edad> és una edat màgica, que passis un any genial!!!"


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra1;
		String palabra2;
		String palabra3;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Nom: ");
		palabra1 = teclat.nextLine();
		
		System.out.println("Anys: ");
		palabra2 = teclat.nextLine();
		
		System.out.println("Moooltes felicitats "+palabra1+" !!!! "+palabra2+" és una edat màgica, que passis un any genial!!!");
		palabra1 = teclat.nextLine();
	}

}
