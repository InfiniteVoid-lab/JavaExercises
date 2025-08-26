package NF2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AA3_9 {

	//Escribe un programa que calcule el aumento salarial de un trabajador que cobra 40.000€ anuales en función de sus años de antigüedad, 
	// aplicando distintos porcentajes de incremento según el tiempo trabajado.
	
	public static void main(String[] args) {
		
		int años;
		final int SUELDO =40000;
		double total;
		
		Scanner teclat = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("00");
		
		System.out.println("Cuantos años tienes trabajando cobrando 40.000€");
		años = teclat.nextInt();
		
		//Operacion
		if (años>=10){
			total=1.10;
		}else if (años<=10 && años>=5 ){
			total=1.07;
		}else if(años<=5 && años>=3){
			total=1.05;
		}else{
			total=1.03;
		}
		System.out.println("Nuevo sueldo: "+forma.format(SUELDO*total));
		teclat.close();

	}

}
