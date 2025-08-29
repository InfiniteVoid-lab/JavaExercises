package NF3;

import java.util.Scanner;

public class NF3_B14 {

	public static void main(String[] args) {
		
		/*4.	Crear un vector de 12 posicions que contingui els noms dels mesos de l’any.
		Crear un altre vector també de 12 posicions que contingui el nombre de dies de cada mes.
		Demanar a l’usuari un nombre entre 1 i 12 i dir-li el nom del mes i el nombre de dies que té.*/	
		
		
		//Abrimos un Scanner
	    Scanner teclat = new Scanner(System.in);
		
		//declarar y iniciar vector
		int i;
		String[] vMeses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int[] vDias= {31,28,31,30,31,30,31,31,30,31,30,31};
		int num=0;
		int opcion=0;
		
		//Menu
	    System.out.print("Elige una opcion Elegir mes(1),Mostrar todos los meses(2),Salir del menu(3)");
	    opcion = teclat.nextInt();

		if(opcion == 1) {
			
		do {
			//Pedimos un numero del 1 al 12
		
		    System.out.print("Di un numero del 1 al 12");
		    num = teclat.nextInt();
		    
		    //Hacemos un if para que el numero sea el 1 o el 12
			if(num>=1 && num <=12) {
			    System.out.print("El mes es "+ vMeses[num-1] + " y los dias del mes son "+vDias[num-1]);//Enseñamos el mes y los dias que tiene
			}
			else {
				System.out.print("Error ");//Si el numero no es 1 o 12 saldra error
			}
		}while(num < 1 || num > 12); 
		
		}
		else if(opcion == 2) {//Pedimos todos los meses
			
			for(i=0;i<vMeses.length;i++) {
			    System.out.println(" El mes es " + vMeses[i] + " y los dias del mes son " +vDias[i] );//Enseñamos el mes y los dias que tiene
			}

		}
		else if(opcion == 3) {//Para cerrar el programa
			System.out.print("Has salido del menu");
		}		
		//Cerramos teclado
		teclat.close();

	}

}
