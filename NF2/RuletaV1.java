package NF2;

import java.util.Scanner;

import java.util.Random;

public class dsada {

	public static void main(String[] args) {
		/*
		 * Fer un programa de simulació del joc de la RULETA que més endavant ens podrà
		 * servir per fer estadístiques de quines són les millors jugades per guanyar.
		 * De moment el programa només ha de simular el joc amb un únic jugador i una
		 * única aposta per partida.
		 */

		// declaració de variables
		char opcio; // variable menú principal
		String player = null; // nom complet del jugador
		int edat = 0;
		int credit = 0, aposta = 0; // credit els diners del jugador
		int jugada = 0, jugadaM = 0, jugadaC = 0, jugadaD = 0, jugadaN = 0; // jugadaM (meitat) / jugadaC (columna)...
		int random = 0; // número aleatori

		// Jugades
		int VERMELL = 1;
		int NEGRE = 2;
		int PARELLS = 3;
		int SENARS = 4;
		int MEITAT = 5;
		int DOTZENA = 6;
		int COLUMNA = 7;
		int NUMERO = 8;

		// Jugades Meitat
		int PRIMER_MEITAT = 1;
		int SEGONA_MEITAT = 2;

		// Jugades Dotzenas
		int PRIMER_DOTZENA = 1;
		int SEGONA_DOTZENA = 2;
		int TERCERA_DOTZENA = 3;

		// Jugades Columna
		int PRIMERA_COLUMNA = 1;
		int SEGONA_COLUMNA = 2;
		int TERCERA_COLUMNA = 3;

		// Obrim un Scanner
		Scanner teclat = new Scanner(System.in);

		// Genera un nombre entre 0 i 36
		Random rdm = new Random(System.currentTimeMillis());

		// Genera un nombre entre 0 i 36
		Random rdm0 = new Random(System.currentTimeMillis());

		do {
			// Demanem nombres per teclat i mostra per pantalla

			// MenÃº Principal
			System.out.println("Entra I (Iniciar Partida), C (Continuar Joc) o S (Sortir); ");
			opcio = teclat.next().charAt(0);

			// Converteix la lletra a minÃºscules
			opcio = Character.toUpperCase(opcio);

			// Permet escollir quina opciÃ³ volem utilitzar
			switch (opcio) {

			case ('I'): // Per iniciar el joc
				System.out.println("Entra el teu nom complet (Nom i Cognom); ");
				player = teclat.nextLine();

				teclat.nextLine();

				System.out.println("Entra la teva edat(+18); ");
				edat = teclat.nextInt();

				while (edat < 18 || edat > 99) { // Mentre l'edat sigui menor que 18 o major que 99
					System.out.println("Avís!, no pots jugar. Ets menor d'edat. ");
					System.out.println("Entra la teva edat(+18); ");
					edat = teclat.nextInt();
				}

				System.out.println("Entra el teu crèdit (max 5000€); ");
				credit = teclat.nextInt();
				while (credit > 5000 || credit < 10) { // Pregunta fins que es tria un valor entre 5000€ i 1€
					System.out.println("No es permeten crèdits inferiors a 1€ ni superiors a 5000€. ");
					System.out.println("Quants diners vols apostar? (max 5000€)");
					credit = teclat.nextInt();
				}

			case ('C'):// Per continuar el joc
				if (!player.equals(null) && credit > 0) { // continuem el joc sempre i quan s'hagi iniciat partida i
															// tinguem crèdit

					System.out.println("Continues jugant.");

					do {

						System.out.println("Quants diners vols apostar?");
						aposta = teclat.nextInt();
						while (aposta > credit || aposta < 1) { // Pregunta fins que es tria un valor entre 5000€ i 1€
							System.out.println("No es permeten apostes inferiors a 1€ o superiors al teu crèdit.");
							System.out.println("Quants diners vols apostar? (max 5000€)");
							aposta = teclat.nextInt();
						}

						System.out.println("La teva aposta és de: " + aposta);

						do {

							// Preguntes quina opció vols
							System.out.println(
									"Escull una opció: \nVERMELL(1)\nNEGRE(2)\nPARELLS(3)\nSENARS(4)\nMEITAT(5)\nDOTZENA(6)\nCOLUMNA(7)\nNUMERO(8)");
							jugada = teclat.nextInt();

						} while (jugada < 1 || jugada > 8); // fer el do mentre jugada sigui menor que 1 o més gran que
															// 8

						// INICIAR APOSTA
						// if i else if per saber quina opció escollir per apostar
						if (jugada == VERMELL) {
							System.out.println("VERMELL");

						} else if (jugada == NEGRE) {
							System.out.println("NEGRE");

						} else if (jugada == PARELLS) {
							System.out.println("PARELLS");

						} else if (jugada == SENARS) {
							System.out.println("SENARS");

						} else if (jugada == MEITAT) {

							do { // Demanara quina meitat mentres entri 1 o 2
								System.out.println("MEITAT");
								// Per triar les diferents opcions de meitat
								System.out.println("Escull: meitat 1 (1-18) o meitat 2 (19-36).");
								jugadaM = teclat.nextInt();

								if (jugadaM == PRIMER_MEITAT) {
									System.out.println("Meitat 1 (1-18)");

								} else if (jugadaM == SEGONA_MEITAT) {
									System.out.println("Meitat 2 (19-36)");

								} else {
									System.out.println("Meitat incorrecta");// per si fiquem un num que no sigui ni 1 o
																			// 2

								}

							} while (jugadaM < 1 || jugadaM > 2); // mentre sigui menor que 1 o major que 2

						} else if (jugada == DOTZENA) {

							do { // Demanara quina meitat mentres entri 1 o 2 o 3
								System.out.println("DOTZENA");
								// Per triar les diferents opcions de dotzena
								System.out.println("Escull: dotzena 1 (1-12), dotzena 2 (12-24) o dotzena 3 (24-36).");
								jugadaD = teclat.nextInt();

								if (jugadaD == PRIMER_DOTZENA) {
									System.out.println("Dotzena1 (1-12)");

								} else if (jugadaD == SEGONA_DOTZENA) {
									System.out.println("Dotzena2 (13-24)");

								} else if (jugadaD == TERCERA_DOTZENA) {
									System.out.println("Dotzena3 (25-36)");

								} else {
									System.out.println("Dotzena incorrecta");// per si fiquem un num que no sigui ni 1,2
																				// o 3

								}

							} while (jugadaD < 1 || jugadaD > 3);

						} else if (jugada == COLUMNA) {

							do { // Demanara quina meitat mentres entri 1 o 2 o 3
								System.out.println("COLUMNA");
								// Per triar les diferents opcions de columna
								System.out.println(
										"Escull: columna 1 (1,4,7,10,13,16,19,22,25,28,31,34), 2 (2,5,8,11,14,17,20,23,26,29,32,35) o la 3 (3,6,9,12,15,18,21,24,27,30,33,36)");
								jugadaC = teclat.nextInt();

								if (jugadaC == PRIMERA_COLUMNA) {
									System.out.println("Columna 1 (1,4,7,10,13,16,19,22,25,28,31,34)");

								} else if (jugadaC == SEGONA_COLUMNA) {
									System.out.println("Columna 2 (2,5,8,11,14,17,20,23,26,29,32,35)");

								} else if (jugadaC == TERCERA_COLUMNA) {
									System.out.println("Columna 3 (3,6,9,12,15,18,21,24,27,30,33,36)");

								} else {
									System.out.println("Columna incorrecta");// per si fiquem un num que no sigui ni 1,2
																				// o 3

								}

							} while (jugadaC < 1 || jugadaC > 3);

						} else if (jugada == NUMERO) {
							// Pregunta número i es queda guardat a jugadaN
							System.out.println("Entra un número entre 0 i 36; ");
							jugadaN = teclat.nextInt(); // tu ho guardaves a jugada i llavors perdies la jugada

						}

						// Genera un número random
						random = rdm.nextInt(36) + 1; // Número del 1 al 36
						System.out.println(random + "   és el número que ha sortit.");

						// si conicideix el número que s'ha escrit amb el que ha sortit, multipliquem
						// *35
						if (jugada == NUMERO && random == jugadaN) {
							credit = credit + (aposta * 35);
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if (jugada == NUMERO && random == 0 && jugadaN == 0) { // si el número que ha sortit és
																						// 0, multipliquem *36
							credit = credit + (aposta * 36);
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);
						}

						// Els números que surten són els números guanyadors. Si random coincideix amb
						// el num guanyador, GUANYES! (per a tota la secció)
						else if (jugada == VERMELL && (random == 1 || random == 3 || random == 5 || random == 7
								|| random == 9 || random == 12 || random == 14 || random == 16 || random == 18
								|| random == 19 || random == 21 || random == 23 || random == 25 || random == 27
								|| random == 30 || random == 32 || random == 34 || random == 36)) {
							credit = credit + aposta;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if (jugada == NEGRE && (random == 2 || random == 4 || random == 6 || random == 8
								|| random == 10 || random == 11 || random == 13 || random == 15 || random == 17
								|| random == 20 || random == 22 || random == 24 || random == 26 || random == 28
								|| random == 29 || random == 31 || random == 33 || random == 35)) {
							credit = credit + aposta;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if (jugada == PARELLS && (random % 2 == 0) && random != 0) {
							credit = credit + aposta;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if (jugada == SENARS && (random % 2 != 0)) {
							credit = credit + aposta;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if ((jugadaM == PRIMER_MEITAT) && (random >= 1 && random <= 18)
								|| (jugadaM == SEGONA_MEITAT) && (random >= 19 && random <= 36)) {
							credit = credit + aposta;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if ((jugadaD == PRIMER_DOTZENA) && (random >= 1 && random <= 12)
								|| (jugadaD == SEGONA_DOTZENA) && (random >= 13 && random <= 24)
								|| (jugadaD == TERCERA_DOTZENA) && (random >= 25 && random <= 36)) {
							credit = (credit + aposta) * 2;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if ((jugadaC == PRIMERA_COLUMNA) && (random == 1 || random == 4 || random == 7
								|| random == 10 || random == 13 || random == 16 || random == 19 || random == 22
								|| random == 25 || random == 28 || random == 31 || random == 34)) {
							credit = (credit + aposta) * 2;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if ((jugadaC == SEGONA_COLUMNA) && (random == 2 || random == 5 || random == 8
								|| random == 11 || random == 14 || random == 17 || random == 20 || random == 23
								|| random == 26 || random == 29 || random == 32 || random == 35)) {
							credit = (credit + aposta) * 2;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						} else if ((jugadaC == TERCERA_COLUMNA) && (random == 3 || random == 6 || random == 9
								|| random == 12 || random == 15 || random == 18 || random == 21 || random == 24
								|| random == 27 || random == 30 || random == 33 || random == 36)) {
							credit = (credit + aposta) * 2;
							System.out.println("Has guanyat: " + aposta + "\n El teu crèdit és de " + credit);

						}

						// Si el num no coincideix amb random, PERDS!
						else {
							credit = credit - aposta;// per a que es resti al crèdit l'aposta feta
							System.out.println("Has perdut: " + aposta + "\n El teu crèdit és de " + credit);
						}

						// Preguntar si vol continuar o sortir del joc
						System.out.println("Vols continuar jugant o sortir del joc(continuar/sortir)? c/s");
						// llegir valor
						opcio = teclat.next().charAt(0);

						// Converteix la lletra a minúscules
						opcio = Character.toUpperCase(opcio);
						// FI APOSTA
					} while (opcio == 'C');

				}
			}

		} while (opcio != 'S');
		System.out.println("Has sortit del joc. ");

		// Tancar el Scanner
		teclat.close();

	}

}