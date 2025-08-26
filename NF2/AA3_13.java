package NF2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AA3_13 {

    //Escribe un programa que lea una nota y muestre si el alumno está “apto” o “no apto” en función de si la nota es mayor o igual que 5.

	public static void main(String[] args) {

        Double nota;
        String qualificacio="apte";

        Scanner teclat = new Scanner(System.in);

        DecimalFormat forma = new DecimalFormat("00");

        System.out.println("Que nota has sacado?");
        nota = teclat.nextDouble();

        if (nota>=5 && nota<=10)   {
            System.out.println(qualificacio);
        }
        else {
            qualificacio="no apte";
            System.out.println(qualificacio);
        }
        teclat.close();
    }

}

