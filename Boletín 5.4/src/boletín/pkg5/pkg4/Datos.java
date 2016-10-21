
package boletín.pkg5.pkg4;

import java.util.Scanner;

public class Datos {
    
    private float masa, masa2;
    
    public Datos(){
    
}
    public Datos(int m, int m2){
        masa = m;
        masa2 = m2;
    }
    
    public void setMasa(){
        
        Scanner peso = new Scanner(System.in);
        System.out.println("Introduce la masa en kg de Manolo (limite 170kg)");
        masa = peso.nextInt();
        System.out.println("Introduce la masa en kg de Pepe (limite 170kg)");
        masa2 = peso.nextInt();
        
        while(masa>=170|masa2>=170){
        System.out.println("Introduce la masa en kg de Manolo otra vez (limite 170kg)");
        masa = peso.nextInt();
        System.out.println("Introduce la masa en kg de Pepe otra vez (limite 170kg)");
        masa2 = peso.nextInt();   
        }
        
    }
    
    public void mostrar(){
        
        if(masa>masa2){
            System.out.println("La diferencia de masa entre Manolo y Pepe es de" + (masa-masa2) + " kg.");
        }
        
        else{
            System.out.println("La diferencia de masa entre Pepe y Manolo es de" + (masa2-masa) + " kg.");
        }
        
    }

}
