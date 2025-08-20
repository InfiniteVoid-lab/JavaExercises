package NF1;
import java.util.Scanner;
public class A1a_5 {

	// Escribe un programa que solicite los datos de un entrenador 
	// (nombre, equipo y temporada) y de un jugador (nombre, equipo y temporada). 
	// Después debe mostrar un cuadro de dos filas con los datos alineados 
	// y una línea separadora entre ambas.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String entrenador;
		String equipo;
		String temporada;
		String nom_jugador;
		String equipo2;
		String temporada2;
		
		
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Ingresa el palabra que desee : ");
		entrenador = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		equipo = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		temporada = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		nom_jugador = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		equipo2 = teclat.nextLine();
		
		System.out.println("Ingresa el palabra que desee : ");
		temporada2 = teclat.nextLine();
		
		
		
		System.out.println("\t" +entrenador+"\t" +equipo+"\t" +temporada);
		
		System.out.println("\t"+"---------------------------------");
		
		System.out.println("\t" +nom_jugador+"\t"+equipo2+"\t"+temporada2);
		
	}

}