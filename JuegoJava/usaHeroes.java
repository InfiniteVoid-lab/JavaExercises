package heroes;

import java.util.Scanner;

public class usaHeroes {

	public static void main(String[] args) {

		Heroes1 h = new Heroes1();

		h.crearHeroe("Legolas", 50, 25);
		h.asignarPoder("Legolas", "Tiro rapido", 2, 2);
		h.asignarPoder("Legolas", "Flecha precisa", 3, 3);
		h.asignarPoder("Legolas", "Doble corte", 5, 5);
		h.asignarPoder("Legolas", "Acrobacia elfica", 4, 7);

		h.crearHeroe("Aragorn", 60, 20);
		h.asignarPoder("Aragorn", "Golpe de espada", 2, 2);
		h.asignarPoder("Aragorn", "Ataque de montaraz", 5, 3);
		h.asignarPoder("Aragorn", "Estocada de Isildur", 6, 4);

		h.crearHeroe("Gimli", 70, 25);
		h.asignarPoder("Gimli", "Empujon", 1, 2);
		h.asignarPoder("Gimli", "Hachazo", 3, 3);
		h.asignarPoder("Gimli", "Golpe aplastante", 4, 4);
		h.asignarPoder("Gimli", "Furia Enana", 6, 5);

		h.crearVillano("Goblin", 30, 4, 15);
		h.crearVillano("Orco", 50, 5, 10);
		h.crearVillano("Huargo", 70, 4, 5);
		h.crearVillano("Troll", 120, 5, 5);

		Scanner teclado = new Scanner(System.in);
		int opcion;
		String nameH, nameV;
		int vidaH, vidaV, armaduraH, armaduraV, fuerza;

		do {
			System.out.println("\n=== Menú Principal ===");
			System.out.println("1. Crear Heroe");
			System.out.println("2. Crear Villano");
			System.out.println("3. Batalla");
			System.out.println("4. Mostrar Héroes y Villanos");
			System.out.println("5. Salir");
			System.out.print("Selecciona una opción: ");
			opcion = teclado.nextInt();
			teclado.nextLine(); // Consumir la nueva línea después de nextInt()

			switch (opcion) {
			case 1:
			    System.out.println("Has seleccionado crear un Héroe.");
			    System.out.print("Nombre del Héroe: ");
			    nameH = teclado.nextLine(); 

			    System.out.print("Puntos de Vida: ");
			    vidaH = teclado.nextInt();
			    while (vidaH <= 0) {
			        System.out.print("Ingrese un valor válido para Puntos de Vida: ");
			        vidaH = teclado.nextInt();
			    }
			    teclado.nextLine(); // Consumir la nueva línea

			    System.out.print("Armadura: ");
			    armaduraH = teclado.nextInt();
			    while (armaduraH < 0) {
			        System.out.print("Ingrese un valor válido para la Armadura: ");
			        armaduraH = teclado.nextInt();
			    }
			    teclado.nextLine(); // Consumir la nueva línea

			    h.crearHeroe(nameH, vidaH, armaduraH);

			    // Preguntar cuántos poderes asignar
			    System.out.print("¿Cuántos poderes deseas asignar a " + nameH + "?: ");
			    int numPoderes = teclado.nextInt();
			    teclado.nextLine(); // Consumir la nueva línea

			    // Bucle para asignar los poderes
			    for (int i = 0; i < numPoderes; i++) {
			        System.out.println("Asignando poder " + (i + 1) + " de " + numPoderes + ":");
			        
			        System.out.print("Nombre del Poder: ");
			        String nombrePoder = teclado.nextLine();
			        
			        System.out.print("Fuerza del Poder: ");
			        int fuerzaPoder = teclado.nextInt();
			        while (fuerzaPoder <= 0) {
			            System.out.print("Ingrese un valor válido para la Fuerza del Poder: ");
			            fuerzaPoder = teclado.nextInt();
			        }
			        teclado.nextLine(); // Consumir la nueva línea
			        
			        System.out.print("Duración del Poder (turnos): ");
			        int turnosPoder = teclado.nextInt();
			        while (turnosPoder <= 0) {
			            System.out.print("Ingrese un valor válido para la Duración del Poder: ");
			            turnosPoder = teclado.nextInt();
			        }
			        teclado.nextLine(); // Consumir la nueva línea
			        
			        h.asignarPoder(nameH, nombrePoder, fuerzaPoder, turnosPoder);
			    }
				break;
			case 2:
				System.out.println("Has seleccionado crear un Villano.");
				System.out.print("Nombre del Villano: ");
				nameV = teclado.nextLine(); // Leer el nombre del villano
				System.out.print("Puntos de Vida: ");
				vidaV = teclado.nextInt();
				teclado.nextLine(); // Consumir la nueva línea
				System.out.print("Puntos de Fuerza: ");
				fuerza = teclado.nextInt();
				teclado.nextLine(); // Consumir la nueva línea
				System.out.print("Armadura: ");
				armaduraV = teclado.nextInt();
				teclado.nextLine(); // Consumir la nueva línea
				h.crearVillano(nameV, vidaV, fuerza, armaduraV);
				break;
			case 3:
				System.out.println("Has seleccionado Realizar la batalla.");
				h.batalla();
				break;
			case 4:
				System.out.println("Has seleccionado que te muestre los Héroes y Villanos que tenemos");
				h.mostrarPersonajes();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Por favor, intenta de nuevo.");
			}
		} while (opcion != 5);

		teclado.close(); // Cerrar el Scanner al finalizar
	}
}