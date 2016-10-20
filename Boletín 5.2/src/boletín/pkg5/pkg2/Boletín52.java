package boletín.pkg5.pkg2;

import java.util.Scanner;

/* @author dalonsoperez */
public class Boletín52 {

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner (System.in);
        
        short n1 = numeros.nextShort();
        short n2 = numeros.nextShort();
        
        if(n1>=n2){
            System.out.println("La resta de " + n1 + "y" + n2 + " es igual a " + (n1-n2));
        }
       System.out.println("La suma de " + n1 + "y" + n2 + " es igual a " + n1+n2);
    }
    
}
