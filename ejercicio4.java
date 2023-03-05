/* Ejercicio propuesto: A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro. 
*/ 
 
package com.mycompany.poo1;
import javax.swing.JOptionPane; 

/**
 *
 * @author daniel_krauze
 */
public class ejercicio4 {
public static void main(String[] args) { 
//Definimos las variables:
int edadJuan, edadAlberto, edadAna, edadMama; 
//Pedimos al usuario ingrese los datos:
edadJuan = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de Juan-La cual debe ser un múltiplo de 3-: ")); 
edadAlberto = (2*edadJuan)/3; 
edadAna = (4*edadJuan)/3; 
edadMama = edadJuan+edadAlberto+edadAna; 
//A continución se muestra la salida al usuario:
JOptionPane.showMessageDialog(null, "La edad de Juan es "+edadJuan+" años, la edad de Alberto es "+edadAlberto+" años, la edad de Ana es "+edadAna+" años y la edad de la mamá es "+edadMama+" años."); 
} 
    
}
