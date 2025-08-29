package heroes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Heroes1 implements Heroes {

	private ArrayList<String> heroes = new ArrayList<>();
	private ArrayList<String> villanos = new ArrayList<>();
	private ArrayList<String[]> poderes = new ArrayList<>();

	@Override
	public void crearHeroe(String nombre, int puntosVida, int armadura) {
		heroes.add(nombre + "," + puntosVida + "," + armadura);
	}

	@Override
	public void crearVillano(String nombre, int puntosVida, int fuerza, int armadura) {
		villanos.add(nombre + "," + puntosVida + "," + fuerza + "," + armadura);
	}

	@Override
	public void asignarPoder(String personaje, String nombrePoder, int fuerza, int turnos) {
		String[] nuevoPoder = new String[4];
		nuevoPoder[0] = personaje;
		nuevoPoder[1] = nombrePoder;
		nuevoPoder[2] = "" + fuerza;
		nuevoPoder[3] = "" + turnos;
		poderes.add(nuevoPoder);
	}

	private int[] atacarHeroe(String[] heroe, int vidaVillano, int armaduraVillano) {
		Random random = new Random();
		ArrayList<String[]> poderesHeroe = new ArrayList<>();

		// Recorrer la lista de poderes y agregar los que correspondan al héroe
		for (int i = 0; i < poderes.size(); i++) {
			String[] poder = poderes.get(i);
			boolean esMismoHeroe = true;

			// Comparación manual de los nombres (sin equals)
			if (poder[0].length() == heroe[0].length()) {
				for (int j = 0; j < poder[0].length(); j++) {
					if (poder[0].charAt(j) != heroe[0].charAt(j)) {
						esMismoHeroe = false;
						break;
					}
				}
			} else {
				esMismoHeroe = false;
			}

			if (esMismoHeroe) {
				poderesHeroe.add(poder);
			}
		}

		if (poderesHeroe.size() > 0) {
			String[] poderUsado = poderesHeroe.get(random.nextInt(poderesHeroe.size()));
			String dañoTexto = poderUsado[2].trim();

			// Conversión manual de String a int
			int daño = 0;
			for (int i = 0; i < dañoTexto.length(); i++) {
				char c = dañoTexto.charAt(i);
				if (c >= '0' && c <= '9') {
					daño = daño * 10 + (c - '0');
				}
			}

			if (armaduraVillano > 0) {
				armaduraVillano -= daño;
				if (armaduraVillano < 0) {
					vidaVillano += armaduraVillano;
					armaduraVillano = 0;
				}
			} else {
				vidaVillano -= daño;
			}

			System.out.println(heroe[0] + " usa " + poderUsado[1] + " causando " + daño + " de daño!");
		} else {
			System.out.println(heroe[0] + " no tiene poderes disponibles!");
		}

		return new int[] { vidaVillano, armaduraVillano };
	}

	private int[] atacarVillano(String[] villano, int vidaHeroe, int armaduraHeroe) {
		// Eliminación manual de espacios en blanco al inicio y al final
		String dañoTexto = villano[2];
		int inicio = 0, fin = dañoTexto.length() - 1;

		while (inicio <= fin && dañoTexto.charAt(inicio) == ' ') {
			inicio++;
		}
		while (fin >= inicio && dañoTexto.charAt(fin) == ' ') {
			fin--;
		}

		String dañoLimpio = "";
		for (int i = inicio; i <= fin; i++) {
			dañoLimpio += dañoTexto.charAt(i);
		}

		// Conversión manual de String a int
		int daño = 0;
		for (int i = 0; i < dañoLimpio.length(); i++) {
			char c = dañoLimpio.charAt(i);
			if (c >= '0' && c <= '9') {
				daño = daño * 10 + (c - '0');
			}
		}

		if (armaduraHeroe > 0) {
			armaduraHeroe -= daño;
			if (armaduraHeroe < 0) {
				vidaHeroe += armaduraHeroe;
				armaduraHeroe = 0;
			}
		} else {
			vidaHeroe -= daño;
		}

		System.out.println(villano[0] + " ataca causando " + daño + " de daño!");
		return new int[] { vidaHeroe, armaduraHeroe };
	}

	@Override
	public void batalla() {
		Scanner sc = new Scanner(System.in);
		int heroChoice, villanoChoice;
		String[] heroeSeleccionado, villanoSeleccionado;

		System.out.println("Selecciona un Héroe:");
		for (int i = 0; i < heroes.size(); i++) {
			System.out.println((i + 1) + ". " + heroes.get(i));
		}
		System.out.print("Elige el número del héroe: ");
		heroChoice = sc.nextInt() - 1;
		heroeSeleccionado = heroes.get(heroChoice).split(",");

		System.out.println("\nSelecciona un Villano:");
		for (int i = 0; i < villanos.size(); i++) {
			System.out.println((i + 1) + ". " + villanos.get(i));
		}
		System.out.print("Elige el número del villano: ");
		villanoChoice = sc.nextInt() - 1;
		villanoSeleccionado = villanos.get(villanoChoice).split(",");

		// Aplicar trim directamente en la extracción de valores
		int vidaHeroe = convertirAEntero(heroeSeleccionado[1].trim());
		int armaduraHeroe = convertirAEntero(heroeSeleccionado[2].trim());
		int vidaVillano = convertirAEntero(villanoSeleccionado[1].trim());
		int fuerzaVillano = convertirAEntero(villanoSeleccionado[2].trim());
		int armaduraVillano = convertirAEntero(villanoSeleccionado[3].trim());

		Random random = new Random();
		int turno = 1;
		boolean turnoHeroe = random.nextBoolean();

		System.out.println(
				"\nLa batalla entre " + heroeSeleccionado[0] + " y " + villanoSeleccionado[0] + " va a comenzar...");

		while (vidaHeroe > 0 && vidaVillano > 0) {
			System.out.println("TURNO " + turno);

			if (turnoHeroe) {
				int[] resultado = atacarHeroe(heroeSeleccionado, vidaVillano, armaduraVillano);
				vidaVillano = resultado[0];
				armaduraVillano = resultado[1];
				if (vidaVillano <= 0)
					break;

				resultado = atacarVillano(villanoSeleccionado, vidaHeroe, armaduraHeroe);
				vidaHeroe = resultado[0];
				armaduraHeroe = resultado[1];
			} else {
				int[] resultado = atacarVillano(villanoSeleccionado, vidaHeroe, armaduraHeroe);
				vidaHeroe = resultado[0];
				armaduraHeroe = resultado[1];
				if (vidaHeroe <= 0)
					break;

				resultado = atacarHeroe(heroeSeleccionado, vidaVillano, armaduraVillano);
				vidaVillano = resultado[0];
				armaduraVillano = resultado[1];
			}
			turno++;
		}

		if (vidaHeroe > 0) {
			System.out.println("!!!! Vencedor " + heroeSeleccionado[0] + " con " + vidaHeroe + " pv\n");
		} else {
			System.out.println("!!!! Vencedor " + villanoSeleccionado[0] + " con " + vidaVillano + " pv\n");
		}
	}

	// Método auxiliar para convertir String a int manualmente
	private int convertirAEntero(String texto) {
		// Conversión manual de String a int
		int numero = 0;
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c >= '0' && c <= '9') {
				numero = numero * 10 + (c - '0');
			}
		}
		return numero;
	}		

    public void mostrarPersonajes() {
        System.out.println("\n=== Héroes ===");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }

        System.out.println("\n=== Villanos ===");
        for (int i = 0; i < villanos.size(); i++) {
            System.out.println(villanos.get(i));
        }
    }
}