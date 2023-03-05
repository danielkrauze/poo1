/*
  Ejercicio propuesto: 
12. Un empleado trabaja 48 horas en la semana a razón de $5000 hora. El porcentaje de retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.
 */
package com.mycompany.poo1;
import javax.swing.JOptionPane; 
/**
 *
 * @author daniel_krauze
 */
public class ejercicio12 {
public static void main(String[] args) { 
//Definimos las variables: 
double horas, valorHora, reteFuente, salarioBruto, retencion, salarioNeto; 
//Pedimos al usuario ingrese los datos: 
horas = Double.parseDouble(JOptionPane.showInputDialog("Digite las horas laboradas del trabajador en la semana: ")); 
valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la hora laborada: ")); 
reteFuente = Double.parseDouble(JOptionPane.showInputDialog("Digite el porcentaje de retención en la fuente: ")); 
salarioBruto = horas*valorHora; 
retencion = salarioBruto*(reteFuente/100); 
salarioNeto = salarioBruto-retencion; 
//A continuación se muestra la salida al usuario:
JOptionPane.showMessageDialog(null, "El salario bruto del trabajador es de: "+salarioBruto+" pesos semanales."); 
JOptionPane.showMessageDialog(null, "La retención del salario bruto del trabajador es: "+retencion+" pesos semanales."); 
JOptionPane.showMessageDialog(null, "El salario neto del trabajador es: "+salarioNeto+" pesos semanales."); 
} 
  
}
