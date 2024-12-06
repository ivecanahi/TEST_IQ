package Projects;

public class FuncionesTest {

    public static void calculoTotal() {
        // Llamar el metodo para identificar la respuesta correcta
        // Variables a utilizar
        float totalAciertos = 0.0f;
        float totalMedia = 0.0f;
        float porcentajeTotal = 0.0f;
        float porcentajeIQ = 0.0f; 
        int numeroPreguntas = 90;
        //ACIERTOS TOTALES
        // Asignar una cadena vacia a linea
        String linea = "";
        //Llamar el metodo del valor de total de aciertos 
        totalAciertos = PreguntasTestIQ.identificarRespuestaCorrecta(linea);
        System.out.println("Total de aciertos: " + totalAciertos);

        //MEDIA TOTAL
        totalMedia = totalAciertos / numeroPreguntas;
        System.out.println("La media total de sus aciertos es de: " +totalMedia);

        //PORCENTAJE TOTAL
        porcentajeTotal = (totalAciertos * numeroPreguntas )* 100; 
        System.out.println("Su porcentaje de aciertos es de: "+ porcentajeTotal);

        //DESVIACION ESTANDAR 
        //Formula 
        // 
        float sumaCuadrados = 0.0f; 
        //FALTA EL PUNTAJE DEPENDIENDO DE LOS ACIERTOS 

        //TOTAL IQ 
        //Formula 
        //IQ = (Aciertos - media / desviacion estandar) * 15 + 100
        

    }

}
