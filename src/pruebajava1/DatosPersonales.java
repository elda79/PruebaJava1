/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import javax.swing.JOptionPane;
/******************************************************************************
 *Elda Solar Molina
 * @author LAB05
 * Fecha: 30/10/2017
 * Clase: AreaDeRectangulo
 * Responsabilidad:calcula la edad, da el nombre de una persona mediante ventana
 */
public class DatosPersonales 
{
 public static void main(String[] args)
 {
  String nombre;
  int edad;
   nombre = (JOptionPane.showInputDialog("Digite su nombre"));
   edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
   

 JOptionPane.showMessageDialog(null, "En 20 años Usted tendra: "+(edad+20));
   
  
 }
     
}
