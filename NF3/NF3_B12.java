package NF3;

import java.util.Scanner;

public class NF3_B12 {

	public static void main(String[] args) {

		/*Programa per inserir 5 números en un vector A, còpia en un vector B totes les dades parells del vector A,
		i posteriorment es visualitzen les dades del vector B*/
		
		//Abrimos un Scanner
		Scanner teclat = new Scanner(System.in);
		 
		//Variables y vectores
		int[] vNum = new int[5];
		int[] vNum2 = new int[5];
		int i,j;
		
		//Recorres el vector y guardas los datos dentro del vector
		for(i=0;i<vNum.length;i++) {			
			System.out.println("Pon 5 numeros que no sea 0:");
			vNum[i] = teclat.nextInt();
			while(vNum[i] == 0) {
				System.out.println("Eres bobo y has puesto 0");
			}
        }
        
		//Con este for coges los datos guardados del vector y si son pares se copian en el vector B
		for(i=0,j=0;i<vNum2.length;i++) {	
    		if(vNum[i] % 2 == 0) {
    			vNum2[j] = vNum[i];
    			j++;
    		}
		}
		
		//Haces un for para enseñar el contenido del vector B
		for(j=0;j<vNum2.length;j++) {
			System.out.println("Los numeros pares son : "+vNum2[j]);
		}
	
	}
	
	
}
		
		
		
		
		
	


