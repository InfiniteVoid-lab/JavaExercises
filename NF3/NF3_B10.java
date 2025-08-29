package NF4;

public class NF3_B10 {

	public static void main(String[] args) {
		
		/*Programa Java que llegeixi el nom i el sou de 20 empleats i mostri el nom i el sou de l'empleat que més guanya.*/
		
		//Variables y vectores
		String[] vEmpleados={"Tesi","Nora","Angel","Feison","Uri","Toni","Hugo","Joan","Oriol","Sergio","Jose","Maria","Ruben","Alan","Adri","Iker","Izan","Nil","David","Ricky"};
		int[] vSueldo={482,469,725,1452,3697,1258,3658,1477,654,7502,1258,3698,1258,3698,425,3697,1475,3525,1472,3697};
		int i,j,aux;
		String aux2;


		//Un for para enseñar los sueldos
		for(i=0;i<vEmpleados.length;i++) {
			System.out.println(vEmpleados[i]+" cobra: "+vSueldo[i]);
		}

		//Recorre el vector y lo ordena
        for (i=0; i<vSueldo.length;i++) {
             for(j=i+1; j<vSueldo.length;j++) {
                 if(vSueldo[i]>vSueldo[j]) {
                    aux=vSueldo[i]; //guarda el numero de i en aux
                    vSueldo[i]=vSueldo[j]; //copia el numero de j para guardarlo en i
                    vSueldo[j]=aux; //guarda el numero de aux en j para seguir ordenando
                    aux2=vEmpleados[i]; //hace lo mismo pero con el string del nombre
                    vEmpleados[i]=vEmpleados[j]; 
                    vEmpleados[j]=aux2;
                 }//Cierra el if
             }//Cierra el segundo for
       }//Cierra el primer for
        
     //muestro el usuario que está al final del vector restando uno a la i ya que vale 1 más q el vector
     System.out.println("El Empleat amb el salari més alt es "+vEmpleados[i-1]+" amb "+vSueldo[i-1]+"€");
		
	}

}
