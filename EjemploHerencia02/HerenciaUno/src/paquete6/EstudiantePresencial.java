
package paquete6;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;

    public EstudiantePresencial(String n, String ap, String iden, int e, int numCred, double costoCred){
        super(n, ap, iden, e);
        numeroCreditos = numCred;
        costoCredito = costoCred;
    }
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }

    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Número Créditos: %d\n"
                + "Costo Créditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                obtenerApellidoEstudiante(),
                identificacionEstudiante,
                edadEstudiante,
                obtenerNumeroCreditos(),
                obtenerCostoCredito(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }
}
