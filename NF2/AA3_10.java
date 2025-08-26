package NF2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AA3_10 {

	//Escribe un programa que lea la nota numérica de un examen y muestre por pantalla la calificación correspondiente (Excelente, Notable, Bien, Suficiente o Suspenso).

	public static void main(String[] args) {

		double notas;
		
		Scanner teclat = new Scanner(System.in);

		DecimalFormat forma = new DecimalFormat("00");
		
		System.out.println("Cuantos has sacado en el examen");
		notas = teclat.nextDouble();
		
		if (notas>=9 && notas<=10){
			System.out.println("Excelent ");
		}else if (notas>=7 && notas<9){
			System.out.println("Notable");
		}else if(notas>=6 && notas<7){
			System.out.println("Bé");
		}else if(notas>=5 && notas<6){
			System.out.println("Suficiente");
		}else if(notas>=0 && notas<5){
			System.out.println("Insuficiente");
		}else {
			System.out.println("Error");
		}
		
		 teclat.close();
	}

}
