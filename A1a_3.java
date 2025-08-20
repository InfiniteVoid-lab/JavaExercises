package NF1;
import java.util.Scanner;

public class A1a_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra1; 
		char letra2;
		char letra3;
		char letra4;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Ingresa la letra que desee : ");
		letra1 = teclat.next().charAt(0);	
		
		System.out.println("Ingresa la letra que desee : ");
		letra2 = teclat.next().charAt(0);
		
		System.out.println("Ingresa la letra que desee : ");
		letra3 = teclat.next().charAt(0);
		
		System.out.println("Ingresa la letra que desee : ");
		letra4 = teclat.next().charAt(0);
		
		System.out.println("La palabra és : "+letra1 +letra2 +letra3 +letra4);
	}
}