package NF3;

public class NF3_B3 {

	// Escribe un programa que almacene en un array los 20 primeros números pares y los muestre por pantalla junto con su posición en el vector.

	public static void main(String[] args) {
		
		/*Guardar en un array els 20 primers nombres parells.*/
		//Variables
		int[] vNums= new int[20];
		int i;
		
		//Haces un bucle y multiplicas la posicion por 2
		for(i=0;i<vNums.length;i++) {			
			vNums[i]=(i+1)*2;
			System.out.println(i+" a salido " +vNums[i]);
		}	
	}
}
