/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josed
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un objeto de tipo Estudiante Presencial, pidiendo los datos

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la identificación del estudiante: ");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el número de créditos del estudiante: ");
        int numeroCreditos = entrada.nextInt();
        System.out.println("Ingrese el costo de cada crédito: ");
        double costoCredito = entrada.nextDouble();
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre, 
        apellido, identificacion, edad, numeroCreditos, costoCredito);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
        
    }
}
