/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josed
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante tipo EstudiantePresencial por teclado.
        // El usuario decide cuando terminar.
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int terminar = 0;
        String cadena = "";

        do {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String apellido = sc.nextLine();
            System.out.println("Ingrese la identificación del estudiante: ");
            String identificacion = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();
            System.out.println("Ingrese el número de créditos del estudiante: ");
            int numeroCreditos = sc.nextInt();
            System.out.println("Ingrese el costo de cada crédito: ");
            double costoCredito = sc.nextDouble();
            System.out.println("Ingrese 0 para terminar");
            terminar = sc.nextInt();
            sc.nextLine();

            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, numeroCreditos, costoCredito);

            estPresencial.calcularMatriculaPresencial();
            
            cadena = String.format("%s%s\n", cadena, estPresencial);

        } while (terminar != 0);
        
        System.out.println(cadena);
    }
}
