package NF3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class NF3_F2 {

	//Escribe un programa que gestione un fichero de palabras. Debe mostrar un menú con opciones para: 
	//(1) visualizar todas las palabras del fichero.
	//(2) buscar una palabra (comparación sin mayúsculas/minúsculas) indicando la línea donde aparece o informar si no existe.
	//(3) añadir una palabra al final del fichero.
	//(4) salir. El programa debe trabajar con rutas de fichero indicadas por el usuario/código, usar E/S de ficheros y manejar errores de forma segura.

	// Procediment busca palabras en el fichero llamado "Palabras"
	public static void mostrarParaulesFitxer(String nomFitxer) {
		String registre = null;
		File f = new File(nomFitxer); // si el fichero no esta lo busca asta que intenta abrilo con el scanner
		try {
			Scanner fitxer = new Scanner(f);
			// mostrar tot els registres que hi ha al ficher
			while (fitxer.hasNextLine()) { // mira que alla registros
				registre = fitxer.nextLine(); // lee el registro y lo guarda
				System.out.println(registre);
			}
			fitxer.close(); // cierra la conexion con el fichero
			if (registre == null) {
				System.out.println("Fitxer BUIT");
			}
		} catch (FileNotFoundException e) { // Te dice si el archivo se ha encontrado
			System.out.println("Fitxer no trobat");
		}
	}

	// Funcion bsuca palabras en el fichero llamado "Palabras"
	public static int buscarParaulaFitxer(String nomfitxer, String paraula) {
		String registre = null;
		int cont = 0;
		File f = new File(nomfitxer);
		int pos = -1;
		try {
			Scanner fitxer = new Scanner(f);
			// busca la paraula del registre
			while (fitxer.hasNextLine() && pos == -1) { // mira que encara quedin registres al fitxer
				registre = fitxer.nextLine();// llegeix el registre i ho guarda a la var registre
				cont++;
				if (paraula.equalsIgnoreCase(registre)) { // compara la paraula amb el registre
					pos =cont;
				}
			}
			fitxer.close(); // tancar l’a connexió amb el fitxer
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no trobat");
		}

		return cont;

	}

	// Procediment agrega palabras en el fichero llamado "Palabras"
	public static void afegirParaulesFitxer(String nomFitxer, String paraula) {

		PrintWriter pw = null; // Classe que se encarga de escribir al fichero

		try {
			FileWriter fw = new FileWriter("paraules.txt", true); // true agrega, falso sobreescribe
			pw = new PrintWriter(new BufferedWriter(fw));

			pw.println(paraula); // escribe el fichero con un salto de linea

			System.out.println("Text guardat al fixer amb nom " + nomFitxer);

		} catch (IOException e) { // recoge la excepcion del FileWriter
			System.out.println("ERROR d'escriptura");
		} finally {
			if (pw != null) // sabremos si ha escrito
				pw.close(); // cerramos IMPORTANTE !!!!!
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclat = new Scanner(System.in);
		int opcion;
		String llarg = "C:\\Users\\Infinite-Void\\eclipse-workspace\\Java\\paraules.txt";
		String palabra;
		String buscar;
		do {
			System.out.println("Menú de opciones:");
			System.out.println("1. Mostrar palabras");
			System.out.println("2. Buscar palabras");
			System.out.println("3. Agregar palabras");
			System.out.println("4. Salir");
			System.out.print("Introduce una opción: ");
			opcion = teclat.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Has elegido mostrar palabras");
				mostrarParaulesFitxer(llarg);
				break;
			case 2:
				System.out.println("Has elegido buscar palabras");
				System.out.print("Que palabra quieres buscar??");
				buscar = teclat.next();

				System.out.println("La palabra se ha enonctrado en la fila "+buscarParaulaFitxer(llarg, buscar));
				break;
			case 3:
				System.out.println("Has elegido agregar palabras");

				System.out.print("Que palabra quieres agregar??");
				palabra = teclat.next();
				afegirParaulesFitxer(llarg, palabra);

				break;
			case 4:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
		} while (opcion != 4);

	}
}