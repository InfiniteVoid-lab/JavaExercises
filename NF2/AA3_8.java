package NF2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AA3_8 {

	//Escribe un programa que calcule el importe neto a partir de un valor bruto y muestre el precio aplicando un IVA del 16% si el importe supera los 15.000, o del 10% en caso contrario.

	public static void main(String[] args) {

		int brut;
		double net;
		final double IVA16=1.16;
		final double IVA10=1.10;
		
		Scanner teclat = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("00");
		
		System.out.println("Import brut");
		brut = teclat.nextInt();
		
		net=brut/1.25;
		
		
		if (brut>15000){
			System.out.println("16% DE IVA "+forma.format(brut/IVA16));
		}else {
			System.out.println("10% DE IVA "+forma.format(brut/IVA10));
		}
		
		System.out.println("Import Net:"+net);
		 
		 teclat.close();

	}

}
