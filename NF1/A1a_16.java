package NF1;

import java.util.Scanner;

public class A1a_16 {

	// Escribe un programa que lea una cantidad de minutos 
	// y la convierta en horas y minutos. 
	// Debe mostrar el resultado en el formato: "X horas y Y minutos".


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutos;
		int semanas;
		int dias;
		int horas;
		int minutos2;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Conversor de Minutos:  ");
		minutos = teclat.nextInt();
		
		semanas = minutos /10080;
		dias = semanas * 7;
		horas = dias *24;
		minutos2 = horas *60;
		
		System.out.println(minutos+" minutos son: "+semanas+"s "+dias+"d "+horas+"h "+minutos2+"min");
		
	}

}