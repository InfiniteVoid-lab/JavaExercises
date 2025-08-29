package NF3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class UF3_F3 {

    //Escribe un programa que gestione un menú semanal (7 días × 3 platos: primero, segundo y postre) a partir de ficheros de texto con listas de platos. 
    //El programa debe: (1) mostrar el contenido de un fichero de platos.
    //(2) generar aleatoriamente un menú semanal sin repetir platos y permitir guardarlo en un fichero.
    //(3) cargar un menú previamente guardado desde fichero y mostrarlo,.
    //(4) modificar un plato en los ficheros de primeros, segundos o postres.
    //(5) salir. El programa debe trabajar con ficheros de texto, manejar errores y evitar repeticiones en el menú generado.
    public static final int MAX = 20, MIN = 1;

    // Mostrar el contenido de un fichero (línea completa)
    public static void mostrar(String nomFitxer) {
        boolean hayDatos = false;
        File f = new File(nomFitxer);
        try (Scanner fitxer = new Scanner(f)) {
            while (fitxer.hasNextLine()) {         // lee línea completa (con espacios)
                String registre = fitxer.nextLine();
                System.out.println(registre);
                hayDatos = true;
            }
            if (!hayDatos) {
                System.out.println("Archivo vacio");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }

    // Modificar una palabra por otra dentro de un fichero
    // Se apoya en el fichero temporal 'temp.txt'

    public static void modificar(String temp, String fichero, String pal, String pal2) {
        copiar(temp, fichero); // Copiamos el fichero original a 'temp'

        File fTemp = new File(temp);
        PrintWriter pw = null;

        try (Scanner fitxer = new Scanner(fTemp)) {
            // Abrimos el fichero original en modo sobrescritura para reescribirlo ya modificado
            FileWriter fw = new FileWriter(fichero, false);
            pw = new PrintWriter(new BufferedWriter(fw));

            while (fitxer.hasNextLine()) {
                String registre = fitxer.nextLine();
                // Si la línea coincide (case-insensitive), escribe la nueva palabra
                if (registre.equalsIgnoreCase(pal)) {
                    pw.println(pal2);
                } else {
                    pw.println(registre);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR d'escriptura");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }


    // Copiar un fichero origen -> temp

    public static void copiar(String temp, String fichero) {
        PrintWriter pw = null;
        File f = new File(fichero);

        try (Scanner fitxer = new Scanner(f)) {
            FileWriter fw = new FileWriter(temp, false);
            pw = new PrintWriter(new BufferedWriter(fw));

            while (fitxer.hasNextLine()) {
                String registre = fitxer.nextLine();
                pw.println(registre);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("ERROR d'escriptura");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }


    // Mostrar una matriz de menú (7 x 3)

    public static void mostrar(String[][] m) {
        System.out.print("\t\t\t 1r Plato  \t\t\t2n Plato \t\t\tPostre \n");
        System.out.print(
                "\t\t ________________________________________________________________________________________________ ");
        String[] vDies = {"Lunes  ", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < m.length; i++) {
            System.out.print("\n" + i + " " + vDies[i] + "\t | ");
            for (int j = 0; j < m[i].length; j++) { // <- no usar m[3].length
                System.out.print(m[i][j] + "\t\t ");
            }
        }
        System.out.println();
    }


    // Obtener una línea aleatoria de un fichero (entre min..max, ambos inclusives)
    // max debe ser el número de líneas del fichero (contarPlatos)

    public static String obtenirPlatAleatori(String fichero, int max, int min) {
        if (max < min) {
            return null; // defensa

                }int lineaR = new Random().nextInt(max - min + 1) + min; // usar parámetros min/max

        int numeroDeLinea = 1;
        String lineaObtenida = null;
        File f = new File(fichero);

        try (Scanner fitxer = new Scanner(f)) {
            while (fitxer.hasNextLine()) {
                String linea = fitxer.nextLine();
                if (numeroDeLinea == lineaR) {
                    lineaObtenida = linea;
                    break;
                }
                numeroDeLinea++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return lineaObtenida;
    }


    // Buscar una palabra dentro de la matriz generada (evitar repetidos)

    public static boolean buscar(String[][] m, String palabra) {
        if (palabra == null) {
            return false;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (palabra.equals(m[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }


    // Generar menú semanal sin repeticiones (7 x 3)

    public static void generarPlat(String m[][]) {
        for (int i = 0; i < m.length; i++) {
            String plato, plato2, plato3;

            // Primero
            do {
                plato = obtenirPlatAleatori("Primers.txt", contarPlatos("Primers.txt"), 1);
            } while (buscar(m, plato));
            m[i][0] = plato;

            // Segundo
            do {
                plato2 = obtenirPlatAleatori("Segons.txt", contarPlatos("Segons.txt"), 1);
            } while (buscar(m, plato2));
            m[i][1] = plato2;

            // Postre
            do {
                plato3 = obtenirPlatAleatori("Postres.txt", contarPlatos("Postres.txt"), 1);
            } while (buscar(m, plato3));
            m[i][2] = plato3;
        }
    }


    // Contar líneas (platos) de un fichero

    public static int contarPlatos(String fichero) {
        int numeroDeLinea = 0;
        File f = new File(fichero);
        try (Scanner fitxer = new Scanner(f)) {
            while (fitxer.hasNextLine()) {
                fitxer.nextLine();
                numeroDeLinea++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return numeroDeLinea;
    }


    // Añadir una matriz 7x3 al final de un fichero (una línea por día)

    public static String añadirMatriz(String nomFitxer, String matriu[][]) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nomFitxer, true)))) {
            for (int i = 0; i < matriu.length; i++) {
                // Formato: "primero segundo postre"
                String c0 = (matriu[i][0] == null ? "" : matriu[i][0]);
                String c1 = (matriu[i][1] == null ? "" : matriu[i][1]);
                String c2 = (matriu[i][2] == null ? "" : matriu[i][2]);
                pw.println(c0 + " " + c1 + " " + c2);
            }
            System.out.println("Menú guardado en: " + nomFitxer);
        } catch (IOException e) {
            System.out.println("ERROR d’escriptura");
        }
        return nomFitxer;
    }


    // Eliminar (vaciar) la matriz guardada en un fichero

    public static void eliminarMatriu(String fichero) {
        // Para vaciar basta con abrir en modo sobrescritura y no escribir nada
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fichero, false)))) {
            // No escribimos nada -> fichero vacío
        } catch (IOException e) {
            System.out.println("ERROR d'escriptura");
        }
    }


    // Cargar una matriz desde fichero: cada línea "p0 p1 p2"

    public static void copiarMatriz(String nomFitxer, String matriu[][]) {
        File archivo = new File(nomFitxer);
        try (Scanner scanner = new Scanner(archivo)) {
            int i = 0;
            while (scanner.hasNextLine() && i < matriu.length) {
                String linea = scanner.nextLine().trim();
                String[] partes = linea.split("\\s+"); // separa por espacios
                for (int j = 0; j < matriu[i].length && j < partes.length; j++) {
                    matriu[i][j] = partes[j];
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nomFitxer);
        }
    }


    // Programa principal (menú)

    public static void main(String[] args) {

        int menu = 0;
        int guardar = 0;
        int archivo = 0;

        // Matriz del menú (7 días x 3 platos)
        String[][] m = new String[7][3];
        String[][] m2 = new String[7][3]; // <- 3 columnas para cargar correctamente

        // Inicializar a cadenas vacías para evitar null en imprimir/buscar
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = "";
                m2[i][j] = "";
            }
        }

        Scanner teclat = new Scanner(System.in);

        do {
            System.out.print(
                    "\nMostrar fichero(1)\nGuardar menu semanal(2)\nCargar menu(3)\nModificar plato(4)\nSalir(5)\n> ");
            while (!teclat.hasNextInt()) {
                System.out.print("Introduce un número válido: ");
                teclat.nextLine();
            }
            menu = teclat.nextInt();

            if (menu == 1) {
                System.out.print("\nDime que archivo quieres mostrar\nPrimers(1)\nSegons(2)\nPostres(3)\n> ");
                while (!teclat.hasNextInt()) {
                    System.out.print("Introduce un número válido: ");
                    teclat.nextLine();
                }
                archivo = teclat.nextInt();

                if (archivo == 1) {
                    mostrar("Primers.txt");
                } else if (archivo == 2) {
                    mostrar("Segons.txt");
                } else if (archivo == 3) {
                    mostrar("Postres.txt");
                } else {
                    System.out.println("Opción no válida");
                }

            } else if (menu == 2) { // Guardar menú semanal
                do {
                    generarPlat(m);
                    mostrar(m);
                    System.out.print("\n¿Quieres guardar este menú?\nsi(1)\nno(2)\n> ");
                    while (!teclat.hasNextInt()) {
                        System.out.print("Introduce un número válido: ");
                        teclat.nextLine();
                    }
                    guardar = teclat.nextInt();
                    if (guardar == 1) {
                        eliminarMatriu("matriz.txt");
                        añadirMatriz("matriz.txt", m);
                    }
                } while (guardar == 2);

            } else if (menu == 3) { // Cargar menú desde fichero y mostrar
                copiarMatriz("matriz.txt", m2);
                mostrar(m2);

            } else if (menu == 4) { // Modificar plato en fichero
                System.out.print("\nDime que archivo quieres modificar\nPrimers(1)\nSegons(2)\nPostres(3)\n> ");
                while (!teclat.hasNextInt()) {
                    System.out.print("Introduce un número válido: ");
                    teclat.nextLine();
                }
                archivo = teclat.nextInt();

                if (archivo == 1) {
                    teclat.nextLine(); // consumir salto pendiente
                    System.out.println("\n\n¿Qué plato del fichero quieres cambiar?");
                    String plato = teclat.nextLine();
                    System.out.println("¿Por cuál plato lo quieres cambiar?");
                    String nuevoPlato = teclat.nextLine();
                    modificar("temp.txt", "Primers.txt", plato, nuevoPlato);

                } else if (archivo == 2) {
                    teclat.nextLine(); // consumir salto pendiente
                    System.out.println("\n\n¿Qué plato del fichero quieres cambiar?");
                    String plato = teclat.nextLine();
                    System.out.println("¿Por cuál plato lo quieres cambiar?");
                    String nuevoPlato = teclat.nextLine();
                    modificar("temp.txt", "Segons.txt", plato, nuevoPlato);

                } else if (archivo == 3) {
                    teclat.nextLine(); // consumir salto pendiente
                    System.out.println("\n\n¿Qué plato del fichero quieres cambiar?");
                    String plato = teclat.nextLine();
                    System.out.println("¿Por cuál plato lo quieres cambiar?");
                    String nuevoPlato = teclat.nextLine();
                    modificar("temp.txt", "Postres.txt", plato, nuevoPlato);

                } else {
                    System.out.println("Opción no válida");
                }

            } else if (menu == 5) {
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opción no válida");
            }

        } while (menu != 5);

        teclat.close();
    }
}
