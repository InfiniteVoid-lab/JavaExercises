package NF1;

import java.util.Scanner;

public class A1a_10 {

	// Escribe un programa que pida una cantidad de años
	// y muestre a cuántos meses, días, horas, minutos y segundos equivale.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Anys;
		int Op1;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Fecha de nacimiento:  ");
		Anys = teclat.nextInt();
		
		Op1 = 2022 - Anys;
		
		System.out.println("Aquest any has fet o faràs "+Op1+" anys !!! ");
		
	}

}