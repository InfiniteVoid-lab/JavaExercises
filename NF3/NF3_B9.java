package NF3;

import java.util.*;


public class NF3_B9 {

	public static void main(String[] args) {

		/*Crea un array de 20 nombres enters; omple’l amb nombres aleatoris entre 1 i 100. Ordena el vector en ordre ascendent.*/
		
		//Abrimos un Scanner
		 Random rdm = new Random(System.currentTimeMillis());

		//Variables y vectores
		int[] vNum = new int[20];
		int i,j;
		int aux = 0;
		
		//Haces un for para randomizar el vector
		for(i=0;i<vNum.length;i++) {			
		vNum[i] = rdm.nextInt(100)+1;
		}

		//Recorres el vector y lo ordena de menor a major
		for(i=0;i<vNum.length;i++) {			
			for(j=i+1;j<vNum.length;j++) {
				if(vNum[i] > vNum[j]) {
					aux=vNum[i];//En la variable aux guardas la información de i
					vNum[i]=vNum[j];//Copias la información de i a j
					vNum[j]=aux;
				}
			}
		}
		
		//Haces for para enseñar la información del vector
		for(i=0;i<vNum.length;i++) {			
        System.out.println(vNum[i]);
		}
	}
}
