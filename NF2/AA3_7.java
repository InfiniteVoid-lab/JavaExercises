package NF2;
import java.util.Scanner;
public class AA3_7 {

	//Escribe un programa que pida tres números y verifique si el tercero corresponde a la multiplicación de los dos primeros.

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
		
		 if (num3==num1*num2){
				System.out.println("Correspon amb la multiplicació");
		     }
		 else{
				System.out.println("Nope");
			}
		
		 teclat.close();
	}

}
