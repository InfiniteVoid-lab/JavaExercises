package NF2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AA3_11 {

	//Escribe un programa que pida una fecha (día, mes y año) y compruebe si es válida teniendo en cuenta la longitud de los meses y los años bisiestos.

	public static void main(String[] args) {

		int dias;
		int mes;
		int año;
		boolean dataOK = false;
		
		Scanner teclat = new Scanner(System.in);
		DecimalFormat forma = new DecimalFormat("00");
		
		System.out.println("Escribe una fecha");
		dias = teclat.nextInt();
		
		System.out.println("Escribe dia del mes");
		mes = teclat.nextInt();
		
		System.out.println("Escribe un año");
		año = teclat.nextInt();
		
		
		if ((dias>=1 && dias <=31) && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12) && (año >= 1900 && año <= 2023))   {
	         dataOK=true;
	        }
	    else if((mes==4 || mes==6 || mes==9 || mes==11)&&(año>= 1900 && año <= 2023)&&(dias >= 1 && dias <= 30)){
	    	 dataOK=true;
	        }
	    else if((mes==2)&&(año >= 1900 && año <= 2023)&&(dias >= 1 && dias <= 29)) {
	    	 dataOK=true;
	    }else {
	    	  
	    }

	    if (dataOK){
	         dataOK=true;
	         System.out.print("Es correcto");
	       }
	   else {
	         dataOK=false;
	         System.out.print("Es incorrecto");
		
		 teclat.close();
	}
  }
}