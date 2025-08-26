package NF2;
import java.util.Scanner;
public class AA3_12 {
  
  //Escribe un programa que pida una hora en formato horas, minutos y segundos, y calcule cuál será la hora un segundo después.

	public static void main(String[] args) {

		int horas;
		int minutos;
		int segundos;
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("horas entre 23 y 0");
        horas = teclat.nextInt();
        
        System.out.println("Minutos entre 59 y 0");
        minutos = teclat.nextInt();
        
        System.out.println("Segundos entre 59 y 0");
        segundos = teclat.nextInt();

        if(segundos==60){
        	segundos=0;
        }else  {
        	segundos=segundos+1;
        }
        
        if(minutos==60 || segundos==60){
        	minutos=0;
        	horas=horas+1;
        }else {
        	minutos=minutos+1;
        	horas=horas+1;
        }

        System.out.println("Nuestra nueva hora es: "+horas+":"+minutos+":"+segundos );
  }
}
