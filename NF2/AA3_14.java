package NF2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AA3_14 {

	//Escribe un programa que lea una nota numérica y muestre por pantalla la calificación correspondiente (Excelente, Notable, Bien, etc.), controlando posibles errores.

	public static void main(String[] args) {

		Double notas;
		String qualificacio = "Syntax Error";

		Scanner teclat = new Scanner(System.in);

		DecimalFormat forma = new DecimalFormat("00");

		System.out.println("Que nota has sacado?");
		notas = teclat.nextDouble();

		if (notas >= 9 && notas <= 10) {
			qualificacio = "Excelent";
		} else if (notas >= 7 && notas < 9) {
			qualificacio = "Notable";
		} else if (notas >= 6 && notas < 7) {
			qualificacio = "Bé";
		} else if (notas >= 5 && notas < 6) {
			qualificacio = "Suficiente";
		} else if (notas >= 0 && notas < 5) {
			qualificacio = "Insuficiente";
		} else {
		}
		System.out.println("Has sacado un : " + qualificacio);
		teclat.close();
	}
}
