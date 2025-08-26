package NF2;
import java.util.Scanner;
public class AA3_5 {

	//Escribe un programa que lea tres números enteros introducidos por el usuario y los almacene para realizar comprobaciones posteriores

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Numero");
		num1 = teclat.nextInt();
		
		System.out.println("Numero");
		num2 = teclat.nextInt();
		
		System.out.println("Numero");
		num3 = teclat.nextInt();
		
		 if (num1+num2==num3){
				System.out.println("Correspon amb la suma");
		     }
		 else{
				System.out.println("Nope");
			}
		
		 teclat.close();
	}

}
