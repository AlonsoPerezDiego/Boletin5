package boletín.pkg5.pkg3;

import java.util.Scanner;

public class Número {
    
    private int n;
    
    public Número(){
        n = 0;
    }
    
    public Número(int num){
        n = num;
    }
    
    public void setN(){
      Scanner numero = new Scanner(System.in);
      n = numero.nextInt();
    }
    
    public void mostrar (){
        if(n>0){
            System.out.println("+");
        }
        
        else if(n==0){
                System.out.println("0");
            }
            else{
                System.out.println("-");
            }
        
        
    }

}

