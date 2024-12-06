package View;
import Projects.FuncionesTest;
import Projects.PreguntasTestIQ;

public class Main {
    public static void main(String[] args) {

        //Direccion de los archivos por cada tema 
        String rutaRazonamientoLogico = "Test_IQ/src/Extras/PreguntasRazonamientoLogico.txt";
        String rutaHabilidadResolucionProblemas = "Test_IQ/src/Extras/PreguntasHabilidadesResolucionProblemas.txt";
        //String TEMAS QUE FALTAN 


         //Presentar y Ejecutar las preguntas 
        System.out.println("Preguntas de Razonamiento Lógico");
        System.out.println("");
        PreguntasTestIQ.ejecutarPreguntasDesdeArchivo(rutaRazonamientoLogico);
        System.out.println("");
        System.out.println("Preguntas de Habilidad de Resolución de Problemas");
        PreguntasTestIQ.ejecutarPreguntasDesdeArchivo(rutaHabilidadResolucionProblemas);
        //FALTA DEMAS ARCHIVOS 

//EJECUTAR FUNCIONES
        FuncionesTest funcionesTest = new FuncionesTest();
        
    }
}
