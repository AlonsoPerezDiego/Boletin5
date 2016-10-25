package boletín.pkg5.pkg5;

import javax.swing.JOptionPane;

public class Numeros {
   
    private int n1, n2, n3;

    public Numeros(){
        n1 = 0;
        n2 = 0;
        n3 = 0;
    }

    public Numeros(int nu1, int nu2, int nu3) {
        n1 = nu1;
        n2 = nu2;
        n3 = nu3;
    }
    
    public void setNum(int num1, int num2, int num3){
        n1 = num1;
        n2 = num2;
        n3 = num3;
    }
    
    public void mostrar(){
        
        if(n1>n2){
            if(n2>=n3){
              JOptionPane.showMessageDialog(null, n1 );  
            }
            else{
                if(n1>n3){
                   JOptionPane.showMessageDialog(null, n1 ); 
                }
                else
                    if(n1==n3){
                        JOptionPane.showMessageDialog(null, n1 + "=" + n3 );
                    }
                    else{
                        JOptionPane.showMessageDialog(null, n3 );
                    }
            }
 
        }
        else{
            if (n2>n1){
                if(n1>=n3){
                    JOptionPane.showMessageDialog(null, n2 );
                }
                else{
                    if(n2>n3){
                        JOptionPane.showMessageDialog(null, n2 );
                    }
                    else{
                        if(n2==3){
                            JOptionPane.showMessageDialog(null, n2 + "=" + n3  );
                          
                        }
                        else{
                            JOptionPane.showMessageDialog(null, n3 );
                        } 

                    }
                }
            }
        }
    }
    
}
