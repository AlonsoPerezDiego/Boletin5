package boletín.pkg5.pkg5;

import javax.swing.JOptionPane;
/**@author dalonsoperez */
public class Boletín55 {

    public static void main(String[] args) {
                
        Numeros num = new Numeros();

        num.setNum(Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número")), Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número")), Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número")));
        num.mostrar();
    }
    
}
