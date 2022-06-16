/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author josed
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un objeto de tipo estudiante presencial
        String nombre = "José";
        String apellido = "Piedra";
        String identificacion = "1104842";
        int edad = 23;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial
        (nombre, apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(15);
        estPresencial.establecerCostoCredito(6);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
