package NF3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class A5MenuV3 {

    //Escribe un programa que gestione un menú semanal de platos utilizando ficheros de texto. El programa debe permitir al usuario mediante un menú interactivo:
    //1.Mostrar el contenido de un fichero de platos (primeros, segundos o postres).
    //2.Generar aleatoriamente un menú semanal (7 días con 3 platos diarios) evitando repeticiones y guardarlo en un fichero.
    //3.Cargar un menú guardado previamente desde un fichero y mostrarlo en pantalla.
    //4.Modificar un plato en los ficheros de primeros, segundos o postres, sustituyéndolo por otro indicado por el usuario.
    //5.Salir del programa.

    public static final int MAX = 20, MIN = 1;

    //Mostrar palabras del archivo
    //Procedimiento
    public static void mostrar(String pal) {

        String registre = null;

        File f = new File(pal);
        //Si el archivo no peta cuando intenta abrir el scanner 
        try {

            Scanner fitxer = new Scanner(f);

            while (fitxer.hasNext()) {//Mira que queden registros en el archivo
                registre = fitxer.next();//Lo guarda a la variable registro
                System.out.println(registre);
            }

            //Cierras el archivo
            fitxer.close();

            //Si el archivo esta vacio
            if (registre == null) {
                System.out.println("Archivo vacio");
            }

        } //Si el archivo no es encontrado
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

    }

    //modificar la palabra que quieres al fichero
    //Procedimiento
    public static void modificar(String temp, String fichero, String pal, String pal2) {
        copiar("temp.txt", fichero);//Llamas al metodo copiar 

        String registre = null;
        PrintWriter pw = null;
        File f = new File(temp);

        //Si el archivo no peta cuando intenta abrir el scanner 
        try {

            FileWriter fw = new FileWriter(fichero, false);//Escribes en el archivo, si es false se sobreescribe el archivo o crea uno nuevo
            pw = new PrintWriter(new BufferedWriter(fw));//Escribe el archivo en un Buffered

            //Abres un scanner
            Scanner fitxer = new Scanner(f);//Para leer el archivo de entrada

            while (fitxer.hasNextLine()) {//Mira el archivo
                registre = fitxer.nextLine();//Lo guarda a la variable registro
                if (registre.equalsIgnoreCase(pal)) {//Si no esta el registro printa la palabra
                    pw.println(pal2);
                } else {
                    pw.println(registre);
                }

            }
            fitxer.close();//Cierras el fichero
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {//recull l’excepció del FileWriter
            System.out.println("ERROR d'escriptura");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    //Procedimiento
    //Copias el fichero indicado
    public static void copiar(String temp, String fichero) {
        String registre;//Creas al registro
        PrintWriter pw = null;

        File f = new File(fichero);

        //Si el archivo no peta cuando intenta abrir el scanner 
        try {

            FileWriter fw = new FileWriter(temp, false);//Escribes en el archivo, si es false se sobreescribe el archivo o crea uno nuevo
            pw = new PrintWriter(new BufferedWriter(fw));//Escribe el archivo en un Buffered

            //Abres un scanner
            Scanner fitxer = new Scanner(f);//Para leer el archivo de entrada

            while (fitxer.hasNextLine()) {//Mira el archivo
                registre = fitxer.nextLine();//Lo guarda a la variable registro
                pw.println(registre);//Copias el fichero
            }
            fitxer.close();//Cierras el fichero

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {//recull l’excepció del FileWriter
            System.out.println("ERROR d'escriptura");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    // Muestras la matriz
    // Procedimiento
    public static void mostrar(String[][] m) {
        // Enseñas la matriz
        System.out.print("\t\t\t 1r Plato  \t\t\t2n Plato \t\t\tPostre \n");
        System.out.print("\t\t ________________________________________________________________________________________________ ");
        String[] vDies = {"Lunes  ", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < m.length; i++) {
            System.out.print("\n" + i + " " + vDies[i] + "\t | ");
            for (int j = 0; j < m[3].length; j++) {
                System.out.print(m[i][j] + "\t\t ");
            }
        }
    }

    // Funcion
    // Da una posicion del archivo aleatoriamente
    public static String obtenirPlatAleatori(String fichero, int max, int min) {
        int numeroDeLinea = 1;
        String lineaObtenida = null;
        File f = new File(fichero);
        Random r = new Random();
        String linea;//Registro
        int lineaR;

        lineaR = r.nextInt(MAX - MIN + 1) + MIN;

        try {
            // Abres un scanner
            Scanner fitxer = new Scanner(f); // Para leer el archivo de entrada

            while (fitxer.hasNextLine()) { // mientras no se llegue al final del fichero
                linea = fitxer.nextLine(); // se lee una línea

                if (numeroDeLinea == lineaR) {// Igualas el contador a un numero random
                    lineaObtenida = linea;
                }

                numeroDeLinea++; // se incrementa el contador de líneas
            }

            fitxer.close(); // Cierras el scanner después de utilizarlo
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return lineaObtenida;
    }

    //Funcion
    //Te devuelve un boolean
    public static boolean buscar(String[][] m, String palabra) {//palabra es la palabra que quieres buscar
        int i, j;
        boolean trobat = false;
        for (i = 0; i < m.length && !trobat; i++) {
            for (j = 0; j < m[i].length; j++) {
                if (m[i][j].equals(palabra)) {
                    trobat = true;
                }
            }

        }
        return trobat;
    }

    //Procedimiento
    //Cuando genera el plato lo genera sin repetirse
    public static void generarPlat(String m[][]) {
        int i;
        String plato = null;
        String plato2 = null;
        String plato3 = null;

        for (i = 0; i < m.length; i++) {// Falta el if para no repetir platos
            do { //Obtener un plato aleatorio hasta que no se repita
                plato = obtenirPlatAleatori("Primers.txt", contarPlatos("Primers.txt"), MIN);
            } while (buscar(m, plato));
            m[i][0] = plato;
            do {
                plato2 = obtenirPlatAleatori("Segons.txt", contarPlatos("Segons.txt"), MIN);
            } while (buscar(m, plato2));
            m[i][1] = plato2;
            do {
                plato3 = obtenirPlatAleatori("Postres.txt", contarPlatos("Postres.txt"), MIN);
            } while (buscar(m, plato3));
            m[i][2] = plato3;
        }

    }

    //Funcion
    //Cuenta los platos que tiene el menu
    public static int contarPlatos(String fichero) {

        int numeroDeLinea = 0;
        File f = new File(fichero);

        try {

            Scanner fitxer = new Scanner(f);

            while (fitxer.hasNext()) { //mientras no se llegue al final del fichero
                fichero = fitxer.nextLine();  //se lee una línea
                numeroDeLinea++; //se incrementa el contador de líneas
            }

        } //Si el archivo no es encontrado
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }

        //Devuelve la palabra
        return numeroDeLinea;
    }
    // añade una la matriz al registro de un fichero

    public static String añadirMatriz(String nomFitxer, String matriu[][]) {
        int i = 0;
        try {
            FileWriter fitxer = new FileWriter(nomFitxer, true);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fitxer));
            while (i < matriu.length) {
                pw.print(matriu[i][0] + " ");
                pw.print(matriu[i][1] + " ");
                pw.println(matriu[i][2] + " ");
                i++;
            }
            System.out.println("");
            pw.close();
        } catch (IOException e) {
            System.out.println("ERROR d’escriptura");
        }
        return nomFitxer;
    }

    // Elimina la matriu guardada
    // Procedimiento
    public static void eliminarMatriu(String fichero) {

        String registre = null;
        PrintWriter pw = null;
        File f = new File(fichero);

        // Si el archivo no peta cuando intenta abrir el scanner
        try {

            FileWriter fw = new FileWriter(fichero, false);// Escribes en el archivo, si es false se sobreescribe el
            // archivo o crea uno nuevo
            pw = new PrintWriter(new BufferedWriter(fw));// Escribe el archivo en un Buffered

            // Abres un scanner
            Scanner fitxer = new Scanner(f);// Para leer el archivo de entrada

            while (fitxer.hasNextLine()) {// Mira el archivo
                registre = fitxer.nextLine();// Lo guarda a la variable registro
                if (!registre.equalsIgnoreCase(registre)) {
                    // Este if siempre será falso, porque compara la línea consigo misma.
                    // Probablemente deberías comparar con otro valor o simplemente limpiar el archivo.
                    pw.println(registre);
                }
            }

            fitxer.close();// Cierras el fichero
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {// recull l’excepció del FileWriter
            System.out.println("ERROR d'escriptura");
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    //Procedimiento
    //Copias la matriz indicado
    public static void copiarMatriz(String nomFitxer, String matriu[][]) {
        File archivo = new File(nomFitxer);
        Scanner scanner;
        int i = 0;
        try {
            scanner = new Scanner(archivo);
            while (scanner.hasNextLine() && i < matriu.length) {
                String linea = scanner.nextLine();
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j] = linea;
                    // Esto asigna la misma línea a todas las columnas de la fila.
                    // Lo correcto sería usar: 
                    // String[] partes = linea.split(" ");
                    // y luego matriu[i][j] = partes[j];
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + nomFitxer);
            return;
        }
        scanner.close();
    }

    //Programa principal
    public static void main(String[] args) {

        //Variables
        int menu = 0;
        int guardar = 0;
        int archivo = 0;
        String valor = "";
        String plato, nuevoPlato;
        String[][] m = new String[7][3];
        String[][] m2 = new String[7][1];

        //Llenamos la matriz con valor para poder ejecutar el metodo buscar ya que la matriz esta null por defecto
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = valor;
            }
        }

        //Abrimos un Scanner
        Scanner teclat = new Scanner(System.in);

        //Do while
        do {
            System.out.print("\nMostrar fichero(1)\nGuardar menu semanal(2)\nCargar menu(3)\nModificar plato(4)\nSalir(5)");
            menu = teclat.nextInt();

            //Muestras el fichero
            if (menu == 1) {
                System.out.print("\nDime que archivo quieres mostrar\nPrimers(1)\nSegons(2)\nPostres(3)");
                archivo = teclat.nextInt();

                if (archivo == 1) {
                    mostrar("primers.txt");
                } else if (archivo == 2) {
                    mostrar("segons.txt");
                } else if (archivo == 3) {
                    mostrar("postres.txt");
                }

            }//Guardas el menu semanal
            else if (menu == 2) {
                do {
                    generarPlat(m);
                    mostrar(m);
                    System.out.print("\nQuieres guardar este menu?\nsi(1)\nno(2)");
                    guardar = teclat.nextInt();
                    if (guardar == 1) {
                        eliminarMatriu("matriz.txt");
                        añadirMatriz("matriz.txt", m);
                    }
                } while (guardar == 2);
            }//Cargas el menu en la matriz
            else if (menu == 3) {
                copiarMatriz("matriz.txt", m2);
                mostrar(m2);
            }//Modificas el plato del fichero
            else if (menu == 4) {
                System.out.print("\nDime que archivo quieres modificar\nPrimers(1)\nSegons(2)\nPostres(3)");
                archivo = teclat.nextInt();

                if (archivo == 1) {
					teclat.nextLine();

                    System.out.println("\n\nQue plato del menu quieres cambiar?");
                    plato = teclat.nextLine();
                    System.out.println("\nPor cual plato lo quieres cambiar?");
                    nuevoPlato = teclat.nextLine();

                    modificar("temp.txt", "primers.txt", plato, nuevoPlato);
                } else if (archivo == 2) {
                    System.out.println("\n\nQue plato del menu quieres cambiar?");
                    plato = teclat.nextLine();
                    System.out.println("\nPor cual plato lo quieres cambiar?");
                    nuevoPlato = teclat.nextLine();

                    modificar("temp.txt", "segons.txt", plato, nuevoPlato);
                } else if (archivo == 3) {
                    System.out.println("\n\nQue plato del menu quieres cambiar?");
                    plato = teclat.nextLine();
                    System.out.println("\nPor cual plato lo quieres cambiar?");
                    nuevoPlato = teclat.nextLine();

                    modificar("temp.txt", "postres.txt", plato, nuevoPlato);
                }
            }
        } while (menu != 5);//Mientras el menu no sea igual a 5
    }

}
