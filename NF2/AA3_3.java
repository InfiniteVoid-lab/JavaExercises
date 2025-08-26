package NF2;
import java.util.Scanner;
public class AA3_3 {

    // Escribe un programa que pida tres números enteros y muestre:
    // - El mayor de los tres.
    // - El menor de los tres.
    // (Lee los tres números por teclado y después informa del mayor y del menor.)

    public static void main(String[] args) {

    //Variables
    int num;
    int num2;
    int num3;
    int grande = 0;
    int pequeño = 0;

    //Scanner
    Scanner teclat = new Scanner(System.in);

    //Preguntas
    System.out.println("Numero 1");
    num = teclat.nextInt();
    System.out.println("Numero 2");
    num2 = teclat.nextInt();
    System.out.println("Numero 3");
    num3 = teclat.nextInt();


    //operacion
    if ((num>num2) && (num>num3)){
        System.out.println(""+grande+" El numero mas grande");

    }else{
        System.out.println(""+pequeño+" El numero mas pequeño");

    }
    
    teclat.close();

}
}