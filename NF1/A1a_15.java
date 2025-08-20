package NF1;

import java.util.Scanner;

public class A1a_15 {

	// Escribe un programa que lea las notas de tres actividades evaluadas 
	// (en decimal) y calcule la nota final como el promedio de las tres. 
	// Muestra la nota final por pantalla.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Act1;
		double Act2;
		double Act3;
		double res;
		double res2;
		double Exam;
		double Exam2;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Nota de tus 3 actividades:  ");
		Act1 = teclat.nextDouble();
		Act2 = teclat.nextDouble();
		Act3 = teclat.nextDouble();
		
		res = Act1+Act2+Act3;
		res2 =res/3;
			
		System.out.println("Examen:  ");
		Exam = teclat.nextDouble();
		
		Exam2 = res2+Exam;
		
		System.out.println("Tu nota final es: "+Exam2/2);
		
	}

}