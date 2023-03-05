/* Ejercicio propuesto: 
17. Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud de la circunferencia. 
 */
package com.mycompany.poo1;
import javax.swing.JOptionPane;
/**
 *
 * @author daniel_krauze
 */
public class ejercicio17 {
public static void main(String[] args) { 
//Definimos las variables:
double radio, areaCirculo, circunferencia;
//Pedimos al usuario ingrese los datos: 
radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del círculo: ")); 
areaCirculo = (Math.PI)*Math.pow(radio, 2); 
circunferencia = 2*(Math.PI)*radio; 
//A continuación se muestra la salida al usuario: 
JOptionPane.showMessageDialog(null, "El área del círculo de radio "+radio+" es igual a: "+areaCirculo+" unidades cuadradas."); 
JOptionPane.showMessageDialog(null, "La circunferencia del círculo de radio "+radio+" es igual a: "+circunferencia+" unidades de longitud."); 
} 

}
