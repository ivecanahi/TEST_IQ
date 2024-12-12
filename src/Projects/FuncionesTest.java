package Projects;

import java.util.Random;
import java.util.Scanner;

public class FuncionesTest {

    public static int calculoAciertos(int dificultad, int min, int max, int cantidadPreguntas, String[] lineas) {
        // Variables que almacenará aciertos
        int aciertos = 0;
        char respuesta;
        PreguntasTestIQ gestion;
        String pregunta;
        String[] literales;
        for (int i = 0; i < cantidadPreguntas; i++) {
            gestion = new PreguntasTestIQ(lineas[i]);
            pregunta = gestion.getPregunta();
            literales = gestion.getRespuestas();
            do {
                System.out.println(pregunta);
                for (int j = 0; j < literales.length; j++) {
                    System.out.println(literales[j]);
                }
                respuesta = readChar("Ingrese su respuesta (a, b, c, d): ");
            } while (!respuestaValida(respuesta));

            if (respuesta == literalCorrecto(gestion.getRespuestaCorrecta())) {
                aciertos += dificultad;
            }
        }
        // MEDIA TOTAL
        return aciertos;
    }

    public static void resumenTest(int totalAciertos, int numeroPreguntas) {
        float totalMedia;
        totalMedia = (float) totalAciertos / numeroPreguntas;
        System.out.println("La media total de sus aciertos es de: " + totalMedia);

        // PORCENTAJE TOTAL
        float porcentajeTotal = (float) (totalAciertos * 100) / (numeroPreguntas);
        System.out.println("Su porcentaje de aciertos es de: " + porcentajeTotal);
    }

    public static boolean respuestaValida(char respuesta) {
        if (respuesta == 'a' || respuesta == 'b' || respuesta == 'c' || respuesta == 'd') {
            return true;
        } else {
            return false;
        }
    }

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

    // Metodo para generar pregunta de manera aleatoria
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
