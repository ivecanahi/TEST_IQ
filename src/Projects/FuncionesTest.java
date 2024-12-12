package Projects;

import java.util.Random;
import java.util.Scanner;

public class FuncionesTest {
//Sirve para calcular los aciertos dependiendo de las preguntas y respuestas
    public static int calculoAciertos(int dificultad, int min, int max, int cantidadPreguntas, String[] lineas) {
        // Variables que almacenará aciertos
        int aciertos = 0; //----> Almacena aciertos
        char respuesta; //----> Respuesta ingresada por el ususario
        PreguntasTestIQ gestion; //-----> //Objeto para gestionar la pregunta 
        String pregunta; //----> Pregunta que se irá actualizando conformemente 
        String[] literales; //----> Opciones de respuesta con arreglos
        //Bucle que se ejecutará desde 0 hasta la cantidad de preguntas 
        for (int i = 0; i < cantidadPreguntas; i++) {
            gestion = new PreguntasTestIQ(lineas[i]); //----> Objeto basado en linea actual
            pregunta = gestion.getPregunta(); //-----> Obtiene la pregunta del objeto gestión anteriormente creado
            literales = gestion.getRespuestas(); //----> Obtiene opciones de respuesta del objeto gestión
            
            //Inicializar un bucle para mostrar la pregunta y las opciones de respuesta, leer la respuesta ingresada por el usuario hasta que sea válida
            do {
                System.out.println(pregunta); //----> Imprime la pregunta
                for (int j = 0; j < literales.length; j++) {
                    System.out.println(literales[j]); //-----> Imprime opciones
                }
                respuesta = readChar("Ingrese su respuesta (a, b, c, d): "); //----> Lee la respuesta del usuario
                //Se repite si la respuesta no es válida
            } while (!respuestaValida(respuesta));
                //Verifica si la respuesta es correcta
            if (respuesta == literalCorrecto(gestion.getRespuestaCorrecta())) {
                aciertos += dificultad; //----> acumula puntos
            }
        }
        // Devuelve el total de aciertos obtenidos
        return aciertos;
    }
    //Resumen del test 
    public static void resumenTest(int totalAciertos, int numeroPreguntas) {
        //Cálculo de Media 
        float totalMedia;
        totalMedia = (float) totalAciertos / numeroPreguntas;
        System.out.println("La media total de sus aciertos es de: " + totalMedia);

        // Cálculo Porcentaje 
        float porcentajeTotal = (float) (totalAciertos * 100) / (numeroPreguntas);
        System.out.println("Su porcentaje de aciertos es de: " + porcentajeTotal);
    }
    //Método para verificar si la respuesta es válida 
    public static boolean respuestaValida(char respuesta) {
        if (respuesta == 'a' || respuesta == 'b' || respuesta == 'c' || respuesta == 'd') {
            return true;
        } else {
            return false;
        }
    }
//Método para transformar el índice de la respuesta que es correcta al literal que le corresponde 
    public static char literalCorrecto(int i) {
        switch (i) {
            case 1: 
                return 'a';
            case 2:
                return 'b';
            case 3:
                return 'c';
            case 4:
                return 'd';
            default: 
                return ' ';
        }
    }

    // Metodo para generar pregunta de manera aleatoria entre min y max 
    public static int generarAleatorio(int min, int max) {
        // Crear un objeto random
        Random random = new Random();
        // Se suma 1 y min para que elija entre el rango de numero max y numero min
        return random.nextInt(((max - min) + 1) + min);
        // Retornamos el numero elegido de manera aleatoria
    }

    // Metodo para leer el caracter o respuesta ingresado por el usuario
    public static char readChar(String mensaje) {
        // Crear Scanner
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        // Se presenta el mensaje
        System.out.println(mensaje);
        char caracter = scanner.next().trim().charAt(0);// elije como indice el primer caracter
        // lee el mensaje, luego ignora los espacios que esten antes y despues de el
        // char ingresado por el usuario
        return Character.toLowerCase(caracter);
        // retorna el char en Mayuscula
    }

    // funcion de desviacion estandar
    public static double desviacionEstandar(double[] datos) {
        int n = datos.length;
        if (n == 0)
            return 0; // Evitar división por cero
        // Calcular el promedio (media)
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        double promedio = suma / n;

        // Calcular la suma de las diferencias al cuadrado
        double sumaDiferencias = 0;
        for (double dato : datos) {
            sumaDiferencias += Math.pow(dato - promedio, 2);
        }
        // Calcular la desviación estándar
        return Math.sqrt(sumaDiferencias / n);
    }

}
