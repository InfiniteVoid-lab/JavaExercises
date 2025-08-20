package NF1;

import java.util.Scanner;

public class A1a_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int any;
		int mes;
		int dia;
		int frase;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Any: ");
		any = teclat.nextInt();
		
		System.out.println("Mes: ");
		mes = teclat.nextInt();
		
		System.out.println("Dia: ");
		dia = teclat.nextInt();
		
		System.out.println(+dia+"\\"+mes+"\\"+any);
		frase = teclat.nextInt();
		
	}

}