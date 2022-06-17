/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author josed
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "José";
        String apellido = "Piedra";
        String identificacion = "1104806264";
        int edad = 23;
        int numCreditos = 25;
        double costoCredito = 2.5;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial (nombre, 
                apellido, identificacion, edad, numCreditos, costoCredito);
        
        estPresencial.calcularMatriculaDistancia();
        
        System.out.println(estPresencial);
    }
}
