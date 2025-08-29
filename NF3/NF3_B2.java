package NF3;

import java.util.Random;

public class NF3_B2 {

    public static void main(String[] args) {

        /* Al casino volen fer una estadística de quants cops surt cada número a la ruleta. 
		 * Fer un programa que generi 1000 números aleatoris entre 0 i 36. 
		 * Al final dir quants cops ha sortit cada número.*/
        
        //Abrimos un scanner y una clase random
        Random rdm = new Random(System.currentTimeMillis());

        //Variables
        int[] vNums = new int[37];
        int i;
        int num = 0;

        //Bucle para que salga 1000 veces
        for (i = 0; i < 1000; i++) {
            //Creamos 1000 numeros randoms 
            num = rdm.nextInt(37);
            vNums[num] = vNums[num] + 1;
        }
        for (i = 0; i < vNums.length; i++) {
            System.out.println(i + " ha salido " + vNums[i] + " veces ");
        }

    }

}
