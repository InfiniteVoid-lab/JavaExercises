package NF2;
import java.util.Scanner;

import java.util.Random;
public class asdasads {

	public static void main(String[] args) {
		/*
		 * Fer un programa de simulació del joc de la RULETA que més endavant ens podrà
		 * servir per fer estadístiques de quines són les millors jugades per guanyar.
		 * De moment el programa només ha de simular el joc amb un únic jugador i una
		 * única aposta per partida.
		 */

		// declaració de variables
		char opcio; // variable menú principal
		String player; // nom complet del jugardor
		int edat = 0, credit, num = 0, jugada = 0, jugada2 = 0, guanys, random; // credit els diners del jugador

		// Obrim un Scanner
		Scanner teclat = new Scanner(System.in);

		// Genera un nombre entre 0 i 36
		Random rdm = new Random(System.currentTimeMillis());

		// Menú principal
		do {
			// Demanem nombres per teclat i mostra per pantalla
			System.out.println("Entra I (Iniciar Partida), C (Continuar Joc) o S (Sortir); ");
			opcio = teclat.next().charAt(0);

			// Converteix la lletra a minúscules
			opcio = Character.toUpperCase(opcio);

			credit = 0;

			if (opcio == 'I') {
				System.out.println("Entra el teu nom complet (Nom i Cognom); ");
				player = teclat.nextLine();

				teclat.nextLine();

				System.out.println("Entra la teva edat(+18); ");
				edat = teclat.nextInt();

				if (edat < 18 && credit < 10) {
					System.out.println("Avís!, no pots jugar. Ets menor d'edat i/o no tens suficient crèdit. ");
				} else {
					System.out.println("Quants diners vols apostar? (max 5000$)");
					credit = teclat.nextInt();

					// while preguntas jugador

					while (credit > 5000 || credit < 1) { // Pregunta hasta que escoge un valor entre 5000$ y 1$
						System.out.println("No es permeten crèdits inferiors a 1€ ni superiors a 5000€.");
						System.out.println("Quants diners vols apostar? (max 5000$)");
						credit = teclat.nextInt();
					}
					System.out.println("La teva aposta és de: " + credit);

					// Preguntas que opcion quiere
					System.out.println(
							"Escull una opció: \nVERMELL(1)\nNEGRE(2)\nPARELLS(3)\nSENARS(4)\nMEITAT(5)\nDOTZENA(6)\nCOLUMNA(7)\nNUMERO(8)");
					jugada = teclat.nextInt(); // triar opció

					// if per dirle al usuari quina opció a triat
					if (jugada == 1) {
						System.out.println("VERMELL");
					} else if (jugada == 2) {
						System.out.println("NEGRE");
					} else if (jugada == 3) {
						System.out.println("PARELLS");
					} else if (jugada == 4) {
						System.out.println("SENARS");
					} else if (jugada == 5) {
						do { // Demanara quina meitat mentres no entri 1 o 2
							System.out.println("MEITAT");
							// Para escoger las diferentes opciones de meitat
							System.out.println("Escull: meitat 1 (1-18) o meitat 2 (19-36).");
							jugada2 = teclat.nextInt();
							if (jugada2 == 1) {
								System.out.println("Meitat 1 (1-18)");
							} else if (jugada2 == 2) {
								System.out.println("Meitat 2 (19-36)");
							}
						} while (jugada2 < 1 || jugada2 > 2);
					} else if (jugada == 6) {
						do { // Demanara quina meitat mentres no entri 1 o 2 o 3
							System.out.println("DOTZENA");
							// Para escoger las diferentes opciones de dotzena
							System.out.println("Escull: dotzena 1 (1-12), dotzena 2 (12-24) o dotzena 3 (24-36).");
							jugada2 = teclat.nextInt();
							if (jugada2 == 1) {
								System.out.println("Dotzena1 (1-12)");
							} else if (jugada2 == 2) {
								System.out.println("Dotzena2 (12-24)");
							} else if (jugada2 == 3) {
								System.out.println("Dotzena3 (24-36)");
							}
						} while (jugada2 < 1 || jugada2 > 3);
					} else if (jugada == 7) {
						do { // Demanara quina meitat mentres no entri 1 o 2 o 3
							System.out.println("COLUMNA");
							// Para escoger las diferentes opciones de columna
							if (jugada == 7) {
								System.out.println(
										"Escull: columna 1 (1,4,7,10,13,16,19,22,25,28,31,34), 2 (2,5,8,11,14,17,20,23,26,29,32,35) o la 3 (3,6,9,12,15,18,21,24,27,30,33,36)");
								jugada = teclat.nextInt();
								if (jugada == 1) {
									System.out.println("Columna 1 (1,4,7,10,13,16,19,22,25,28,31,34)");
								} else if (jugada == 2) {
									System.out.println("Columna 2 (2,5,8,11,14,17,20,23,26,29,32,35)");
								} else if (jugada == 3) {
									System.out.println("Columna 3 (3,6,9,12,15,18,21,24,27,30,33,36)");
								}
							}
						} while (jugada2 < 1 || jugada2 > 3);
					} else if (jugada == 8) {
						System.out.println("Numero 0-36");
					} else {
						System.out.println("INCORRECTE");
					}

					// Jugada del crupier per tirar la bola
					random = rdm.nextInt(36); // Número del 0 al 36
					System.out.println(random + " es el número que ha sortit");

					// Mira qui ha guanyat i quant
					if (jugada == 1 || jugada == 2 || jugada == 3 || jugada == 4 || jugada == 5) {
						guanys = num;

					} else if (jugada == 6 || jugada == 7) {
						guanys = num * 2;

					} else if (jugada == 8) {
						guanys = num * 35;

					} else if (jugada == 8 && num == 0) {
						guanys = num * 36;
					}

				}
			} else if (opcio == 'C') {
				System.out.println("No hi ha cap joc inciat. ");
			}

		} while (opcio != 'S');
		System.out.println("Has sortit del joc. ");

		// Tancar el Scanner
		teclat.close();

	}

}