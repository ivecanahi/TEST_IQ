package Projects;

import java.util.Random;
import java.util.Scanner;

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
        

//Metodo para generar pregunta de manera aleatoria
    public static int generarAleatorio(int min, int max) {
      //Crear un objeto random
        Random random = new Random(); 
        //Se suma 1 y min para que elija entre el rango de numero max y numero min
        return random.nextInt(((max - min) + 1) + min);
        //Retornamos el numero elegido de manera aleatoria
    }
        //Metodo para leer el caracter o respuesta ingresado por el usuario
    public static char readChar(String mensaje) {
        //Crear Scanner
        Scanner scanner = new Scanner(System.in);
        //Se presenta el mensaje
        System.out.println(mensaje);
        char caracter = scanner.next().trim().charAt(0);//elije como indice el primer caracter
        //lee el mensaje, luego ignora los espacios que esten antes y despues de el char ingresado por el usuario
        return Character.toLowerCase(caracter);
        //retorna el char en Mayuscula
    }
}
    


