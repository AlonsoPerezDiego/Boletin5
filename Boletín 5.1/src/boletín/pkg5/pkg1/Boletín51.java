package boletín.pkg5.pkg1;

import java.util.Scanner;
/* @author dalonsoperez */
public class Boletín51 {
    
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        int num = numero.nextInt();
        
        if(num>0){
            
            System.out.println(num + " es positivo.");
        }
        
        System.out.println("Adios.");
        
    }
    
}
