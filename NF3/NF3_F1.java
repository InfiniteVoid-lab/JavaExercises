package NF3;

import java.io.BufferedWriter;//paquete de java.input/output.file
import java.io.File;//buffer
import java.io.FileNotFoundException;//paquete del error
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class NF3_F1 {

	//Escribe un programa que, a partir de un archivo de entrada con números enteros (num.txt), muestre un menú con las siguientes opciones: 
	//(1) visualizar el contenido del fichero de entrada.
	//(2) visualizar el contenido del fichero de salida.
	//(3) generar un fichero de salida (fitxerSortida.txt) donde cada número del fichero de entrada aparezca duplicado.
	//(4) salir. El programa debe leer y escribir usando clases de E/S de ficheros y manejar posibles errores de apertura/lectura/escritura.
	
	public static Scanner teclat = new Scanner(System.in);//Buffer teclat global
		
		//PROCEDIMENT (REP UN STRING Y NO TORNA RES)
		public static void duplicarFitxer(String nomFitxer,String fitxerSortida) {
			int num;
			File fE= new File(nomFitxer);
			PrintWriter pw = null;
			try {
				FileWriter fw =new FileWriter(fitxerSortida,false);
				Scanner fitxer = new Scanner (fE);
				pw = new PrintWriter(new BufferedWriter(fw));
				while(fitxer.hasNextInt()) {
					num=fitxer.nextInt()*2;
					pw.print(num+" ");
				}
				fitxer.close();
			}catch(FileNotFoundException e) {
				System.out.println("Fitxer no trobat");
			}catch(IOException e) {
				System.out.println("ERROR DE ESCRITURA");
			} finally {
				if(pw!= null) {
					pw.close();
				}
			}
		}
		//PROCEDIMENT (REP UN STRING Y NO TORNA RES)
		public static void mostrarFitxer(String nomFitxer) {
			int registre=0;//variable
			File f=new File(nomFitxer);//El archivo donde esta ubicado
			try {//Intenta hacer el programa de adentro, en el caso de que haya un error salta al catch
				Scanner fitxer=new Scanner(f);//conecta el scanner con el fitxero
				while(fitxer.hasNextInt()) {//bucle para mirar si hay una linea dentro del fichero ya que es un boolean
					registre=fitxer.nextInt();//guarda el parrafo dentro de registre
					System.out.print(registre+" ");//muestra la informacion de registre
				}
				fitxer.close();//cierra el fichero
				if (registre==0) {//si dentro del fichero no hay nada significa que el fichero esta vacio
					System.out.print("Fitxer Buit");//muestra el mensaje
				}
			}catch(FileNotFoundException e) {//si no ha encontrado el archivo
				System.out.println("Fitxer no trobat");//muestra mensaje
			}
			System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcio;
		do {
			System.out.println("---Menu---");
			System.out.print("1-Mostrar fitxer de entrada\n 2-Mostrar fitxer de salida \n 3-Duplicar fitxer de sortida \n 4-Salir");
			opcio=teclat.nextInt();
			if(opcio==1) {
				mostrarFitxer("num.txt");
			}else if(opcio==2) {
				mostrarFitxer("fitxerSortida.txt");
			}else if(opcio==3) {
				duplicarFitxer("num.txt","fitxerSortida.txt");
			}
		}while(opcio!=4);
	}

}