package NF3;

import java.util.Random;

public class NF3_B7 {

	public static void main(String[] args) {

		//Abrimos un scanner y una clase random
	    Random rdm = new Random(System.currentTimeMillis());

	    //Variables
		int[]vA = new int[5];
	    int i,j;
	    boolean iguals;
    
	    //Randomizas el vector
	    for(i=0;i<vA.length;i++) {
            vA[i]=rdm.nextInt(2);
	    }
	    //mostrar un vector
	    for(i=0;i<vA.length;i++) {
	      	System.out.print(vA[i]+" ");
	    }
	    
    	System.out.println();

	    //
	    for(i=0,j=vA.length-1, iguals=true; i<j && iguals; i++,j--) {
	    	if(vA[i] != vA[j]) {
	    		iguals=false;
	    	}
	    }
	    
	    //Si el iguals es true es capicua y si no es true no es capicua
	    if(iguals) {
        	System.out.println("es capicua");
	    }
	    else {
        	System.out.println("no es capicua");
	    }
	}

}