/*
 *Hacer un seguimiento (prueba de escritorio) del
siguiente grupo de instrucciones.
Incio
    SUMA = 0
    X = 20
    SUMA = SUMA + X
    Y = 40
    X = X + Y**2
    SUMA = SUMA + X/Y
    ESCRIBA: "EL VALOR DE LA SUMA ES:", SUMA
FIN_INICIO
 */
package com.mycompany.poo1;
import javax.swing.JOptionPane;
/**
 *
 * @author daniel_krauze
 */
public class ejercicio5 {
    
    public static void main(String[] args){
        //Definimos las variables del problema:
        double suma, x, y;
        suma = 0;
        //Solicitamos al usuario que ingrese dos números:
        x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor para x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor para y: "));
        
        //Ahora desarrollamos el algoritmo:
        suma = suma + x;
        x = x + Math.pow(y,2);
        suma = suma + x/y;
        
        //Mostramos el valor de la suma por pantalla:
        JOptionPane.showMessageDialog(null, "El valor de la suma es: "+suma);
        
    }
     
}
