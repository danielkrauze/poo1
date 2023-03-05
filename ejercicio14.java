/* Ejercicio propuesto 14: Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo. 
*/ 
package com.mycompany.poo1;
import javax.swing.JOptionPane;
/**
 *
 * @author daniel_krauze
 */
public class ejercicio14 {
public static void main(String[] args) { 
//Definimos las variables: 
double numero, cuadrado, cubo; 
//Pedimos al usuario ingresar el número que desee: 
numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un número al que desee conocer su cuadrado y su cubo: ")); 
cuadrado = Math.pow(numero, 2); 
cubo = Math.pow(numero, 3); 
//A continuación se muestra la salida al usuario: 
JOptionPane.showMessageDialog(null, "El cuadrado del número ingresado es: "+cuadrado); 
JOptionPane.showMessageDialog(null, "El cubo del número ingresado es: "+cubo); 
} 
  
}
