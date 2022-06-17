/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author josed
 */
public class EstudiantePresencial extends Estudiante{
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaDistancia;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numCred, double costoCred){
        super(iden, e); // ap = apellido // iden = identificacion // e = edad
        establecerNombresEstudiante(n);
        establecerApellidoEstudiante(ap);
        numeroCreditos = numCred;
        costoCredito = costoCred;
    }
    
    @Override
    public void establecerApellidoEstudiante(String ap){
        apellidosEstudiante = ap.toLowerCase(); // Juan.toLowerCase() >> juan
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoAsignatura(),
                obtenerNumeroAsignaturas(),
                obtenerMatriculaDistancia());
        
        return cadenaFinal;
    }
}
