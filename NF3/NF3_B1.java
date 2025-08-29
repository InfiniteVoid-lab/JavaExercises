package NF3;

public class NF3_B1 {

	//Escribe un programa que cree un vector con los nombres de los días de la semana y los muestre por pantalla numerados del 1 al 7.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar y iniciar vector
		int i;
		String[] vSemana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		 
		//Muestras el contenido del vector
		for(i=0;i<vSemana.length;i++) {
	        System.out.print("Dia "+(i+1)+":"+vSemana[i]+" \n");
		}
		
	}

}
